package defpackage;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import androidx.datastore.preferences.core.PreferenceDataStoreFactory;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.behaviour.policy.ResolveSupportPolicyUseCase;
import app.chalo.ble_communication.feature.bluetoothsystem.BluetoothPermissionAndSystemFeature;
import app.chalo.bookingsuccess.BookingSuccessComponent;
import app.chalo.bookingsuccess.BookingSuccessFlowDelegate;
import app.chalo.bookingsuccess.BulkBookingAcknowledgementDelegate;
import app.chalo.bookingsuccess.DefaultBookingSuccessFlowDelegate;
import app.chalo.contract.BasicInfoContract;
import app.chalo.contract.ProductsSyncContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.datastore.LocalDataStore;
import app.chalo.domain.GetCurrentCityPhoneNumberConfigUseCase;
import app.chalo.domain.ProductPurchaseMinProfileDecisionHelper;
import app.chalo.domain.ResolveProductPurchaseMinProfileDecisionUseCase;
import app.chalo.domain.ValidatePhoneNumberUseCase;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.config.datastore.ProductBookingDataStore;
import app.chalo.instantticket.config.datastore.ProductBookingDataStoreImpl;
import app.chalo.instantticket.domain.CreateInstantTicketOrderUseCase;
import app.chalo.instantticket.domain.FetchMobileTicketFareUseCase;
import app.chalo.instantticket.domain.ValidateInstantTicketFareUseCase;
import app.chalo.instantticket.ui.faredetails.FareDetailsComponent;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.ondc.domain.CompleteOndcPurchaseAndStoreTicketUseCase;
import app.chalo.ondc.domain.CreateOndcBookingUseCase;
import app.chalo.ondc.domain.CreateOndcOrderUseCase;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.premiumbus.data.PassUpsellPurchaseWrapper;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapperImpl;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.domain.CheckAndShowPassPurchaseNudgeCard;
import app.chalo.premiumbus.domain.CreatePremiumReserveTicketOrderUseCase;
import app.chalo.premiumbus.domain.FetchPBODPairsForGivenLocationsUseCase;
import app.chalo.premiumbus.domain.FetchPremiumBusBookingAvailablePurchaseOptionsUseCase;
import app.chalo.premiumbus.domain.GetPremiumReserveTicketByIdUseCase;
import app.chalo.premiumbus.domain.GetRecentAndFlippedOriginDestinationPairsUseCase;
import app.chalo.premiumbus.domain.ReserveSeatThroughPassUseCase;
import app.chalo.premiumbus.domain.SlotSelectionSectionInfoManager;
import app.chalo.premiumbus.domain.TriggerPremiumBusBookingBookingEventsUseCase;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.premiumbus.helper.PremiumBusBulkBookingHelper;
import app.chalo.premiumbus.managers.PremiumBusBookingNavigationHelper;
import app.chalo.premiumbus.managers.PremiumBusPurchaseInfoManager;
import app.chalo.premiumbus.managers.SlotSelectionResultStateManager;
import app.chalo.premiumbus.ui.faredetails.DefaultPremiumBusFareDetailsDelegateResolver;
import app.chalo.premiumbus.ui.faredetails.FreshPurchaseDelegate;
import app.chalo.premiumbus.ui.faredetails.LifecycleStartedActionRunner;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsComponent;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsDelegateResolver;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsFlowType;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsStartedActionRunner;
import app.chalo.premiumbus.ui.faredetails.PremiumBusFareDetailsUiStateFactory;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseThroughPassDelegate;
import app.chalo.premiumbus.ui.faredetails.TicketPurchaseWithPassUpsellNudgeDelegate;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionComponent;
import app.chalo.premiumbus.ui.slotselection.SlotSelectionScreenUiStateFactory;
import app.chalo.premiumbus.ui.stopselection.PremiumBusStopSelectionComponent;
import app.chalo.productbooking.common.domain.FetchAvailableSlotsForPreBookingUseCase;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdUseCase;
import app.chalo.productbooking.common.domain.FetchCompleteProductConfigByIdWithLocalCacheUseCase;
import app.chalo.productbooking.common.domain.FetchProductConfigsForUiUseCase;
import app.chalo.productbooking.common.domain.GetCompleteProductConfigFromLocalCacheUseCase;
import app.chalo.productbooking.common.domain.StoreCompleteProductConfigLocallyUseCase;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.quickpay.validation.manager.QuickPayValidationData;
import app.chalo.resultstatemanager.DecomposeResultStateDataCollector;
import app.chalo.resultstatemanager.checkout.CheckoutResultStateManager;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResultStateManager;
import app.chalo.resultstatemanager.universalsearch.UniversalSearchResultStateManager;
import app.chalo.ridefeedbacktracker.ChaloRideFeedbackCollectionHelper;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.BookingSuccessArgs;
import app.chalo.scenes.args.FareDetailsArgs;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.PremiumBusFareDetailsArgs;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.security.encryption.utils.KeyEncrypter;
import app.chalo.security.encryption.utils.KeyStoreUtilsAndroid;
import app.chalo.security.encryption.utils.VaultEncryptionKeyUtils;
import app.chalo.usecase.ArePermissionsGrantedUseCase;
import app.chalo.usecase.CheckIsUserLoggedInUseCase;
import app.chalo.usecase.FetchCurrentLocationUseCase;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.usecase.GetPremiumBusCurrentCityConfigUseCase;
import app.chalo.usecase.GetRideFeedbackDataUseCase;
import app.chalo.usecase.GetTimeInMillisAfterXTimeUseCase;
import app.chalo.utils.DataStorePathHelper;
import app.chalo.utils.SystemHelper;
import app.chalo.utils.resources.GetRemoteResourcesUrlConfigUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.data.local.ProductValidationsDataStoreImpl;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.configuration.GetRegularBusProductValidationMethodUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetRegularBusBLEValidationPayloadUseCase;
import app.chalo.validationsdk.blevalidation.domain.validationprocess.GetTitoTapOutBlePayloadUseCase;
import app.chalo.validationsdk.blevalidation.helper.BleValidationDynamicInfoHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationPrerequisitesStateHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationProcessCompletionHelper;
import app.chalo.validationsdk.blevalidation.helper.BleValidationWithTwoWayPilotHelper;
import app.chalo.validationsdk.blevalidation.helper.GetTwoWayBleCommPilotConfigUseCase;
import app.chalo.validationsdk.blevalidation.nfc.DeviceNfcTapPaySuppressorProvider;
import app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid;
import app.chalo.wallet.domain.GetWalletTransactionSummaryUseCase;
import app.chalo.wallet.ui.access.WalletAccessManagerImpl;
import app.chalo.walletframework.di.LazyWalletSettings;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStoreImpl;
import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefsSettings;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.GetWalletAppReclaimCompletionTimeUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithReclaimTimeUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.RegisterAndSyncClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase;
import app.chalo.walletframework.wallet.domain.WalletAutoReclaimUseCase;
import com.arkivanov.decompose.ComponentContext;
import com.arkivanov.essenty.lifecycle.Lifecycle;
import com.russhwolf.settings.Settings;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.koin.android.ext.koin.ModuleExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d81 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15437a;

    public /* synthetic */ d81(int i) {
        this.f15437a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        BookingSuccessFlowDelegate bookingSuccessFlowDelegate;
        switch (this.f15437a) {
            case 0:
                Scope scope = (Scope) obj;
                return new FareDetailsComponent((FareDetailsArgs) scope.d(i71.k(scope, "$this$factory", (ParametersHolder) obj2, "it", FareDetailsArgs.class), null, null), (ComponentContext) scope.d(Reflection.a(ComponentContext.class), null, null), (FetchMobileTicketFareUseCase) scope.d(Reflection.a(FetchMobileTicketFareUseCase.class), null, null), (ValidateInstantTicketFareUseCase) scope.d(Reflection.a(ValidateInstantTicketFareUseCase.class), null, null), (StringProvider) scope.d(Reflection.a(StringProvider.class), null, null), (CurrencyFeature) scope.d(Reflection.a(CurrencyFeature.class), null, null), (ProductBookingDataStore) scope.d(Reflection.a(ProductBookingDataStore.class), null, null), (CreateInstantTicketOrderUseCase) scope.d(Reflection.a(CreateInstantTicketOrderUseCase.class), null, null), (AnalyticsContract) scope.d(Reflection.a(AnalyticsContract.class), null, null), (CheckIsUserLoggedInUseCase) scope.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), (TimeUtilsContract) scope.d(Reflection.a(TimeUtilsContract.class), null, null), (UserProfileDetailsProvider) scope.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (CreateOndcBookingUseCase) scope.d(Reflection.a(CreateOndcBookingUseCase.class), null, null), (CreateOndcOrderUseCase) scope.d(Reflection.a(CreateOndcOrderUseCase.class), null, null), (GetCurrentCityPhoneNumberConfigUseCase) scope.d(Reflection.a(GetCurrentCityPhoneNumberConfigUseCase.class), null, null), (ValidatePhoneNumberUseCase) scope.d(Reflection.a(ValidatePhoneNumberUseCase.class), null, null), (ChaloNavigationManager) scope.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope.d(Reflection.a(KotlinToastManager.class), null, null), (CheckoutResultStateManager) scope.d(Reflection.a(CheckoutResultStateManager.class), null, null), (InstantTicketConfigHelper) scope.d(Reflection.a(InstantTicketConfigHelper.class), null, null), (CompleteOndcPurchaseAndStoreTicketUseCase) scope.d(Reflection.a(CompleteOndcPurchaseAndStoreTicketUseCase.class), null, null), (ResolveProductPurchaseMinProfileDecisionUseCase) scope.d(Reflection.a(ResolveProductPurchaseMinProfileDecisionUseCase.class), null, null), (MinProfileUpdateResultStateManager) scope.d(Reflection.a(MinProfileUpdateResultStateManager.class), null, null), (ProductPurchaseMinProfileDecisionHelper) scope.d(Reflection.a(ProductPurchaseMinProfileDecisionHelper.class), null, null), (ResolveSupportPolicyUseCase) scope.d(Reflection.a(ResolveSupportPolicyUseCase.class), null, null));
            case 1:
                ParametersHolder parametersHolder = (ParametersHolder) obj2;
                return new LifecycleStartedActionRunner((Lifecycle) parametersHolder.a(0, i71.k((Scope) obj, "$this$factory", parametersHolder, "<destruct>", Lifecycle.class)));
            case 2:
                Scope scope2 = (Scope) obj;
                ParametersHolder parametersHolder2 = (ParametersHolder) obj2;
                return new TicketPurchaseThroughPassDelegate((PremiumBusFareDetailsFlowType.PurchaseThroughPass) parametersHolder2.a(0, i71.k(scope2, "$this$factory", parametersHolder2, "<destruct>", PremiumBusFareDetailsFlowType.PurchaseThroughPass.class)), (ReserveSeatThroughPassUseCase) scope2.d(Reflection.a(ReserveSeatThroughPassUseCase.class), null, null), (SuperPassDataWrapper) scope2.d(Reflection.a(SuperPassDataWrapper.class), null, null), (AnalyticsContract) scope2.d(Reflection.a(AnalyticsContract.class), null, null), (CheckIsUserLoggedInUseCase) scope2.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), (ChaloNavigationManager) scope2.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope2.d(Reflection.a(KotlinToastManager.class), null, null), (StringProvider) scope2.d(Reflection.a(StringProvider.class), null, null), (SystemHelper) scope2.d(Reflection.a(SystemHelper.class), null, null), (ChaloTimeProvider) scope2.d(Reflection.a(ChaloTimeProvider.class), null, null));
            case 3:
                Scope scope3 = (Scope) obj;
                ParametersHolder parametersHolder3 = (ParametersHolder) obj2;
                return new FreshPurchaseDelegate((PremiumBusFareDetailsFlowType.FreshPurchase) parametersHolder3.a(1, Reflection.a(PremiumBusFareDetailsFlowType.FreshPurchase.class)), (FetchMobileTicketFareUseCase) scope3.d(Reflection.a(FetchMobileTicketFareUseCase.class), null, null), (FetchCompleteProductConfigByIdUseCase) scope3.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null), (StoreCompleteProductConfigLocallyUseCase) scope3.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null), (CreatePremiumReserveTicketOrderUseCase) scope3.d(Reflection.a(CreatePremiumReserveTicketOrderUseCase.class), null, null), (AnalyticsContract) scope3.d(Reflection.a(AnalyticsContract.class), null, null), (CheckIsUserLoggedInUseCase) scope3.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), (TimeUtilsContract) scope3.d(Reflection.a(TimeUtilsContract.class), null, null), (UserProfileDetailsProvider) scope3.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (ChaloNavigationManager) scope3.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope3.d(Reflection.a(KotlinToastManager.class), null, null), (StringProvider) scope3.d(Reflection.a(StringProvider.class), null, null), (SystemHelper) scope3.d(Reflection.a(SystemHelper.class), null, null), (ChaloTimeProvider) scope3.d(Reflection.a(ChaloTimeProvider.class), null, null), (PremiumBusFareDetailsStartedActionRunner) scope3.d(Reflection.a(PremiumBusFareDetailsStartedActionRunner.class), ParametersHolderKt.a((Lifecycle) parametersHolder3.a(0, i71.k(scope3, "$this$factory", parametersHolder3, "<destruct>", Lifecycle.class))), null), (TriggerPremiumBusBookingBookingEventsUseCase) scope3.d(Reflection.a(TriggerPremiumBusBookingBookingEventsUseCase.class), null, null));
            case 4:
                Scope scope4 = (Scope) obj;
                ParametersHolder parametersHolder4 = (ParametersHolder) obj2;
                return new TicketPurchaseWithPassUpsellNudgeDelegate((PremiumBusFareDetailsFlowType.PassUpsellNudge) parametersHolder4.a(1, Reflection.a(PremiumBusFareDetailsFlowType.PassUpsellNudge.class)), (PassUpsellPurchaseWrapper) scope4.d(Reflection.a(PassUpsellPurchaseWrapper.class), null, null), (ReserveSeatThroughPassUseCase) scope4.d(Reflection.a(ReserveSeatThroughPassUseCase.class), null, null), (AnalyticsContract) scope4.d(Reflection.a(AnalyticsContract.class), null, null), (CheckIsUserLoggedInUseCase) scope4.d(Reflection.a(CheckIsUserLoggedInUseCase.class), null, null), (ResolveProductPurchaseMinProfileDecisionUseCase) scope4.d(Reflection.a(ResolveProductPurchaseMinProfileDecisionUseCase.class), null, null), (ProductPurchaseMinProfileDecisionHelper) scope4.d(Reflection.a(ProductPurchaseMinProfileDecisionHelper.class), null, null), (MinProfileUpdateResultStateManager) scope4.d(Reflection.a(MinProfileUpdateResultStateManager.class), null, null), (KotlinToastManager) scope4.d(Reflection.a(KotlinToastManager.class), null, null), (CurrencyFeature) scope4.d(Reflection.a(CurrencyFeature.class), null, null), (StringProvider) scope4.d(Reflection.a(StringProvider.class), null, null), (ChaloNavigationManager) scope4.d(Reflection.a(ChaloNavigationManager.class), null, null), (CrashlyticsLogger) scope4.d(Reflection.a(CrashlyticsLogger.class), null, null), new DecomposeResultStateDataCollector((Lifecycle) parametersHolder4.a(0, i71.k(scope4, "$this$factory", parametersHolder4, "<destruct>", Lifecycle.class))), (ProductsSyncContract) scope4.d(Reflection.a(ProductsSyncContract.class), null, null));
            case 5:
                Scope scope5 = (Scope) obj;
                ParametersHolder parametersHolder5 = (ParametersHolder) obj2;
                ComponentContext componentContext = (ComponentContext) parametersHolder5.a(0, i71.k(scope5, "$this$factory", parametersHolder5, "<destruct>", ComponentContext.class));
                BookingSuccessArgs bookingSuccessArgs = (BookingSuccessArgs) parametersHolder5.a(1, Reflection.a(BookingSuccessArgs.class));
                if (bookingSuccessArgs instanceof BookingSuccessArgs.ProductSuccessScreen) {
                    bookingSuccessFlowDelegate = (BookingSuccessFlowDelegate) scope5.d(Reflection.a(DefaultBookingSuccessFlowDelegate.class), ParametersHolderKt.a(bookingSuccessArgs), null);
                } else {
                    if (!(bookingSuccessArgs instanceof BookingSuccessArgs.BulkBooking)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bookingSuccessFlowDelegate = (BookingSuccessFlowDelegate) scope5.d(Reflection.a(BulkBookingAcknowledgementDelegate.class), ParametersHolderKt.a(bookingSuccessArgs), null);
                }
                return new BookingSuccessComponent(componentContext, bookingSuccessArgs, bookingSuccessFlowDelegate);
            case 6:
                Scope scope6 = (Scope) obj;
                ParametersHolder parametersHolder6 = (ParametersHolder) obj2;
                return new DefaultPremiumBusFareDetailsDelegateResolver(new g41(9, scope6, (Lifecycle) parametersHolder6.a(0, i71.k(scope6, "$this$factory", parametersHolder6, "<destruct>", Lifecycle.class))));
            case 7:
                Scope scope7 = (Scope) obj;
                ParametersHolder parametersHolder7 = (ParametersHolder) obj2;
                ComponentContext componentContext2 = (ComponentContext) parametersHolder7.a(0, i71.k(scope7, "$this$factory", parametersHolder7, "<destruct>", ComponentContext.class));
                return new PremiumBusFareDetailsComponent(componentContext2, (PremiumBusFareDetailsArgs) parametersHolder7.a(1, Reflection.a(PremiumBusFareDetailsArgs.class)), (PremiumBusFareDetailsDelegateResolver) scope7.d(Reflection.a(PremiumBusFareDetailsDelegateResolver.class), ParametersHolderKt.a(componentContext2.getF12286a()), null), (CheckoutResultStateManager) scope7.d(Reflection.a(CheckoutResultStateManager.class), null, null), (CurrencyFeature) scope7.d(Reflection.a(CurrencyFeature.class), null, null), (StringProvider) scope7.d(Reflection.a(StringProvider.class), null, null), (PremiumBusFareDetailsUiStateFactory) scope7.d(Reflection.a(PremiumBusFareDetailsUiStateFactory.class), null, null));
            case 8:
                Scope single = (Scope) obj;
                ParametersHolder it = (ParametersHolder) obj2;
                Intrinsics.i(single, "$this$single");
                Intrinsics.i(it, "it");
                return new ProductBookingDataStoreImpl((DataStore) single.d(Reflection.a(DataStore.class), null, new StringQualifier("product_booking_prefs.preferences_pb")), (CityProvider) single.d(Reflection.a(CityProvider.class), null, null));
            case 9:
                Scope scope8 = (Scope) obj;
                ParametersHolder parametersHolder8 = (ParametersHolder) obj2;
                return new PremiumBusSlotSelectionComponent((PremiumBusArgs.SlotSelectionArgs) parametersHolder8.a(1, Reflection.a(PremiumBusArgs.SlotSelectionArgs.class)), (ComponentContext) parametersHolder8.a(0, i71.k(scope8, "$this$factory", parametersHolder8, "<destruct>", ComponentContext.class)), (AnalyticsContract) scope8.d(Reflection.a(AnalyticsContract.class), null, null), (PremiumBusPurchaseInfoManager) scope8.d(Reflection.a(PremiumBusPurchaseInfoManager.class), null, null), (PremiumBusBookingNavigationHelper) scope8.d(Reflection.a(PremiumBusBookingNavigationHelper.class), null, null), (StringProvider) scope8.d(Reflection.a(StringProvider.class), null, null), (TimeUtilsContract) scope8.d(Reflection.a(TimeUtilsContract.class), null, null), (GetPremiumReserveTicketByIdUseCase) scope8.d(Reflection.a(GetPremiumReserveTicketByIdUseCase.class), null, null), (FetchPremiumBusBookingAvailablePurchaseOptionsUseCase) scope8.d(Reflection.a(FetchPremiumBusBookingAvailablePurchaseOptionsUseCase.class), null, null), (FetchProductConfigsForUiUseCase) scope8.d(Reflection.a(FetchProductConfigsForUiUseCase.class), null, null), (IUserPreferencesDataStore) scope8.d(Reflection.a(IUserPreferencesDataStore.class), null, null), (GetOneTimeOfferConfigUseCase) scope8.d(Reflection.a(GetOneTimeOfferConfigUseCase.class), null, null), (CurrencyFeature) scope8.d(Reflection.a(CurrencyFeature.class), null, null), (SlotSelectionSectionInfoManager) scope8.d(Reflection.a(SlotSelectionSectionInfoManager.class), null, null), (SlotSelectionScreenUiStateFactory) scope8.d(Reflection.a(SlotSelectionScreenUiStateFactory.class), null, null), (GetMiscellaneousCityWiseFlagsConfigUseCase) scope8.d(Reflection.a(GetMiscellaneousCityWiseFlagsConfigUseCase.class), null, null), (CheckAndShowPassPurchaseNudgeCard) scope8.d(Reflection.a(CheckAndShowPassPurchaseNudgeCard.class), null, null), (SystemHelper) scope8.d(Reflection.a(SystemHelper.class), null, null), (ChaloNavigationManager) scope8.d(Reflection.a(ChaloNavigationManager.class), null, null), (KotlinToastManager) scope8.d(Reflection.a(KotlinToastManager.class), null, null), (FetchPBODPairsForGivenLocationsUseCase) scope8.d(Reflection.a(FetchPBODPairsForGivenLocationsUseCase.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) scope8.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), (ChaloTimeProvider) scope8.d(Reflection.a(ChaloTimeProvider.class), null, null), (FetchAvailableSlotsForPreBookingUseCase) scope8.d(Reflection.a(FetchAvailableSlotsForPreBookingUseCase.class), null, null), (SuperPassDataWrapper) scope8.d(Reflection.a(SuperPassDataWrapper.class), null, null), (SlotSelectionResultStateManager) scope8.d(Reflection.a(SlotSelectionResultStateManager.class), null, null), (PremiumBusBulkBookingHelper) scope8.d(Reflection.a(PremiumBusBulkBookingHelper.class), null, null), (GetTimeInMillisAfterXTimeUseCase) scope8.d(Reflection.a(GetTimeInMillisAfterXTimeUseCase.class), null, null));
            case 10:
                Scope single2 = (Scope) obj;
                ParametersHolder it2 = (ParametersHolder) obj2;
                Intrinsics.i(single2, "$this$single");
                Intrinsics.i(it2, "it");
                return new PremiumBusDataStoreWrapperImpl((LocalDataStore) single2.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("premiumBusStore.preferences_pb")));
            case 11:
                Scope scope9 = (Scope) obj;
                ParametersHolder parametersHolder9 = (ParametersHolder) obj2;
                ComponentContext componentContext3 = (ComponentContext) parametersHolder9.a(0, i71.k(scope9, "$this$factory", parametersHolder9, "<destruct>", ComponentContext.class));
                PremiumBusArgs.StopSelectionArgs stopSelectionArgs = (PremiumBusArgs.StopSelectionArgs) parametersHolder9.a(1, Reflection.a(PremiumBusArgs.StopSelectionArgs.class));
                AnalyticsContract analyticsContract = (AnalyticsContract) scope9.d(Reflection.a(AnalyticsContract.class), null, null);
                StringProvider stringProvider = (StringProvider) scope9.d(Reflection.a(StringProvider.class), null, null);
                SystemHelper systemHelper = (SystemHelper) scope9.d(Reflection.a(SystemHelper.class), null, null);
                ChaloNavigationManager chaloNavigationManager = (ChaloNavigationManager) scope9.d(Reflection.a(ChaloNavigationManager.class), null, null);
                KotlinToastManager kotlinToastManager = (KotlinToastManager) scope9.d(Reflection.a(KotlinToastManager.class), null, null);
                return new PremiumBusStopSelectionComponent(stopSelectionArgs, componentContext3, (PremiumBusPurchaseInfoManager) scope9.d(Reflection.a(PremiumBusPurchaseInfoManager.class), null, null), (FetchCompleteProductConfigByIdUseCase) scope9.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null), (StoreCompleteProductConfigLocallyUseCase) scope9.d(Reflection.a(StoreCompleteProductConfigLocallyUseCase.class), null, null), (GetRecentAndFlippedOriginDestinationPairsUseCase) scope9.d(Reflection.a(GetRecentAndFlippedOriginDestinationPairsUseCase.class), null, null), (FetchCurrentLocationUseCase) scope9.d(Reflection.a(FetchCurrentLocationUseCase.class), null, null), analyticsContract, (CityProvider) scope9.d(Reflection.a(CityProvider.class), null, null), (UserProfileDetailsProvider) scope9.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (GetPremiumBusCurrentCityConfigUseCase) scope9.d(Reflection.a(GetPremiumBusCurrentCityConfigUseCase.class), null, null), stringProvider, (BasicInfoContract) scope9.d(Reflection.a(BasicInfoContract.class), null, null), (TimeUtilsContract) scope9.d(Reflection.a(TimeUtilsContract.class), null, null), (FetchPBODPairsForGivenLocationsUseCase) scope9.d(Reflection.a(FetchPBODPairsForGivenLocationsUseCase.class), null, null), systemHelper, kotlinToastManager, chaloNavigationManager, (UniversalSearchResultStateManager) scope9.d(Reflection.a(UniversalSearchResultStateManager.class), null, null), (IReportProblemFeature) scope9.d(Reflection.a(IReportProblemFeature.class), null, null));
            case 12:
                Scope factory = (Scope) obj;
                ParametersHolder it3 = (ParametersHolder) obj2;
                Intrinsics.i(factory, "$this$factory");
                Intrinsics.i(it3, "it");
                return new GetCompleteProductConfigFromLocalCacheUseCase((LocalDataStore) factory.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")));
            case 13:
                Scope factory2 = (Scope) obj;
                ParametersHolder it4 = (ParametersHolder) obj2;
                Intrinsics.i(factory2, "$this$factory");
                Intrinsics.i(it4, "it");
                return new FetchCompleteProductConfigByIdWithLocalCacheUseCase((LocalDataStore) factory2.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (FetchCompleteProductConfigByIdUseCase) factory2.d(Reflection.a(FetchCompleteProductConfigByIdUseCase.class), null, null));
            case 14:
                Scope factory3 = (Scope) obj;
                ParametersHolder it5 = (ParametersHolder) obj2;
                Intrinsics.i(factory3, "$this$factory");
                Intrinsics.i(it5, "it");
                return new StoreCompleteProductConfigLocallyUseCase((LocalDataStore) factory3.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("product_config_store.preferences_pb")), (LocalDataStore) factory3.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_config_store.preferences_pb")), (LocalDataStore) factory3.d(Reflection.a(LocalDataStore.class), null, new StringQualifier("proof_document_props_store.preferences_pb")), (CoroutineContextProvider) factory3.d(Reflection.a(CoroutineContextProvider.class), null, null));
            case 15:
                final Scope single3 = (Scope) obj;
                ParametersHolder it6 = (ParametersHolder) obj2;
                Intrinsics.i(single3, "$this$single");
                Intrinsics.i(it6, "it");
                final int i = 0;
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new Function0() { // from class: f81
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                return DataStorePathHelper.a(ModuleExtKt.a(single3), "product_booking_prefs.preferences_pb");
                            case 1:
                                return DataStorePathHelper.a(ModuleExtKt.a(single3), "premiumBusStore.preferences_pb");
                            case 2:
                                return DataStorePathHelper.a(ModuleExtKt.a(single3), "vaultpref.preferences_pb");
                            case 3:
                                return DataStorePathHelper.a(ModuleExtKt.a(single3), "product_validation_prefs.preferences_pb");
                            default:
                                return DataStorePathHelper.a(ModuleExtKt.a(single3), "wallet_prefs.preferences_pb");
                        }
                    }
                }, 7, null);
            case 16:
                final Scope single4 = (Scope) obj;
                ParametersHolder it7 = (ParametersHolder) obj2;
                Intrinsics.i(single4, "$this$single");
                Intrinsics.i(it7, "it");
                final int i2 = 1;
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new Function0() { // from class: f81
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i2) {
                            case 0:
                                return DataStorePathHelper.a(ModuleExtKt.a(single4), "product_booking_prefs.preferences_pb");
                            case 1:
                                return DataStorePathHelper.a(ModuleExtKt.a(single4), "premiumBusStore.preferences_pb");
                            case 2:
                                return DataStorePathHelper.a(ModuleExtKt.a(single4), "vaultpref.preferences_pb");
                            case 3:
                                return DataStorePathHelper.a(ModuleExtKt.a(single4), "product_validation_prefs.preferences_pb");
                            default:
                                return DataStorePathHelper.a(ModuleExtKt.a(single4), "wallet_prefs.preferences_pb");
                        }
                    }
                }, 7, null));
            case 17:
                Scope single5 = (Scope) obj;
                ParametersHolder it8 = (ParametersHolder) obj2;
                Intrinsics.i(single5, "$this$single");
                Intrinsics.i(it8, "it");
                return new LocalDataStore(PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new u71(single5, 29), 7, null));
            case 18:
                Scope factory4 = (Scope) obj;
                ParametersHolder it9 = (ParametersHolder) obj2;
                Intrinsics.i(factory4, "$this$factory");
                Intrinsics.i(it9, "it");
                return new KeyStoreUtilsAndroid(ModuleExtKt.a(factory4));
            case 19:
                Scope factory5 = (Scope) obj;
                ParametersHolder it10 = (ParametersHolder) obj2;
                Intrinsics.i(factory5, "$this$factory");
                Intrinsics.i(it10, "it");
                return new VaultEncryptionKeyUtils(vo1.A(ModuleExtKt.a(factory5).getPackageName(), "vault"), LazyKt.b(new z61(12)), (KeyEncrypter) factory5.d(Reflection.a(KeyEncrypter.class), null, null), (DataStore) factory5.d(Reflection.a(DataStore.class), null, new StringQualifier("vaultpref.preferences_pb")), (CrashlyticsLogger) factory5.d(Reflection.a(CrashlyticsLogger.class), null, null));
            case 20:
                final Scope single6 = (Scope) obj;
                ParametersHolder it11 = (ParametersHolder) obj2;
                Intrinsics.i(single6, "$this$single");
                Intrinsics.i(it11, "it");
                final int i3 = 2;
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, CollectionsKt.R(SharedPreferencesMigrationKt.SharedPreferencesMigration$default(ModuleExtKt.a(single6), "vaultpref", null, 4, null)), null, new Function0() { // from class: f81
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i3) {
                            case 0:
                                return DataStorePathHelper.a(ModuleExtKt.a(single6), "product_booking_prefs.preferences_pb");
                            case 1:
                                return DataStorePathHelper.a(ModuleExtKt.a(single6), "premiumBusStore.preferences_pb");
                            case 2:
                                return DataStorePathHelper.a(ModuleExtKt.a(single6), "vaultpref.preferences_pb");
                            case 3:
                                return DataStorePathHelper.a(ModuleExtKt.a(single6), "product_validation_prefs.preferences_pb");
                            default:
                                return DataStorePathHelper.a(ModuleExtKt.a(single6), "wallet_prefs.preferences_pb");
                        }
                    }
                }, 5, null);
            case 21:
                Scope single7 = (Scope) obj;
                ParametersHolder it12 = (ParametersHolder) obj2;
                Intrinsics.i(single7, "$this$single");
                Intrinsics.i(it12, "it");
                return new ProductValidationsDataStoreImpl((DataStore) single7.d(Reflection.a(DataStore.class), null, new StringQualifier("product_validation_prefs.preferences_pb")));
            case 22:
                final Scope single8 = (Scope) obj;
                ParametersHolder it13 = (ParametersHolder) obj2;
                Intrinsics.i(single8, "$this$single");
                Intrinsics.i(it13, "it");
                final int i4 = 3;
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, null, null, new Function0() { // from class: f81
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                return DataStorePathHelper.a(ModuleExtKt.a(single8), "product_booking_prefs.preferences_pb");
                            case 1:
                                return DataStorePathHelper.a(ModuleExtKt.a(single8), "premiumBusStore.preferences_pb");
                            case 2:
                                return DataStorePathHelper.a(ModuleExtKt.a(single8), "vaultpref.preferences_pb");
                            case 3:
                                return DataStorePathHelper.a(ModuleExtKt.a(single8), "product_validation_prefs.preferences_pb");
                            default:
                                return DataStorePathHelper.a(ModuleExtKt.a(single8), "wallet_prefs.preferences_pb");
                        }
                    }
                }, 7, null);
            case 23:
                Scope scope10 = (Scope) obj;
                ParametersHolder parametersHolder10 = (ParametersHolder) obj2;
                return new BleValidationFragmentComponentAndroid((ValidationArgs.BleValidationScreenArgs) parametersHolder10.a(1, Reflection.a(ValidationArgs.BleValidationScreenArgs.class)), (ProductValidationConfigProvider) scope10.d(Reflection.a(ProductValidationConfigProvider.class), null, null), (BleValidationPrerequisitesStateHelper) scope10.d(Reflection.a(BleValidationPrerequisitesStateHelper.class), null, null), (BleValidationDynamicInfoHelper) scope10.d(Reflection.a(BleValidationDynamicInfoHelper.class), null, null), (BleValidationWithTwoWayPilotHelper) scope10.d(Reflection.a(BleValidationWithTwoWayPilotHelper.class), null, null), (BleValidationProcessCompletionHelper) scope10.d(Reflection.a(BleValidationProcessCompletionHelper.class), null, null), (GetRemoteResourcesUrlConfigUseCase) scope10.d(Reflection.a(GetRemoteResourcesUrlConfigUseCase.class), null, null), (GetRegularBusProductValidationMethodUseCase) scope10.d(Reflection.a(GetRegularBusProductValidationMethodUseCase.class), null, null), (GetTwoWayBleCommPilotConfigUseCase) scope10.d(Reflection.a(GetTwoWayBleCommPilotConfigUseCase.class), null, null), (BasicInfoContract) scope10.d(Reflection.a(BasicInfoContract.class), null, null), (StringProvider) scope10.d(Reflection.a(StringProvider.class), null, null), (BluetoothPermissionAndSystemFeature) scope10.d(Reflection.a(BluetoothPermissionAndSystemFeature.class), null, null), (CoroutineContextProvider) scope10.d(Reflection.a(CoroutineContextProvider.class), null, null), (GetRegularBusBLEValidationPayloadUseCase) scope10.d(Reflection.a(GetRegularBusBLEValidationPayloadUseCase.class), null, null), (GetTitoTapOutBlePayloadUseCase) scope10.d(Reflection.a(GetTitoTapOutBlePayloadUseCase.class), null, null), (GetRideFeedbackDataUseCase) scope10.d(Reflection.a(GetRideFeedbackDataUseCase.class), null, null), (ChaloRideFeedbackCollectionHelper) scope10.d(Reflection.a(ChaloRideFeedbackCollectionHelper.class), null, null), (ArePermissionsGrantedUseCase) scope10.d(Reflection.a(ArePermissionsGrantedUseCase.class), null, null), (PermissionHandlerProvider) scope10.d(Reflection.a(PermissionHandlerProvider.class), null, null), (SystemHelper) scope10.d(Reflection.a(SystemHelper.class), null, null), (ChaloNavigationManager) scope10.d(Reflection.a(ChaloNavigationManager.class), null, null), (IReportProblemFeature) scope10.d(Reflection.a(IReportProblemFeature.class), null, null), (KotlinToastManager) scope10.d(Reflection.a(KotlinToastManager.class), null, null), (GCMReceiver) scope10.d(Reflection.a(GCMReceiver.class), null, null), (DeviceNfcTapPaySuppressorProvider) scope10.d(Reflection.a(DeviceNfcTapPaySuppressorProvider.class), null, null), (ComponentContext) parametersHolder10.a(0, i71.k(scope10, "$this$factory", parametersHolder10, "<destruct>", ComponentContext.class)));
            case 24:
                Scope factory6 = (Scope) obj;
                ParametersHolder it14 = (ParametersHolder) obj2;
                Intrinsics.i(factory6, "$this$factory");
                Intrinsics.i(it14, "it");
                return new WalletEncryptedSharedPrefsSettings((Settings) factory6.d(Reflection.a(Settings.class), null, new StringQualifier("wallet_encrypted_settings")), (DataStore) factory6.d(Reflection.a(DataStore.class), null, new StringQualifier("language_store.preferences_pb")), (CoroutineContextProvider) factory6.d(Reflection.a(CoroutineContextProvider.class), null, null));
            case 25:
                Scope factory7 = (Scope) obj;
                ParametersHolder it15 = (ParametersHolder) obj2;
                Intrinsics.i(factory7, "$this$factory");
                Intrinsics.i(it15, "it");
                return new WalletDataStoreImpl((DataStore) factory7.d(Reflection.a(DataStore.class), null, new StringQualifier("wallet_prefs.preferences_pb")));
            case 26:
                Scope single9 = (Scope) obj;
                ParametersHolder it16 = (ParametersHolder) obj2;
                Intrinsics.i(single9, "$this$single");
                Intrinsics.i(it16, "it");
                return new LazyWalletSettings(new p01(29, ModuleExtKt.a(single9), single9));
            case 27:
                final Scope single10 = (Scope) obj;
                ParametersHolder it17 = (ParametersHolder) obj2;
                Intrinsics.i(single10, "$this$single");
                Intrinsics.i(it17, "it");
                final int i5 = 4;
                return PreferenceDataStoreFactory.createWithPath$default(PreferenceDataStoreFactory.INSTANCE, null, EmptyList.f17557a, null, new Function0() { // from class: f81
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                return DataStorePathHelper.a(ModuleExtKt.a(single10), "product_booking_prefs.preferences_pb");
                            case 1:
                                return DataStorePathHelper.a(ModuleExtKt.a(single10), "premiumBusStore.preferences_pb");
                            case 2:
                                return DataStorePathHelper.a(ModuleExtKt.a(single10), "vaultpref.preferences_pb");
                            case 3:
                                return DataStorePathHelper.a(ModuleExtKt.a(single10), "product_validation_prefs.preferences_pb");
                            default:
                                return DataStorePathHelper.a(ModuleExtKt.a(single10), "wallet_prefs.preferences_pb");
                        }
                    }
                }, 5, null);
            case 28:
                Scope factory8 = (Scope) obj;
                ParametersHolder it18 = (ParametersHolder) obj2;
                Intrinsics.i(factory8, "$this$factory");
                Intrinsics.i(it18, "it");
                return new GetWalletTransactionSummaryUseCase((WalletRepository) factory8.d(Reflection.a(WalletRepository.class), null, null), (QuickPayRepository) factory8.d(Reflection.a(QuickPayRepository.class), null, null), (StringProvider) factory8.d(Reflection.a(StringProvider.class), null, null), (ProductValidationData) factory8.d(Reflection.a(QuickPayValidationData.class), null, null), (CurrencyFeature) factory8.d(Reflection.a(CurrencyFeature.class), null, null), (TimeUtilsContract) factory8.d(Reflection.a(TimeUtilsContract.class), null, null), (ResolveQuickPayProductNameUseCase) factory8.d(Reflection.a(ResolveQuickPayProductNameUseCase.class), null, null));
            default:
                Scope scope11 = (Scope) obj;
                ParametersHolder parametersHolder11 = (ParametersHolder) obj2;
                return new WalletAccessManagerImpl((CoroutineScope) parametersHolder11.a(0, i71.k(scope11, "$this$factory", parametersHolder11, "<destruct>", CoroutineScope.class)), (GetWalletStatusWithReclaimTimeUseCase) scope11.d(Reflection.a(GetWalletStatusWithReclaimTimeUseCase.class), null, null), (RefreshWalletStatusUseCase) scope11.d(Reflection.a(RefreshWalletStatusUseCase.class), null, null), (GetWalletStatusWithoutSyncUseCase) scope11.d(Reflection.a(GetWalletStatusWithoutSyncUseCase.class), null, null), (GetWalletAppReclaimCompletionTimeUseCase) scope11.d(Reflection.a(GetWalletAppReclaimCompletionTimeUseCase.class), null, null), (AnalyticsContract) scope11.d(Reflection.a(AnalyticsContract.class), null, null), (PostDeviceIdForWalletMigrationUseCase) scope11.d(Reflection.a(PostDeviceIdForWalletMigrationUseCase.class), null, null), (StringProvider) scope11.d(Reflection.a(StringProvider.class), null, null), (ChaloNavigationManager) scope11.d(Reflection.a(ChaloNavigationManager.class), null, null), (ChaloConfigFeature) scope11.d(Reflection.a(ChaloConfigFeature.class), null, null), (UserProfileDetailsProvider) scope11.d(Reflection.a(UserProfileDetailsProvider.class), null, null), (TimeUtilsContract) scope11.d(Reflection.a(TimeUtilsContract.class), null, null), (KotlinToastManager) scope11.d(Reflection.a(KotlinToastManager.class), null, null), (WalletAutoReclaimUseCase) scope11.d(Reflection.a(WalletAutoReclaimUseCase.class), null, null), (RegisterAndSyncClosedLoopWalletUseCase) scope11.d(Reflection.a(RegisterAndSyncClosedLoopWalletUseCase.class), null, null));
        }
    }
}

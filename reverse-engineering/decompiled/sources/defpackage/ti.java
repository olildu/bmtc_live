package defpackage;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.AppBarMenuState;
import androidx.compose.material3.ClickableAppBarItem;
import androidx.compose.material3.DatePickerState;
import androidx.compose.material3.DefaultModalWideNavigationRailOverride;
import androidx.compose.material3.ModalWideNavigationRailOverrideScope;
import androidx.compose.material3.TimePickerState;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.tooling.CompositionErrorContextImpl;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.work.ExistingPeriodicWorkPolicy;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import app.chalo.HomeDestinationTabType.DestinationTabType;
import app.chalo.checkout.data.model.ui.CheckoutPaymentItem;
import app.chalo.checkout.ui.screen.card.CheckoutCardComponent;
import app.chalo.checkout.ui.screen.card.CheckoutCardDetails;
import app.chalo.checkout.ui.screen.card.CheckoutCardViewIntent;
import app.chalo.checkout.ui.screen.checkout.customurl.CustomUrlCheckoutComponent;
import app.chalo.checkout.ui.screen.netbanking.CheckoutNetBankingComponent;
import app.chalo.checkout.ui.screen.netbanking.NetBankingAppsViewIntent;
import app.chalo.checkout.ui.screen.payment.PaymentStatusAlertDetails;
import app.chalo.checkout.ui.screen.payment.PaymentStatusCTAActionType;
import app.chalo.checkout.ui.screen.postpayment.CheckoutPostPaymentComponent;
import app.chalo.checkout.ui.screen.postpayment.PostPaymentViewIntent;
import app.chalo.checkout.ui.screen.upi.CheckoutUpiAppsComponent;
import app.chalo.checkout.ui.screen.upi.UpiAppsViewIntent;
import app.chalo.checkout.ui.screen.wallet.CheckoutWalletAppsComponent;
import app.chalo.checkout.ui.screen.wallet.WalletAppsViewIntent;
import app.chalo.compose.components.dialogs.ChaloDatePickerKt;
import app.chalo.constants.Source;
import app.chalo.location.ChaloLocationDelegateAndroid;
import app.chalo.location.ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2$callback$1;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.ncmc.data.appmodel.ChaloCardDetails;
import app.chalo.ncmc.data.appmodel.OpenCardDetailsAppModel;
import app.chalo.ncmc.ui.cardlinking.linking.ChaloCardLinkIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoIntent;
import app.chalo.ncmc.ui.landing.ChaloCardInfoViewState;
import app.chalo.ncmc.ui.transactionhistory.CardTransactionUiModel;
import app.chalo.onboarding.citylocationselection.ui.CityLocationSelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionComponent;
import app.chalo.onboarding.cityselection.ui.CitySelectionIntent;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseIntent;
import app.chalo.productpurchase.passpurchase.ui.confirmation.ConfirmSuperPassPurchaseViewModel;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.resultstatemanager.DecomposeResultStateDataCollector;
import app.chalo.resultstatemanager.DecomposeResultStateDataCollector$lifecycleFlow$1$callback$1;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.CityDiscontinuedArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.uistate.dialog.DatePickerUIState;
import app.chalo.uistate.dialog.DropDownMenuItemUIState;
import app.chalo.uistate.toolbar.ToolbarBaseActionUIState;
import coil3.fetch.Fetcher;
import com.google.android.gms.location.FusedLocationProviderClient;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ti implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19660a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ti(int i, Object obj, Object obj2) {
        this.f19660a = i;
        this.c = obj;
        this.b = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f19660a;
        Unit unit = Unit.f17538a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ChaloCardInfoViewState chaloCardInfoViewState = (ChaloCardInfoViewState) obj2;
                Function1 function1 = (Function1) obj;
                ChaloCardDetails chaloCardDetails = chaloCardInfoViewState.f6359a;
                String str = chaloCardDetails instanceof OpenCardDetailsAppModel ? ((OpenCardDetailsAppModel) chaloCardDetails).k : null;
                String f6161a = chaloCardDetails != null ? chaloCardDetails.getF6157a() : null;
                ChaloCardDetails chaloCardDetails2 = chaloCardInfoViewState.f6359a;
                function1.invoke(new ChaloCardInfoIntent.ConfirmationDialogPositiveButtonClick(f6161a, str, chaloCardDetails2 != null ? chaloCardDetails2.getD() : null));
                return unit;
            case 1:
                ((FocusManager) obj2).clearFocus(true);
                ((Function1) obj).invoke(ChaloCardLinkIntent.ProceedClickedLinkIntent.f6276a);
                return unit;
            case 2:
                ((g0) obj2).invoke((CardTransactionUiModel) obj);
                return unit;
            case 3:
                PaddingValues paddingValues = ChaloDatePickerKt.f1888a;
                ((Function1) obj).invoke(((DatePickerState) obj2).getSelectedDateMillis());
                return unit;
            case 4:
                PaddingValues paddingValues2 = ChaloDatePickerKt.f1888a;
                ((DatePickerUIState) obj2).b.b(((DatePickerState) obj).getSelectedDateMillis());
                return unit;
            case 5:
                ((FusedLocationProviderClient) ((ChaloLocationDelegateAndroid) obj2).c.getValue()).removeLocationUpdates((ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2$callback$1) obj);
                return unit;
            case 6:
                ((Function1) obj).invoke(new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null));
                ((Function0) obj2).invoke();
                return unit;
            case 7:
                TimePickerState timePickerState = (TimePickerState) obj;
                ((Function3) obj2).invoke(Integer.valueOf(timePickerState.getHour()), Integer.valueOf(timePickerState.getMinute()), Boolean.valueOf(timePickerState.getIs24hour()));
                return unit;
            case 8:
                WorkManager.getInstance((Context) obj2).enqueueUniquePeriodicWork("chaloTimeBackgroundSyncWork", ExistingPeriodicWorkPolicy.KEEP, (PeriodicWorkRequest) obj);
                return unit;
            case 9:
                ((MutableState) obj).setValue(Boolean.TRUE);
                ((ToolbarBaseActionUIState.DropDownAction) obj2).c.a();
                return unit;
            case 10:
                ((MutableState) obj).setValue(Boolean.FALSE);
                ((DropDownMenuItemUIState) obj2).b.a();
                return unit;
            case 11:
                ((CheckoutCardComponent) obj2).N0(new CheckoutCardViewIntent.ProceedButtonClicked((CheckoutCardDetails) obj));
                return unit;
            case 12:
                ((CheckoutNetBankingComponent) obj2).H0(new NetBankingAppsViewIntent.NetBankingItemSelected((CheckoutPaymentItem.IndividualCheckoutItem.NetBankingPaymentItem) ((CheckoutPaymentItem.IndividualCheckoutItem) obj)));
                return unit;
            case 13:
                ((CheckoutPostPaymentComponent) obj2).U0(new PostPaymentViewIntent.ErrorScreenPositiveBtnClickIntent(((PaymentStatusAlertDetails) obj).f));
                return unit;
            case 14:
                ChaloNavigationManager chaloNavigationManager = ((CheckoutPostPaymentComponent) obj).z;
                if (((PostPaymentViewIntent.ErrorScreenPositiveBtnClickIntent) obj2).f1593a == PaymentStatusCTAActionType.NAVIGATE_TO_MY_TICKETS_AND_PASSES) {
                    ChaloNavigationManagerKt.f(chaloNavigationManager, new HomeArgs(DestinationTabType.MY_TICKETS.getDestinationTabType(), (String) null, 6));
                } else {
                    chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                }
                return unit;
            case 15:
                ((CheckoutUpiAppsComponent) obj2).H0(new UpiAppsViewIntent.UpiAppSelected((CheckoutPaymentItem.IndividualCheckoutItem.UPIIntentPaymentItem) ((CheckoutPaymentItem.IndividualCheckoutItem) obj)));
                return unit;
            case 16:
                ((CheckoutWalletAppsComponent) obj2).H0(new WalletAppsViewIntent.WalletAppSelected((CheckoutPaymentItem.IndividualCheckoutItem) obj));
                return unit;
            case 17:
                CityLocationSelectionComponent cityLocationSelectionComponent = (CityLocationSelectionComponent) obj2;
                ChaloNavigationManagerKt.e(cityLocationSelectionComponent.v, new CityDiscontinuedArgs((String) obj), new ChaloNavOptions(new PopUpToConfig.Finish(cityLocationSelectionComponent.k), 3), 4);
                cityLocationSelectionComponent.M = true;
                return unit;
            case 18:
                ChaloNavigationManagerKt.e(((CitySelectionComponent) obj2).n, CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, Source.CITY_SELECTION_FRAGMENT, ((CitySelectionIntent.CityClickedIntent) obj).f6618a, 2), null, 6);
                return unit;
            case 19:
                ((Function1) obj).invoke(new CitySelectionIntent.CityClickedIntent((BasicCityInfoAppModel) obj2));
                return unit;
            case 20:
                return ClickableAppBarItem.MenuContent$lambda$2$lambda$1((ClickableAppBarItem) obj2, (AppBarMenuState) obj);
            case 21:
                return CollectionsKt.R(new Pair((Fetcher.Factory) obj2, (ClassReference) obj));
            case 22:
                return ComposerImpl.insertMovableContentGuarded$lambda$0$0$1$0$0$0$0((ComposerImpl) obj2, (MovableContentStateReference) obj);
            case 23:
                return CompositionErrorContextImpl.attachComposeStackTrace$lambda$0((CompositionErrorContextImpl) obj2, obj);
            case 24:
                ((ConfirmSuperPassPurchaseViewModel) obj2).K(new ConfirmSuperPassPurchaseIntent.ZoomProofImageIntent((ProofUploadDetails) obj));
                return unit;
            case 25:
                CustomUrlCheckoutComponent customUrlCheckoutComponent = (CustomUrlCheckoutComponent) obj2;
                KotlinToastManagerKt.a(customUrlCheckoutComponent.r, (String) obj, ToastLength.SHORT);
                customUrlCheckoutComponent.q.b(new ChaloNavigationRequest.GoBack(new PopUpToConfig.Finish(customUrlCheckoutComponent.k)));
                return unit;
            case 26:
                ((DecomposeResultStateDataCollector) obj2).f9033a.a((DecomposeResultStateDataCollector$lifecycleFlow$1$callback$1) obj);
                return unit;
            case 27:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$16$lambda$15((Channel) obj2, (ModalWideNavigationRailOverrideScope) obj);
            case 28:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$18$lambda$17((CoroutineScope) obj2, (ModalWideNavigationRailOverrideScope) obj);
            default:
                return DefaultModalWideNavigationRailOverride.ModalWideNavigationRail$lambda$22$lambda$21((CoroutineScope) obj2, (Animatable) obj);
        }
    }

    public /* synthetic */ ti(Function1 function1, Object obj, int i) {
        this.f19660a = i;
        this.b = function1;
        this.c = obj;
    }
}

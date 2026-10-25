package defpackage;

import androidx.compose.material3.SheetDefaultsKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.datastore.core.DataStore;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8;
import app.chalo.di.SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9;
import app.chalo.di.SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$1;
import app.chalo.di.SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$2;
import app.chalo.di.SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$3;
import app.chalo.di.SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$4;
import app.chalo.di.SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$5;
import app.chalo.features.wallet.WalletSyncHelper;
import app.chalo.onboarding.splash.ui.SplashScreenViewState;
import app.chalo.quickpay.ui.payforticket.PayForTicketComponent;
import app.chalo.quickpay.ui.tripamount.QuickPayBottomSheetHelper;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountComponent;
import app.chalo.quickpay.ui.tripamount.QuickpayTripAmountUIStateFactory;
import app.chalo.quickpay.validation.QuickPayTicketProductValidationConfig;
import app.chalo.quickpay.validation.manager.QuickPayTicketAnalyticsManagerValidation;
import app.chalo.quickpay.validation.manager.QuickPayTicketProductValidationReportProblemManager;
import app.chalo.quickpay.validation.manager.QuickPayTicketProductValidationUIManager;
import app.chalo.quickpay.validation.manager.QuickPayTicketValidationNavigationManager;
import app.chalo.quickpay.validation.manager.QuickPayValidationData;
import app.chalo.receipt.ReceiptFetchError;
import app.chalo.sos.SosScreenDataState;
import app.chalo.sos.SosScreenType;
import app.chalo.utils.SheetDefaultsHelperKt;
import app.chalo.vault.db.ChaloCoreDatabase;
import app.chalo.wallet.domain.AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase;
import app.chalo.wallet.domain.CreateQuickPayOrderUsecase;
import app.chalo.wallet.domain.GetBannerForWalletScreenUseCase;
import app.chalo.wallet.domain.GetLoadMoneyDenominationsUseCase;
import app.chalo.wallet.domain.GetQuickpayTransactionIdsForOrderIdUseCase;
import app.chalo.wallet.domain.GetWalletLoadConfigAndPlaceRechargeOrderUseCase;
import app.chalo.wallet.domain.GetWalletTransactionSummaryUseCase;
import app.chalo.wallet.domain.UpdateQuickpayEntryInTableOnTapOutUseCase;
import app.chalo.wallet.domain.ValidateQuickPayAmountUseCase;
import app.chalo.wallet.domain.ValidateQuickPayUseCase;
import app.chalo.wallet.ui.access.WalletAccessManager;
import app.chalo.wallet.ui.alltransactions.WalletAllTransactionsComponent;
import app.chalo.wallet.ui.loadbalance.WalletLoadBalanceEnterAmountComponent;
import app.chalo.wallet.ui.loadbalancesuccess.WalletLoadBalanceSuccessComponent;
import app.chalo.wallet.ui.mainbalance.WalletBalanceComponent;
import app.chalo.wallet.ui.transactionsummary.WalletTransactionSummaryComponent;
import app.chalo.walletframework.chalopay.ChaloPayManager;
import app.chalo.walletframework.chalopay.ChaloPayManagerImpl;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$2;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$3;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$4;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$5;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$18;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$19;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$20;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$21;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$22;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$2;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$3;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$4;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$5;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$6;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$7;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$8;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$3;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$4;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$5;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$6;
import app.chalo.walletframework.di.SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$7;
import app.chalo.walletframework.helper.WalletSyncHelperImpl;
import app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSource;
import app.chalo.walletframework.quickpay.data.local.QuickPayLocalDataSourceImpl;
import app.chalo.walletframework.quickpay.data.mapper.NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper;
import app.chalo.walletframework.quickpay.data.model.appmodel.QPUserDetailsForProducts;
import app.chalo.walletframework.quickpay.data.remote.QuickPayRemoteDataSource;
import app.chalo.walletframework.quickpay.data.remote.QuickPayRemoteDataSourceImpl;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepositoryImpl;
import app.chalo.walletframework.quickpay.domain.FetchQuickPayReceiptForTransactionIdUseCase;
import app.chalo.walletframework.quickpay.domain.GetActiveQuickPaysUseCase;
import app.chalo.walletframework.quickpay.domain.GetAllQuickPaysUseCase;
import app.chalo.walletframework.quickpay.domain.GetQuickPayDisclaimerTextUseCase;
import app.chalo.walletframework.quickpay.domain.QuickPayReceiptFetchFailed;
import app.chalo.walletframework.quickpay.domain.SyncQuickPayReceiptsUseCase;
import app.chalo.walletframework.quickpay.domain.WalletSyncFailed;
import app.chalo.walletframework.wallet.data.local.walletdatastore.WalletDataStore;
import app.chalo.walletframework.wallet.data.local.walletencryptedsharedprefs.WalletEncryptedSharedPrefs;
import app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSource;
import app.chalo.walletframework.wallet.data.local.walletlocaldatasource.WalletLocalDataSourceImpl;
import app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSource;
import app.chalo.walletframework.wallet.data.remote.WalletRemoteDataSourceImpl;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.data.repository.WalletRepositoryImpl;
import app.chalo.walletframework.wallet.data.repository.dao.WalletDao;
import app.chalo.walletframework.wallet.domain.CheckIsWalletInAppReclaimUseCase;
import app.chalo.walletframework.wallet.domain.CheckIsWalletTimedOutUseCase;
import app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase;
import app.chalo.walletframework.wallet.domain.FetchWalletBalanceUseCase;
import app.chalo.walletframework.wallet.domain.FetchWalletStatusOnlineUseCase;
import app.chalo.walletframework.wallet.domain.GetValidWalletLoadConfigFromConfigListUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletAndAllTransactionsWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletAppReclaimCompletionTimeUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletIdUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithReclaimTimeUseCase;
import app.chalo.walletframework.wallet.domain.GetWalletStatusWithoutSyncUseCase;
import app.chalo.walletframework.wallet.domain.MergeCachedWalletAndFetchedWalletUseCase;
import app.chalo.walletframework.wallet.domain.PostDeviceIdForWalletMigrationUseCase;
import app.chalo.walletframework.wallet.domain.RefreshQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.RefreshWalletStatusUseCase;
import app.chalo.walletframework.wallet.domain.RegisterAndSyncClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.RegisterClosedLoopWalletUseCase;
import app.chalo.walletframework.wallet.domain.ResolveQuickPayProductNameUseCase;
import app.chalo.walletframework.wallet.domain.SatisfiesQuickPayPrerequisitesUseCase;
import app.chalo.walletframework.wallet.domain.WalletAutoReclaimUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestratorImpl;
import app.chalo.walletframework.wallet.domain.WalletSyncUseCase;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverImpl;
import app.chalo.walletframework.worker.WalletSyncWorkerTaskDelegate;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
import com.russhwolf.settings.Settings;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ClassReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.definition.Kind;
import org.koin.core.definition.KoinDefinition;
import org.koin.core.module.Module;
import org.koin.core.module.dsl.OptionDSLKt;
import org.koin.core.qualifier.StringQualifier;
import org.koin.core.registry.ScopeRegistry;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h81 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15801a;

    public /* synthetic */ h81(int i) {
        this.f15801a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f15801a;
        int i2 = 3;
        int i3 = 4;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(WalletDao.class), factoryOf.f);
                return unit;
            case 1:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(ChaloCoreDatabase.class), singleOf.f);
                return unit;
            case 2:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 sharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 = new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1();
                Kind kind = Kind.Factory;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(FetchQuickPayReceiptForTransactionIdUseCase.class);
                StringQualifier stringQualifier = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, classReferenceA, null, sharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1, kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetActiveQuickPaysUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetAllQuickPaysUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetQuickPayDisclaimerTextUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SyncQuickPayReceiptsUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5(), kind, emptyList), module)), null);
                h81 h81Var = new h81(9);
                SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1 sharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1 = new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1();
                Kind kind2 = Kind.Singleton;
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(WalletLocalDataSourceImpl.class), null, sharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$1, kind2, emptyList), module)), h81Var);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(QuickPayLocalDataSourceImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$2(), kind2, emptyList), module)), new h81(13));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(QuickPayRemoteDataSourceImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$3(), kind2, emptyList), module)), new h81(14));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(QuickPayRepositoryImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$4(), kind2, emptyList), module)), new h81(15));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(NetworkResponseToQuickPayReceiptFetchFailedExceptionMapper.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(QuickPayReceiptFetchFailed.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$1(), kind, emptyList), module)), new h81(i2));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(WalletSyncFailed.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$2(), kind, emptyList), module)), new h81(i3));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(CheckIsWalletInAppReclaimUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$1(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(CheckIsWalletTimedOutUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$2(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(GetWalletAppReclaimCompletionTimeUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$3(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(GetWalletStatusUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$4(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(MergeCachedWalletAndFetchedWalletUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$5(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(WalletSyncUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$6(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(WalletSyncOrchestratorImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$5(), kind2, emptyList), module)), new h81(5));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ClearWalletAndQuickPayDuringLogoutUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchWalletBalanceUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(FetchWalletStatusOnlineUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetValidWalletLoadConfigFromConfigListUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetWalletAndAllTransactionsUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetWalletAndAllTransactionsWithoutSyncUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetWalletIdUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(GetWalletStatusWithoutSyncUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(PostDeviceIdForWalletMigrationUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RegisterAndSyncClosedLoopWalletUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$16(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RegisterClosedLoopWalletUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$17(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RefreshWalletStatusUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$18(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(RefreshQuickPayPrerequisitesUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$19(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(SatisfiesQuickPayPrerequisitesUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$20(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(WalletResolverImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$6(), kind2, emptyList), module)), new h81(6));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(WalletRemoteDataSourceImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$7(), kind2, emptyList), module)), new h81(7));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(WalletRepositoryImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$8(), kind2, emptyList), module)), new h81(8));
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(WalletEncryptedSharedPrefs.class), null, new d81(24), kind, emptyList), module));
                new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(WalletDataStore.class), null, new d81(25), kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(WalletSyncHelperImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$3(), kind, emptyList), module)), new h81(10));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ChaloPayManagerImpl.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$4(), kind, emptyList), module)), new h81(11));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(QPUserDetailsForProducts.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$21(), kind, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(WalletSyncWorkerTaskDelegate.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$5(), kind, emptyList), module)), new h81(12));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier, Reflection.a(GetWalletStatusWithReclaimTimeUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$singleOf$default$7(), kind2, emptyList), module)), null);
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier, Reflection.a(ResolveQuickPayProductNameUseCase.class), null, new SharedWalletFrameworkModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$22(), kind, emptyList), module)), null);
                return unit;
            case 3:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(ReceiptFetchError.class), factoryOf2.f);
                return unit;
            case 4:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(ReceiptFetchError.class), factoryOf3.f);
                return unit;
            case 5:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(WalletSyncOrchestrator.class), singleOf2.f);
                return unit;
            case 6:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(WalletResolver.class), singleOf3.f);
                return unit;
            case 7:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                singleOf4.f = CollectionsKt.d0(Reflection.a(WalletRemoteDataSource.class), singleOf4.f);
                return unit;
            case 8:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                singleOf5.f = CollectionsKt.d0(Reflection.a(WalletRepository.class), singleOf5.f);
                return unit;
            case 9:
                BeanDefinition singleOf6 = (BeanDefinition) obj;
                Intrinsics.i(singleOf6, "$this$singleOf");
                singleOf6.f = CollectionsKt.d0(Reflection.a(WalletLocalDataSource.class), singleOf6.f);
                return unit;
            case 10:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(WalletSyncHelper.class), factoryOf4.f);
                return unit;
            case 11:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(ChaloPayManager.class), factoryOf5.f);
                return unit;
            case 12:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(BackgroundWorkerTaskDelegate.class), factoryOf6.f);
                OptionDSLKt.b(factoryOf6, "wallet_sync_worker_task");
                return unit;
            case 13:
                BeanDefinition singleOf7 = (BeanDefinition) obj;
                Intrinsics.i(singleOf7, "$this$singleOf");
                singleOf7.f = CollectionsKt.d0(Reflection.a(QuickPayLocalDataSource.class), singleOf7.f);
                return unit;
            case 14:
                BeanDefinition singleOf8 = (BeanDefinition) obj;
                Intrinsics.i(singleOf8, "$this$singleOf");
                singleOf8.f = CollectionsKt.d0(Reflection.a(QuickPayRemoteDataSource.class), singleOf8.f);
                return unit;
            case 15:
                BeanDefinition singleOf9 = (BeanDefinition) obj;
                Intrinsics.i(singleOf9, "$this$singleOf");
                singleOf9.f = CollectionsKt.d0(Reflection.a(QuickPayRepository.class), singleOf9.f);
                return unit;
            case 16:
                Module module2 = (Module) obj;
                Intrinsics.i(module2, "$this$module");
                StringQualifier stringQualifier2 = new StringQualifier("wallet_encrypted_settings");
                d81 d81Var = new d81(26);
                Kind kind3 = Kind.Singleton;
                EmptyList emptyList2 = EmptyList.f17557a;
                ClassReference classReferenceA2 = Reflection.a(Settings.class);
                StringQualifier stringQualifier3 = ScopeRegistry.e;
                new KoinDefinition(module2, i71.m(new BeanDefinition(stringQualifier3, Reflection.a(DataStore.class), i71.n(module2, i71.m(new BeanDefinition(stringQualifier3, classReferenceA2, stringQualifier2, d81Var, kind3, emptyList2), module2), "wallet_prefs.preferences_pb"), new d81(27), kind3, emptyList2), module2));
                return unit;
            case 17:
                Module module3 = (Module) obj;
                Intrinsics.i(module3, "$this$module");
                SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 sharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1 = new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1();
                Kind kind4 = Kind.Factory;
                EmptyList emptyList3 = EmptyList.f17557a;
                ClassReference classReferenceA3 = Reflection.a(AddProcessingLoadMoneyTransactionsAndSyncWalletUseCase.class);
                StringQualifier stringQualifier4 = ScopeRegistry.e;
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, classReferenceA3, null, sharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$1, kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(CreateQuickPayOrderUsecase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$2(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetBannerForWalletScreenUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$3(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetLoadMoneyDenominationsUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$4(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetQuickpayTransactionIdsForOrderIdUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$5(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetWalletLoadConfigAndPlaceRechargeOrderUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$6(), kind4, emptyList3), module3)), null);
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(GetWalletTransactionSummaryUseCase.class), null, new d81(28), kind4, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(UpdateQuickpayEntryInTableOnTapOutUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$7(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(ValidateQuickPayAmountUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$8(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(ValidateQuickPayUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$9(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickPayTicketAnalyticsManagerValidation.class), null, new SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$1(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickPayTicketValidationNavigationManager.class), null, new SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$2(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickPayTicketProductValidationUIManager.class), null, new SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$3(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickPayTicketProductValidationReportProblemManager.class), null, new SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$4(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickPayValidationData.class), null, new SharedWalletModuleKt$quickpayValidation$$inlined$factoryOf$default$5(), kind4, emptyList3), module3)), null);
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickPayTicketProductValidationConfig.class), null, new i81(i3), kind4, emptyList3), module3));
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(WalletAccessManager.class), null, new d81(29), kind4, emptyList3), module3));
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(WalletBalanceComponent.class), null, new i81(0), kind4, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(WalletAllTransactionsComponent.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$10(), kind4, emptyList3), module3)), null);
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(WalletTransactionSummaryComponent.class), null, new i81(1), kind4, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(WalletAutoReclaimUseCase.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$11(), kind4, emptyList3), module3)), null);
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(WalletLoadBalanceEnterAmountComponent.class), null, new i81(2), kind4, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickPayBottomSheetHelper.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$12(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickpayTripAmountUIStateFactory.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$13(), kind4, emptyList3), module3)), null);
                new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(QuickpayTripAmountComponent.class), null, new i81(i2), kind4, emptyList3), module3));
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(WalletLoadBalanceSuccessComponent.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$14(), kind4, emptyList3), module3)), null);
                OptionDSLKt.c(new KoinDefinition(module3, i71.w(new BeanDefinition(stringQualifier4, Reflection.a(PayForTicketComponent.class), null, new SharedWalletModuleKt$commonModule$lambda$0$$inlined$factoryOf$default$15(), kind4, emptyList3), module3)), null);
                return unit;
            case 18:
                float f = SheetDefaultsHelperKt.f10439a;
                Intrinsics.i((SheetValue) obj, "it");
                return Boolean.TRUE;
            case 19:
                return Boolean.valueOf(SheetDefaultsKt.rememberSheetState_AGcomas$lambda$3$lambda$2((SheetValue) obj));
            case 20:
                return Boolean.valueOf(SheetState._init_$lambda$0((SheetValue) obj));
            case 21:
                return Boolean.valueOf(SheetState._init_$lambda$7((SheetValue) obj));
            case 22:
                return SnapshotKt.emptyLambda$lambda$0((SnapshotIdSet) obj);
            case 23:
                SosScreenDataState it = (SosScreenDataState) obj;
                Intrinsics.i(it, "it");
                return SosScreenDataState.a(it, null, null, null, null, null, false, null, false, 223);
            case 24:
                SosScreenDataState it2 = (SosScreenDataState) obj;
                Intrinsics.i(it2, "it");
                return SosScreenDataState.a(it2, null, null, null, null, SosScreenType.DISPLAY_SCREEN, false, null, false, 231);
            case 25:
                SosScreenDataState it3 = (SosScreenDataState) obj;
                Intrinsics.i(it3, "it");
                return SosScreenDataState.a(it3, null, null, null, it3.f9406a, SosScreenType.MSG_EDIT_SCREEN, false, null, false, 231);
            case 26:
                return SosScreenDataState.a((SosScreenDataState) obj, null, null, null, null, null, false, null, true, 95);
            case 27:
                return SosScreenDataState.a((SosScreenDataState) obj, null, null, null, null, null, true, null, false, 223);
            case 28:
                return SosScreenDataState.a((SosScreenDataState) obj, null, null, null, null, null, false, null, false, 127);
            default:
                SplashScreenViewState splashScreenViewState = (SplashScreenViewState) obj;
                return new SplashScreenViewState(splashScreenViewState.f6696a, splashScreenViewState.b, Boolean.TRUE);
        }
    }
}

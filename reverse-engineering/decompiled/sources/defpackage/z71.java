package defpackage;

import androidx.datastore.core.DataStore;
import app.chalo.appmigrationpreconditions.orchestrator.AndroidMigrationFlowOrchestrator;
import app.chalo.appsupport.data.remote.BookingHelpRemoteDataSource;
import app.chalo.appsupport.data.repository.BookingHelpRepository;
import app.chalo.checkout.utility.CheckoutMTicketDetailsHelper;
import app.chalo.datastore.LocalDataStore;
import app.chalo.helper.FeedbackFeature;
import app.chalo.helper.KeyStoreToDatabaseMigrationHelper;
import app.chalo.helper.KeyStoreToDatabaseMigrationHelperAndroid;
import app.chalo.helper.ProductDataDeletionHelper;
import app.chalo.home.ChaloChainedBottomSheetFeature;
import app.chalo.home.data.remote.IHomeScreenConfigRemoteDataSource;
import app.chalo.home.data.remote.PremiumBusFeatureRemoteDataSource;
import app.chalo.home.data.remote.PremiumPassSavingRemoteDataSource;
import app.chalo.home.data.repository.IHomeScreenConfigRepository;
import app.chalo.home.data.repository.PremiumBusRemoteRepository;
import app.chalo.home.data.repository.PremiumPassSavingRemoteRepository;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.home.di.SharedHomeModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1;
import app.chalo.home.di.SharedHomeModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1;
import app.chalo.navigation.ProductBookingNavigationManager;
import app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRemoteDataSource;
import app.chalo.premiumbus.bulkbookingridedetails.data.remote.PbBulkBookingRideDetailsRepository;
import app.chalo.premiumbus.data.PassUpsellPurchaseWrapper;
import app.chalo.premiumbus.data.SuperPassDataWrapper;
import app.chalo.premiumbus.helper.PremiumBusBulkBookingHelper;
import app.chalo.productsummary.data.remote.ProductInvoiceGenerationRemoteDataSource;
import app.chalo.productsummary.data.repository.ProductInvoiceGenerationRepository;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.tito.data.local.TITOValidationDataSource;
import app.chalo.titoridedetail.manager.TitoRideDataManager;
import app.chalo.usercommutepreference.data.remote.UserCommutePreferenceRemoteDataSource;
import app.chalo.usercommutepreference.data.repository.UserCommutePreferenceRepository;
import app.chalo.usercommutepreference.data.store.UserCommutePreferenceLocalStore;
import app.chalo.worker.BackgroundWorkerTaskDelegate;
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
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class z71 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20173a;

    public /* synthetic */ z71(int i) {
        this.f20173a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20173a) {
            case 0:
                BeanDefinition factoryOf = (BeanDefinition) obj;
                Intrinsics.i(factoryOf, "$this$factoryOf");
                factoryOf.f = CollectionsKt.d0(Reflection.a(PremiumBusBulkBookingHelper.class), factoryOf.f);
                break;
            case 1:
                BeanDefinition factoryOf2 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf2, "$this$factoryOf");
                factoryOf2.f = CollectionsKt.d0(Reflection.a(ProductBookingNavigationManager.class), factoryOf2.f);
                break;
            case 2:
                BeanDefinition singleOf = (BeanDefinition) obj;
                Intrinsics.i(singleOf, "$this$singleOf");
                singleOf.f = CollectionsKt.d0(Reflection.a(IHomeScreenConfigRemoteDataSource.class), singleOf.f);
                break;
            case 3:
                BeanDefinition factoryOf3 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf3, "$this$factoryOf");
                factoryOf3.f = CollectionsKt.d0(Reflection.a(BackgroundWorkerTaskDelegate.class), factoryOf3.f);
                OptionDSLKt.b(factoryOf3, "chalo_time_sync_worker_task");
                break;
            case 4:
                BeanDefinition factoryOf4 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf4, "$this$factoryOf");
                factoryOf4.f = CollectionsKt.d0(Reflection.a(BookingHelpRemoteDataSource.class), factoryOf4.f);
                break;
            case 5:
                BeanDefinition factoryOf5 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf5, "$this$factoryOf");
                factoryOf5.f = CollectionsKt.d0(Reflection.a(BookingHelpRepository.class), factoryOf5.f);
                break;
            case 6:
                BeanDefinition factoryOf6 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf6, "$this$factoryOf");
                factoryOf6.f = CollectionsKt.d0(Reflection.a(ProductInvoiceGenerationRemoteDataSource.class), factoryOf6.f);
                break;
            case 7:
                BeanDefinition factoryOf7 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf7, "$this$factoryOf");
                factoryOf7.f = CollectionsKt.d0(Reflection.a(ProductInvoiceGenerationRepository.class), factoryOf7.f);
                break;
            case 8:
                BeanDefinition factoryOf8 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf8, "$this$factoryOf");
                factoryOf8.f = CollectionsKt.d0(Reflection.a(ProductDataDeletionHelper.class), factoryOf8.f);
                break;
            case 9:
                BeanDefinition factoryOf9 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf9, "$this$factoryOf");
                factoryOf9.f = CollectionsKt.d0(Reflection.a(PremiumPassSavingRemoteDataSource.class), factoryOf9.f);
                break;
            case 10:
                BeanDefinition singleOf2 = (BeanDefinition) obj;
                Intrinsics.i(singleOf2, "$this$singleOf");
                singleOf2.f = CollectionsKt.d0(Reflection.a(IHomeScreenConfigRepository.class), singleOf2.f);
                break;
            case 11:
                BeanDefinition factoryOf10 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf10, "$this$factoryOf");
                factoryOf10.f = CollectionsKt.d0(Reflection.a(PremiumPassSavingRemoteRepository.class), factoryOf10.f);
                break;
            case 12:
                BeanDefinition singleOf3 = (BeanDefinition) obj;
                Intrinsics.i(singleOf3, "$this$singleOf");
                singleOf3.f = CollectionsKt.d0(Reflection.a(FeedbackFeature.class), singleOf3.f);
                break;
            case 13:
                BeanDefinition factoryOf11 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf11, "$this$factoryOf");
                factoryOf11.f = CollectionsKt.d0(Reflection.a(TitoRideDataManager.class), factoryOf11.f);
                break;
            case 14:
                BeanDefinition singleOf4 = (BeanDefinition) obj;
                Intrinsics.i(singleOf4, "$this$singleOf");
                singleOf4.f = CollectionsKt.d0(Reflection.a(TicketRepository.class), singleOf4.f);
                break;
            case 15:
                BeanDefinition factoryOf12 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf12, "$this$factoryOf");
                factoryOf12.f = CollectionsKt.d0(Reflection.a(CheckoutMTicketDetailsHelper.class), factoryOf12.f);
                break;
            case 16:
                BeanDefinition factoryOf13 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf13, "$this$factoryOf");
                factoryOf13.f = CollectionsKt.d0(Reflection.a(PremiumBusFeatureRemoteDataSource.class), factoryOf13.f);
                break;
            case 17:
                BeanDefinition factoryOf14 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf14, "$this$factoryOf");
                factoryOf14.f = CollectionsKt.d0(Reflection.a(PremiumBusRemoteRepository.class), factoryOf14.f);
                break;
            case 18:
                BeanDefinition factoryOf15 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf15, "$this$factoryOf");
                factoryOf15.f = CollectionsKt.d0(Reflection.a(UserCommutePreferenceRemoteDataSource.class), factoryOf15.f);
                break;
            case 19:
                BeanDefinition singleOf5 = (BeanDefinition) obj;
                Intrinsics.i(singleOf5, "$this$singleOf");
                singleOf5.f = CollectionsKt.d0(Reflection.a(ChaloChainedBottomSheetFeature.class), singleOf5.f);
                break;
            case 20:
                BeanDefinition factoryOf16 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf16, "$this$factoryOf");
                factoryOf16.f = CollectionsKt.d0(Reflection.a(UserCommutePreferenceLocalStore.class), factoryOf16.f);
                break;
            case 21:
                BeanDefinition factoryOf17 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf17, "$this$factoryOf");
                factoryOf17.f = CollectionsKt.d0(Reflection.a(TITOValidationDataRepository.class), factoryOf17.f);
                break;
            case 22:
                BeanDefinition factoryOf18 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf18, "$this$factoryOf");
                factoryOf18.f = CollectionsKt.d0(Reflection.a(UserCommutePreferenceRepository.class), factoryOf18.f);
                break;
            case 23:
                BeanDefinition factoryOf19 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf19, "$this$factoryOf");
                factoryOf19.f = CollectionsKt.d0(Reflection.a(SuperPassDataWrapper.class), factoryOf19.f);
                break;
            case 24:
                BeanDefinition factoryOf20 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf20, "$this$factoryOf");
                factoryOf20.f = CollectionsKt.d0(Reflection.a(PassUpsellPurchaseWrapper.class), factoryOf20.f);
                break;
            case 25:
                BeanDefinition factoryOf21 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf21, "$this$factoryOf");
                factoryOf21.f = CollectionsKt.d0(Reflection.a(PbBulkBookingRideDetailsRepository.class), factoryOf21.f);
                break;
            case 26:
                BeanDefinition factoryOf22 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf22, "$this$factoryOf");
                factoryOf22.f = CollectionsKt.d0(Reflection.a(PbBulkBookingRideDetailsRemoteDataSource.class), factoryOf22.f);
                break;
            case 27:
                BeanDefinition factoryOf23 = (BeanDefinition) obj;
                Intrinsics.i(factoryOf23, "$this$factoryOf");
                factoryOf23.f = CollectionsKt.d0(Reflection.a(TITOValidationDataSource.class), factoryOf23.f);
                break;
            case 28:
                Module module = (Module) obj;
                Intrinsics.i(module, "$this$module");
                StringQualifier stringQualifier = new StringQualifier("homeScreenConfigDataStoreKey.preferences_pb");
                y71 y71Var = new y71(18);
                Kind kind = Kind.Singleton;
                EmptyList emptyList = EmptyList.f17557a;
                ClassReference classReferenceA = Reflection.a(LocalDataStore.class);
                StringQualifier stringQualifier2 = ScopeRegistry.e;
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(DataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), i71.n(module, i71.m(new BeanDefinition(stringQualifier2, classReferenceA, stringQualifier, y71Var, kind, emptyList), module), "pb_user_profile_survey_store.preferences_pb"), new y71(20), kind, emptyList), module), "city_store.preferences_pb"), new y71(21), kind, emptyList), module), "pass_status_store.preferences_pb"), new y71(22), kind, emptyList), module), "superPassActivationTimestampsMap.preferences_pb"), new y71(23), kind, emptyList), module), "keyTITOFirstTimeUser.preferences_pb"), new y71(24), kind, emptyList), module), "keyWorkerStore.preferences_pb"), new y71(25), kind, emptyList), module), "sos_store_key.preferences_pb"), new y71(26), kind, emptyList), module));
                OptionDSLKt.c(new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(KeyStoreToDatabaseMigrationHelperAndroid.class), null, new SharedHomeModule_androidKt$platformModule$lambda$0$$inlined$singleOf$1(), kind, emptyList), module)), new z71(29));
                OptionDSLKt.c(new KoinDefinition(module, i71.w(new BeanDefinition(stringQualifier2, Reflection.a(AndroidMigrationFlowOrchestrator.class), null, new SharedHomeModule_androidKt$platformModule$lambda$0$$inlined$factoryOf$1(), Kind.Factory, emptyList), module)), new a81(0));
                new KoinDefinition(module, i71.m(new BeanDefinition(stringQualifier2, Reflection.a(LocalDataStore.class), new StringQualifier("isTermsAndConditionSeenKey"), new y71(19), kind, emptyList), module));
                break;
            default:
                BeanDefinition singleOf6 = (BeanDefinition) obj;
                Intrinsics.i(singleOf6, "$this$singleOf");
                singleOf6.f = CollectionsKt.d0(Reflection.a(KeyStoreToDatabaseMigrationHelper.class), singleOf6.f);
                break;
        }
        return Unit.f17538a;
    }
}

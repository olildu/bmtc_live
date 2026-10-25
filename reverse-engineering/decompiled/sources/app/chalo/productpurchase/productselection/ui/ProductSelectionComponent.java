package app.chalo.productpurchase.productselection.ui;

import androidx.compose.ui.unit.Dp;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.citydata.data.model.app.RouteAppModel;
import app.chalo.citydata.data.model.app.RouteLegacySpecialFeature;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.citydata.domain.FetchRouteDataFromRemoteUseCase;
import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.InstantTicketFeatureConfigForCity;
import app.chalo.data.ProductGroup;
import app.chalo.domain.GetInstantTicketFeatureConfigUseCase;
import app.chalo.extensions.StringExtsKt;
import app.chalo.features.onetimeoffer.GetOneTimeOfferConfigUseCase;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModel;
import app.chalo.features.onetimeoffer.models.OneTimeOfferConfigAppModelKt;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.home.data.repository.TicketRepository;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.models.mticketing.MTicket;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.productbooking.common.data.models.app.ProductConfigServiceType;
import app.chalo.productpurchase.passpurchase.domain.PassPurchaseSceneResolverUseCase;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.AllProductConfigsResponseAppModelKt;
import app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel;
import app.chalo.productpurchase.productselection.data.models.app.SuperPassProductConfigSubCategoryResponseAppModel;
import app.chalo.productpurchase.productselection.data.repository.ProductPurchaseRepository;
import app.chalo.productpurchase.productselection.domain.FetchProductConfigsUseCase;
import app.chalo.productpurchase.productselection.domain.ProductFetchResult;
import app.chalo.productpurchase.productselection.ui.ProductSelectionComponent;
import app.chalo.productpurchase.productselection.ui.ProductSelectionErrorDialog;
import app.chalo.productpurchase.productselection.ui.ProductSelectionIntent;
import app.chalo.productpurchase.utils.RenewSuperPassHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.ChaloScenes;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.PassSelectionArgs;
import app.chalo.scenes.args.PostPassPurchaseSuccessFlowType;
import app.chalo.scenes.args.PremiumBusArgs;
import app.chalo.scenes.args.ProductSelectionArgs;
import app.chalo.scenes.args.SceneArgs;
import app.chalo.scenes.args.SuperPassPurchaseArgs;
import app.chalo.scenes.args.TicketPurchaseArgs;
import app.chalo.superpass.data.models.entities.MagicSuperPass;
import app.chalo.superpass.data.models.entities.RideBasedSuperPass;
import app.chalo.superpass.data.models.entities.SuperPass;
import app.chalo.superpass.data.models.entities.SuperPassProperties;
import app.chalo.superpass.data.models.entities.SuperPassRepurchaseProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.superpass.utils.MixpanelUtil;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.base.UiEventHandler;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.uistate.image.ImageUISize;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.image.ImageUrlUIState;
import app.chalo.uistate.image.UIContentScale;
import app.chalo.uistate.plotline.PlotlineWidgetUIState;
import app.chalo.uistate.text.TextUIState;
import app.chalo.uistate.text.TextWithSpecialFeatureBuilder;
import app.chalo.uistate.text.TextWithSpecialFeaturesTagsUIStateKt;
import app.chalo.uistate.text.UIFontStyle;
import app.chalo.uistate.text.UIFontWeight;
import app.chalo.uistate.text.UITextAlign;
import app.chalo.uistate.text.UITextDecoration;
import app.chalo.uistate.text.UITextOverflow;
import app.chalo.uistate.text.UITextStyle;
import app.chalo.utils.SuperPassUIStateUtils;
import com.arkivanov.decompose.ComponentContext;
import defpackage.aj;
import defpackage.fr0;
import defpackage.mf;
import defpackage.ox0;
import defpackage.px0;
import defpackage.rw0;
import defpackage.yw0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2;
import kotlinx.coroutines.flow.internal.CombineKt;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionIntent;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionDataState;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionUIState;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionEffect;", "RecentItemsType", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductSelectionComponent extends ChaloBaseStateMviComponent<ProductSelectionIntent, ProductSelectionDataState, ProductSelectionUIState, ProductSelectionEffect> {
    public final MTicketUtilsHelper A;
    public final FetchRouteDataFromRemoteUseCase B;
    public final ProductPurchaseRepository C;
    public final KotlinToastManager D;
    public Job E;
    public final Lazy F;
    public final ProductSelectionArgs k;
    public final FetchProductConfigsUseCase l;
    public final AnalyticsContract m;
    public final SuperPassRepository n;
    public final TicketRepository o;
    public final GetOneTimeOfferConfigUseCase p;
    public final UserProfileDetailsProvider q;
    public final GetInstantTicketFeatureConfigUseCase r;
    public final BasicInfoContract s;
    public final ChaloNavigationManager t;
    public final IUserPreferencesDataStore u;
    public final StringProvider v;
    public final CurrencyFeature w;
    public final RenewSuperPassHelper x;
    public final CityProvider y;
    public final PassPurchaseSceneResolverUseCase z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$Companion;", "", "", "RECENT_PRODUCTS_TO_SHOW_DEFAULT", "I", "", "PRODUCT_PERMANENTLY_DISABLED", "Ljava/lang/String;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType;", "", "RecentRideBasedSuperPass", "RecentMagicSuperPass", "RecentMTicket", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType$RecentMTicket;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType$RecentMagicSuperPass;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType$RecentRideBasedSuperPass;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class RecentItemsType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8668a;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType$RecentMTicket;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RecentMTicket extends RecentItemsType {
            public final MTicket b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RecentMTicket(MTicket mTicket) {
                super(mTicket.i);
                Intrinsics.i(mTicket, "mTicket");
                this.b = mTicket;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecentMTicket) && Intrinsics.d(this.b, ((RecentMTicket) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RecentMTicket(mTicket=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType$RecentMagicSuperPass;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RecentMagicSuperPass extends RecentItemsType {
            public final MagicSuperPass b;

            public RecentMagicSuperPass(MagicSuperPass magicSuperPass) {
                super(magicSuperPass.c.e);
                this.b = magicSuperPass;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecentMagicSuperPass) && Intrinsics.d(this.b, ((RecentMagicSuperPass) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RecentMagicSuperPass(magicSuperPass=" + this.b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType$RecentRideBasedSuperPass;", "Lapp/chalo/productpurchase/productselection/ui/ProductSelectionComponent$RecentItemsType;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RecentRideBasedSuperPass extends RecentItemsType {
            public final RideBasedSuperPass b;

            public RecentRideBasedSuperPass(RideBasedSuperPass rideBasedSuperPass) {
                super(rideBasedSuperPass.h.e);
                this.b = rideBasedSuperPass;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RecentRideBasedSuperPass) && Intrinsics.d(this.b, ((RecentRideBasedSuperPass) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RecentRideBasedSuperPass(rideBasedSuperPass=" + this.b + ")";
            }
        }

        public RecentItemsType(long j) {
            this.f8668a = j;
        }

        public final boolean a() {
            if ((this instanceof RecentRideBasedSuperPass) && ((RecentRideBasedSuperPass) this).b.l()) {
                return true;
            }
            return (this instanceof RecentMagicSuperPass) && ((RecentMagicSuperPass) this).b.l();
        }
    }

    public ProductSelectionComponent(ComponentContext componentContext, ProductSelectionArgs productSelectionArgs, FetchProductConfigsUseCase fetchProductConfigsUseCase, AnalyticsContract analyticsContract, SuperPassRepository superPassRepository, TicketRepository ticketRepository, GetOneTimeOfferConfigUseCase getOneTimeOfferConfigUseCase, UserProfileDetailsProvider userProfileDetailsProvider, GetInstantTicketFeatureConfigUseCase getInstantTicketFeatureConfigUseCase, BasicInfoContract basicInfoContract, ChaloNavigationManager chaloNavigationManager, IUserPreferencesDataStore iUserPreferencesDataStore, StringProvider stringProvider, CurrencyFeature currencyFeature, RenewSuperPassHelper renewSuperPassHelper, CityProvider cityProvider, PassPurchaseSceneResolverUseCase passPurchaseSceneResolverUseCase, MTicketUtilsHelper mTicketUtilsHelper, FetchRouteDataFromRemoteUseCase fetchRouteDataFromRemoteUseCase, ProductPurchaseRepository productPurchaseRepository, KotlinToastManager kotlinToastManager) {
        super(componentContext);
        this.k = productSelectionArgs;
        this.l = fetchProductConfigsUseCase;
        this.m = analyticsContract;
        this.n = superPassRepository;
        this.o = ticketRepository;
        this.p = getOneTimeOfferConfigUseCase;
        this.q = userProfileDetailsProvider;
        this.r = getInstantTicketFeatureConfigUseCase;
        this.s = basicInfoContract;
        this.t = chaloNavigationManager;
        this.u = iUserPreferencesDataStore;
        this.v = stringProvider;
        this.w = currencyFeature;
        this.x = renewSuperPassHelper;
        this.y = cityProvider;
        this.z = passPurchaseSceneResolverUseCase;
        this.A = mTicketUtilsHelper;
        this.B = fetchRouteDataFromRemoteUseCase;
        this.C = productPurchaseRepository;
        this.D = kotlinToastManager;
        this.F = LazyKt.b(new ox0(18));
        boolean z = productSelectionArgs.e;
        Source source = productSelectionArgs.g;
        source = source == null ? Source.UNKNOWN : source;
        Source source2 = productSelectionArgs.f;
        Z0(new ProductSelectionIntent.InitializationIntent(z, source, source2 == null ? Source.UNKNOWN : source2, productSelectionArgs.c, productSelectionArgs.h, productSelectionArgs.d));
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00eb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ec A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object F0(ProductSelectionComponent productSelectionComponent, String str, boolean z, boolean z2, boolean z3, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$fetchProductConfigs$1 productSelectionComponent$fetchProductConfigs$1;
        productSelectionComponent.getClass();
        if (continuationImpl instanceof ProductSelectionComponent$fetchProductConfigs$1) {
            productSelectionComponent$fetchProductConfigs$1 = (ProductSelectionComponent$fetchProductConfigs$1) continuationImpl;
            int i = productSelectionComponent$fetchProductConfigs$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$fetchProductConfigs$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$fetchProductConfigs$1 = new ProductSelectionComponent$fetchProductConfigs$1(productSelectionComponent, continuationImpl);
            }
        } else {
            productSelectionComponent$fetchProductConfigs$1 = new ProductSelectionComponent$fetchProductConfigs$1(productSelectionComponent, continuationImpl);
        }
        ProductSelectionComponent$fetchProductConfigs$1 productSelectionComponent$fetchProductConfigs$2 = productSelectionComponent$fetchProductConfigs$1;
        Object objA = productSelectionComponent$fetchProductConfigs$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$fetchProductConfigs$2.label;
        Object obj2 = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            productSelectionComponent.E0(new yw0(26));
            FetchProductConfigsUseCase fetchProductConfigsUseCase = productSelectionComponent.l;
            productSelectionComponent$fetchProductConfigs$2.L$0 = str;
            productSelectionComponent$fetchProductConfigs$2.Z$0 = z;
            productSelectionComponent$fetchProductConfigs$2.Z$1 = z2;
            productSelectionComponent$fetchProductConfigs$2.Z$2 = z3;
            productSelectionComponent$fetchProductConfigs$2.label = 1;
            objA = fetchProductConfigsUseCase.a(productSelectionComponent$fetchProductConfigs$2);
            if (objA != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objA);
                return obj2;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return obj2;
        }
        z3 = productSelectionComponent$fetchProductConfigs$2.Z$2;
        z2 = productSelectionComponent$fetchProductConfigs$2.Z$1;
        z = productSelectionComponent$fetchProductConfigs$2.Z$0;
        str = (String) productSelectionComponent$fetchProductConfigs$2.L$0;
        ResultKt.b(objA);
        boolean z4 = z2;
        boolean z5 = z3;
        ProductFetchResult productFetchResult = (ProductFetchResult) objA;
        if (productFetchResult instanceof ProductFetchResult.Success) {
            productSelectionComponent.b1(null, true);
            AllProductConfigsResponseAppModel allProductConfigsResponseAppModel = ((ProductFetchResult.Success) productFetchResult).f8663a;
            productSelectionComponent$fetchProductConfigs$2.L$0 = null;
            productSelectionComponent$fetchProductConfigs$2.label = 2;
            if (productSelectionComponent.Y0(allProductConfigsResponseAppModel, str, z, z4, z5, productSelectionComponent$fetchProductConfigs$2) == obj) {
                return obj;
            }
            return obj2;
        }
        boolean z6 = z;
        if (!(productFetchResult instanceof ProductFetchResult.FetchFailed) && !Intrinsics.d(productFetchResult, ProductFetchResult.InvalidCity.f8661a) && !(productFetchResult instanceof ProductFetchResult.InvalidResponse) && !(productFetchResult instanceof ProductFetchResult.UnknownError)) {
            throw new NoWhenBranchMatchedException();
        }
        productSelectionComponent.b1(productFetchResult.toString(), false);
        productSelectionComponent$fetchProductConfigs$2.L$0 = null;
        productSelectionComponent$fetchProductConfigs$2.label = 3;
        if (((Boolean) productSelectionComponent.q.getG().getValue()).booleanValue()) {
            Job job = productSelectionComponent.E;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            productSelectionComponent.E = BuildersKt.d(productSelectionComponent.j, null, null, new ProductSelectionComponent$processConfigFetchFailed$3(productSelectionComponent, z6, z4, null), 3);
        } else {
            productSelectionComponent.E0(new yw0(25));
        }
        if (obj2 == obj) {
            return obj;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object G0(ProductSelectionComponent productSelectionComponent, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$getUserRecentBookings$1 productSelectionComponent$getUserRecentBookings$1;
        Flow flow;
        Flow flow2;
        Flow flow3;
        SuperPassRepository superPassRepository = productSelectionComponent.n;
        if (continuationImpl instanceof ProductSelectionComponent$getUserRecentBookings$1) {
            productSelectionComponent$getUserRecentBookings$1 = (ProductSelectionComponent$getUserRecentBookings$1) continuationImpl;
            int i = productSelectionComponent$getUserRecentBookings$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$getUserRecentBookings$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$getUserRecentBookings$1 = new ProductSelectionComponent$getUserRecentBookings$1(productSelectionComponent, continuationImpl);
            }
        } else {
            productSelectionComponent$getUserRecentBookings$1 = new ProductSelectionComponent$getUserRecentBookings$1(productSelectionComponent, continuationImpl);
        }
        Object obj = productSelectionComponent$getUserRecentBookings$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$getUserRecentBookings$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            FlowQuery$mapToList$$inlined$map$1 flowQuery$mapToList$$inlined$map$1G = superPassRepository.b.g(superPassRepository.k());
            productSelectionComponent$getUserRecentBookings$1.L$0 = flowQuery$mapToList$$inlined$map$1G;
            productSelectionComponent$getUserRecentBookings$1.label = 1;
            Object objH = superPassRepository.h(productSelectionComponent$getUserRecentBookings$1);
            if (objH != obj2) {
                flow = flowQuery$mapToList$$inlined$map$1G;
                obj = objH;
            }
            return obj2;
        }
        if (i2 == 1) {
            flow = (Flow) productSelectionComponent$getUserRecentBookings$1.L$0;
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flow2 = (Flow) productSelectionComponent$getUserRecentBookings$1.L$1;
            flow3 = (Flow) productSelectionComponent$getUserRecentBookings$1.L$0;
            ResultKt.b(obj);
        }
        final ProductSelectionComponent$getUserRecentBookings$2 productSelectionComponent$getUserRecentBookings$2 = new ProductSelectionComponent$getUserRecentBookings$2(productSelectionComponent, null);
        final Flow[] flowArr = {flow3, flow2, (Flow) obj};
        return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            public final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
                final /* synthetic */ Function4 $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(Continuation continuation, Function4 function4) {
                    super(3, continuation);
                    this.$transform$inlined = function4;
                }

                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((Continuation) obj3, this.$transform$inlined);
                    anonymousClass2.L$0 = (FlowCollector) obj;
                    anonymousClass2.L$1 = (Object[]) obj2;
                    return anonymousClass2.invokeSuspend(Unit.f17538a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
                
                    if (r1.emit(r8, r7) == r0) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        int r1 = r7.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L20
                        if (r1 == r3) goto L18
                        if (r1 != r2) goto L10
                        kotlin.ResultKt.b(r8)
                        goto L4c
                    L10:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r0)
                        throw r8
                    L18:
                        java.lang.Object r1 = r7.L$0
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        kotlin.ResultKt.b(r8)
                        goto L40
                    L20:
                        kotlin.ResultKt.b(r8)
                        java.lang.Object r8 = r7.L$0
                        r1 = r8
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        java.lang.Object r8 = r7.L$1
                        java.lang.Object[] r8 = (java.lang.Object[]) r8
                        kotlin.jvm.functions.Function4 r4 = r7.$transform$inlined
                        r5 = 0
                        r5 = r8[r5]
                        r6 = r8[r3]
                        r8 = r8[r2]
                        r7.L$0 = r1
                        r7.label = r3
                        java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                        if (r8 != r0) goto L40
                        goto L4b
                    L40:
                        r3 = 0
                        r7.L$0 = r3
                        r7.label = r2
                        java.lang.Object r8 = r1.emit(r8, r7)
                        if (r8 != r0) goto L4c
                    L4b:
                        return r0
                    L4c:
                        kotlin.Unit r8 = kotlin.Unit.f17538a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objA = CombineKt.a(continuation, FlowKt__ZipKt$nullArrayFactory$1.f17827a, new AnonymousClass2(null, productSelectionComponent$getUserRecentBookings$2), flowCollector, flowArr);
                return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
            }
        };
        Flow flow4 = (Flow) obj;
        productSelectionComponent$getUserRecentBookings$1.L$0 = flow;
        productSelectionComponent$getUserRecentBookings$1.L$1 = flow4;
        productSelectionComponent$getUserRecentBookings$1.label = 2;
        Object objQ0 = productSelectionComponent.Q0(productSelectionComponent$getUserRecentBookings$1);
        if (objQ0 != obj2) {
            Flow flow5 = flow;
            flow2 = flow4;
            obj = objQ0;
            flow3 = flow5;
            final Function4 productSelectionComponent$getUserRecentBookings$3 = new ProductSelectionComponent$getUserRecentBookings$2(productSelectionComponent, null);
            final Flow[] flowArr2 = {flow3, flow2, (Flow) obj};
            return new Flow<Object>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
                /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0006\b\u0001\u0010\u0003\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\n¨\u0006\u0007"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineUnsafe$1$1"}, k = 3, mv = {2, 1, 0}, xi = 48)
                @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
                public final class AnonymousClass2 extends SuspendLambda implements Function3<FlowCollector<Object>, Object[], Continuation<? super Unit>, Object> {
                    final /* synthetic */ Function4 $transform$inlined;
                    private /* synthetic */ Object L$0;
                    /* synthetic */ Object L$1;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(Continuation continuation, Function4 function4) {
                        super(3, continuation);
                        this.$transform$inlined = function4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2((Continuation) obj3, this.$transform$inlined);
                        anonymousClass2.L$0 = (FlowCollector) obj;
                        anonymousClass2.L$1 = (Object[]) obj2;
                        return anonymousClass2.invokeSuspend(Unit.f17538a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                        /*
                            r7 = this;
                            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                            int r1 = r7.label
                            r2 = 2
                            r3 = 1
                            if (r1 == 0) goto L20
                            if (r1 == r3) goto L18
                            if (r1 != r2) goto L10
                            kotlin.ResultKt.b(r8)
                            goto L4c
                        L10:
                            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                            r8.<init>(r0)
                            throw r8
                        L18:
                            java.lang.Object r1 = r7.L$0
                            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                            kotlin.ResultKt.b(r8)
                            goto L40
                        L20:
                            kotlin.ResultKt.b(r8)
                            java.lang.Object r8 = r7.L$0
                            r1 = r8
                            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                            java.lang.Object r8 = r7.L$1
                            java.lang.Object[] r8 = (java.lang.Object[]) r8
                            kotlin.jvm.functions.Function4 r4 = r7.$transform$inlined
                            r5 = 0
                            r5 = r8[r5]
                            r6 = r8[r3]
                            r8 = r8[r2]
                            r7.L$0 = r1
                            r7.label = r3
                            java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                            if (r8 != r0) goto L40
                            goto L4b
                        L40:
                            r3 = 0
                            r7.L$0 = r3
                            r7.label = r2
                            java.lang.Object r8 = r1.emit(r8, r7)
                            if (r8 != r0) goto L4c
                        L4b:
                            return r0
                        L4c:
                            kotlin.Unit r8 = kotlin.Unit.f17538a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                    Object objA = CombineKt.a(continuation, FlowKt__ZipKt$nullArrayFactory$1.f17827a, new AnonymousClass2(null, productSelectionComponent$getUserRecentBookings$3), flowCollector, flowArr2);
                    return objA == CoroutineSingletons.COROUTINE_SUSPENDED ? objA : Unit.f17538a;
                }
            };
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(ProductSelectionComponent productSelectionComponent, SuperPass superPass, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$isNotOneTimeOfferPass$1 productSelectionComponent$isNotOneTimeOfferPass$1;
        productSelectionComponent.getClass();
        if (continuationImpl instanceof ProductSelectionComponent$isNotOneTimeOfferPass$1) {
            productSelectionComponent$isNotOneTimeOfferPass$1 = (ProductSelectionComponent$isNotOneTimeOfferPass$1) continuationImpl;
            int i = productSelectionComponent$isNotOneTimeOfferPass$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$isNotOneTimeOfferPass$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$isNotOneTimeOfferPass$1 = new ProductSelectionComponent$isNotOneTimeOfferPass$1(productSelectionComponent, continuationImpl);
            }
        } else {
            productSelectionComponent$isNotOneTimeOfferPass$1 = new ProductSelectionComponent$isNotOneTimeOfferPass$1(productSelectionComponent, continuationImpl);
        }
        Object objInvoke = productSelectionComponent$isNotOneTimeOfferPass$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$isNotOneTimeOfferPass$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            ProductSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1 productSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1 = new ProductSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1(productSelectionComponent, superPass, null);
            productSelectionComponent$isNotOneTimeOfferPass$1.label = 1;
            objInvoke = productSelectionComponent$isNotOneTimeOfferPass$isOneTimeOfferFromOneTimeOfferConfig$1.invoke(productSelectionComponent$isNotOneTimeOfferPass$1);
            if (objInvoke == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objInvoke);
        }
        return Boolean.valueOf(!((Boolean) objInvoke).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:30:0x014b  */
    /* JADX WARN: Code duplicated, block: B:34:0x016f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0173  */
    /* JADX WARN: Code duplicated, block: B:38:0x018e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0194  */
    /* JADX WARN: Code duplicated, block: B:43:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:49:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:53:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0200  */
    /* JADX WARN: Code duplicated, block: B:59:0x021d  */
    /* JADX WARN: Code duplicated, block: B:62:0x022c A[PHI: r1 r2 r6
      0x022c: PHI (r1v25 app.chalo.citydata.data.model.app.RouteAppModel) = (r1v10 app.chalo.citydata.data.model.app.RouteAppModel), (r1v31 app.chalo.citydata.data.model.app.RouteAppModel) binds: [B:60:0x0228, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r2v36 java.lang.Object) = (r2v26 java.lang.Object), (r2v1 java.lang.Object) binds: [B:60:0x0228, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x022c: PHI (r6v23 app.chalo.models.mticketing.MTicket) = (r6v13 app.chalo.models.mticketing.MTicket), (r6v28 app.chalo.models.mticketing.MTicket) binds: [B:60:0x0228, B:18:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0230  */
    /* JADX WARN: Code duplicated, block: B:67:0x0262  */
    /* JADX WARN: Code duplicated, block: B:69:0x027b  */
    /* JADX WARN: Code duplicated, block: B:70:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:73:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x0313  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x032f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0355  */
    /* JADX WARN: Code duplicated, block: B:89:0x0373  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0162, code lost:
    
        if (r2 == r5) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I0(app.chalo.productpurchase.productselection.ui.ProductSelectionComponent r23, app.chalo.models.mticketing.MTicket r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.I0(app.chalo.productpurchase.productselection.ui.ProductSelectionComponent, app.chalo.models.mticketing.MTicket, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final Object J0(ProductSelectionComponent productSelectionComponent, SuperPass superPass, Continuation continuation) {
        AnalyticsContract analyticsContract = productSelectionComponent.m;
        Source source = Source.PRODUCT_SELECTION_RECENT_PRODUCTS;
        SuperPassProperties superPassProperties = superPass.f9560a;
        AnalyticsContractImplKt.b(analyticsContract, "recent product super pass clicked", source, MapsKt.i(new Pair("productSubType", superPassProperties.c.name()), new Pair("passId", superPassProperties.f9566a)), false, 24);
        if (superPass.d.e) {
            Object objN0 = productSelectionComponent.N0(superPass, (ContinuationImpl) continuation);
            if (objN0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objN0;
            }
        } else {
            Object objM0 = productSelectionComponent.M0(superPass, (ContinuationImpl) continuation);
            if (objM0 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objM0;
            }
        }
        return Unit.f17538a;
    }

    public static void f1(ProductSelectionComponent productSelectionComponent, String str, String str2, String str3, RouteAppModel routeAppModel, String str4, Function0 function0, String str5, px0 px0Var, int i) {
        String str6 = (i & 4) != 0 ? null : str3;
        RouteAppModel routeAppModel2 = (i & 8) != 0 ? null : routeAppModel;
        String str7 = (i & 64) != 0 ? null : str5;
        px0 px0Var2 = (i & 128) != 0 ? null : px0Var;
        AnalyticsContract analyticsContract = productSelectionComponent.m;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str6 != null) {
            linkedHashMap.put("reason for disabled product dialog popup", str6);
        }
        if (routeAppModel2 != null) {
            linkedHashMap.put("route name", routeAppModel2.b);
        }
        AnalyticsContractImplKt.b(analyticsContract, "recent product error dialog rendered mTicket", Source.PRODUCT_SELECTION_ACTIVITY, linkedHashMap, false, 24);
        productSelectionComponent.E0(new aj(str, str2, str4, str7, function0, px0Var2));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:53:0x012b  */
    /* JADX WARN: Code duplicated, block: B:55:0x013c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0149  */
    /* JADX WARN: Code duplicated, block: B:62:0x0157  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x017a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0188  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x013f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0168 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0178 -> B:70:0x017b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x0185 -> B:74:0x0186). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object K0(java.util.List r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.K0(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object L0(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$activeProductSectionUIState$1 productSelectionComponent$activeProductSectionUIState$1;
        List list;
        if (continuationImpl instanceof ProductSelectionComponent$activeProductSectionUIState$1) {
            productSelectionComponent$activeProductSectionUIState$1 = (ProductSelectionComponent$activeProductSectionUIState$1) continuationImpl;
            int i = productSelectionComponent$activeProductSectionUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$activeProductSectionUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$activeProductSectionUIState$1 = new ProductSelectionComponent$activeProductSectionUIState$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$activeProductSectionUIState$1 = new ProductSelectionComponent$activeProductSectionUIState$1(this, continuationImpl);
        }
        Object objB = productSelectionComponent$activeProductSectionUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$activeProductSectionUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            productSelectionComponent$activeProductSectionUIState$1.L$0 = arrayList;
            productSelectionComponent$activeProductSectionUIState$1.label = 1;
            objB = this.v.b(StringEnum.BUY_TICKETS_AND_PASSES, new Object[0], productSelectionComponent$activeProductSectionUIState$1);
            if (objB == coroutineSingletons) {
                list = arrayList;
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) productSelectionComponent$activeProductSectionUIState$1.L$0;
            ResultKt.b(objB);
            list = list2;
        }
        list = arrayList;
        ProductSelectionListHeader productSelectionListHeaderB = ProductSelectionContractKt.b(new Integer(22), (String) objB);
        PlotlineWidgetUIState plotlineWidgetUIState = new PlotlineWidgetUIState("productSelectionBanner");
        List list3 = list;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.v(list3, 10));
        Iterator it = list3.iterator();
        while (true) {
            ImageUrlUIState imageUrlUIState = null;
            if (!it.hasNext()) {
                return new ProductSelectionProductsListSectionUIState(productSelectionListHeaderB, plotlineWidgetUIState, null, arrayList2);
            }
            ProductConfigResponseAppModel productConfigResponseAppModel = (ProductConfigResponseAppModel) it.next();
            String strE = AllProductConfigsResponseAppModelKt.e(productConfigResponseAppModel);
            IconType iconType = AllProductConfigsResponseAppModelKt.g(productConfigResponseAppModel) ? IconType.IC_CHALO_BUS_LOGO : null;
            String strF = AllProductConfigsResponseAppModelKt.f(productConfigResponseAppModel);
            if (strF != null && strF.length() > 0) {
                String strF2 = AllProductConfigsResponseAppModelKt.f(productConfigResponseAppModel);
                Intrinsics.f(strF2);
                imageUrlUIState = new ImageUrlUIState(strF2, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            arrayList2.add(ProductSelectionContractKt.a(strE, iconType, imageUrlUIState, productConfigResponseAppModel.getC(), AllProductConfigsResponseAppModelKt.d(productConfigResponseAppModel), AllProductConfigsResponseAppModelKt.a(productConfigResponseAppModel), 1.0f, new fr0(15, this, productConfigResponseAppModel)));
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x025e A[PHI: r1 r2 r8
      0x025e: PHI (r1v20 'lSuperPass' app.chalo.superpass.data.models.entities.SuperPass) = 
      (r1v0 'lSuperPass' app.chalo.superpass.data.models.entities.SuperPass)
      (r1v23 'lSuperPass' app.chalo.superpass.data.models.entities.SuperPass)
     binds: [B:104:0x025a, B:20:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r2v43 java.lang.Object) = (r2v9 java.lang.Object), (r2v1 java.lang.Object) binds: [B:104:0x025a, B:20:0x005d] A[DONT_GENERATE, DONT_INLINE]
      0x025e: PHI (r8v24 int A[IMMUTABLE_TYPE]) = (r8v4 int), (r8v26 int) binds: [B:104:0x025a, B:20:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0271  */
    /* JADX WARN: Code duplicated, block: B:123:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:126:0x0301 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:127:0x0302 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x016c  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01de, code lost:
    
        if (r2 == r6) goto L126;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M0(app.chalo.superpass.data.models.entities.SuperPass r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.M0(app.chalo.superpass.data.models.entities.SuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x010f  */
    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0131  */
    /* JADX WARN: Code duplicated, block: B:60:0x0147  */
    /* JADX WARN: Code duplicated, block: B:62:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0154 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object N0(SuperPass superPass, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1 productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1;
        SuperPassRepurchaseProperties superPassRepurchaseProperties;
        SuperPass superPass2;
        int i;
        ProductSelectionComponent productSelectionComponent;
        SuperPass superPass3;
        int i2;
        boolean z;
        SuperPass superPass4;
        ProductSelectionComponent productSelectionComponent2;
        SuperPass superPass5;
        int i3;
        String str;
        Object objB;
        String str2;
        SuperPass superPass6;
        if (continuationImpl instanceof ProductSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1) {
            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1 = (ProductSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1) continuationImpl;
            int i4 = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1.label = i4 - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1 = new ProductSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1 = new ProductSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1(this, continuationImpl);
        }
        ProductSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1 productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2 = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$1;
        Object objB2 = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label;
        Unit unit = Unit.f17538a;
        StringProvider stringProvider = this.v;
        switch (i5) {
            case 0:
                ResultKt.b(objB2);
                superPassRepurchaseProperties = superPass.d;
                if (superPassRepurchaseProperties.f) {
                    int i6 = superPass.getC().f9578a;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = superPass;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPassRepurchaseProperties;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = i6;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 3;
                    Object objC = this.s.c(productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                    if (objC != coroutineSingletons) {
                        superPass2 = superPass;
                        i = i6;
                        objB2 = objC;
                        long jLongValue = ((Number) objB2).longValue();
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = superPass2;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 4;
                        objB2 = superPassRepurchaseProperties.a(i, jLongValue);
                        if (objB2 != coroutineSingletons) {
                            superPass4 = superPass2;
                            if (((Boolean) objB2).booleanValue()) {
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = this;
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass4;
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = 0;
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 5;
                                objB2 = stringProvider.b(StringEnum.VALIDITY_EXPIRED, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                                if (objB2 != coroutineSingletons) {
                                    productSelectionComponent2 = this;
                                    superPass5 = superPass4;
                                    i3 = 0;
                                    str = (String) objB2;
                                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = productSelectionComponent2;
                                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass5;
                                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = str;
                                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = i3;
                                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 6;
                                    objB = stringProvider.b(StringEnum.VALIDITY_EXPIRED_DESC, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                                    if (objB != coroutineSingletons) {
                                        SuperPass superPass7 = superPass5;
                                        str2 = str;
                                        objB2 = objB;
                                        superPass6 = superPass7;
                                        z = i3 != 0;
                                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = null;
                                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 7;
                                        if (productSelectionComponent2.g1(z, superPass6, str2, (String) objB2, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) == coroutineSingletons) {
                                            return unit;
                                        }
                                    }
                                }
                            } else {
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 8;
                                if (M0(superPass4, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) != coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    }
                } else {
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = this;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = 0;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 1;
                    objB2 = stringProvider.b(StringEnum.PRODUCT_NOT_RENEWABLE, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                    if (objB2 != coroutineSingletons) {
                        productSelectionComponent = this;
                        superPass3 = superPass;
                        i2 = 0;
                        z = i2 != 0;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 2;
                        if (productSelectionComponent.g1(z, superPass3, null, (String) objB2, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) != coroutineSingletons) {
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i2 = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0;
                SuperPass superPass8 = (SuperPass) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1;
                ProductSelectionComponent productSelectionComponent3 = (ProductSelectionComponent) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0;
                ResultKt.b(objB2);
                superPass3 = superPass8;
                productSelectionComponent = productSelectionComponent3;
                if (i2 != 0) {
                }
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 2;
                if (productSelectionComponent.g1(z, superPass3, null, (String) objB2, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) != coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 2:
                ResultKt.b(objB2);
                return unit;
            case 3:
                i = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0;
                superPassRepurchaseProperties = (SuperPassRepurchaseProperties) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1;
                superPass2 = (SuperPass) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0;
                ResultKt.b(objB2);
                long jLongValue2 = ((Number) objB2).longValue();
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = superPass2;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 4;
                objB2 = superPassRepurchaseProperties.a(i, jLongValue2);
                if (objB2 != coroutineSingletons) {
                    superPass4 = superPass2;
                    if (((Boolean) objB2).booleanValue()) {
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = this;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass4;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = 0;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 5;
                        objB2 = stringProvider.b(StringEnum.VALIDITY_EXPIRED, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                        if (objB2 != coroutineSingletons) {
                            productSelectionComponent2 = this;
                            superPass5 = superPass4;
                            i3 = 0;
                            str = (String) objB2;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = productSelectionComponent2;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass5;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = str;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = i3;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 6;
                            objB = stringProvider.b(StringEnum.VALIDITY_EXPIRED_DESC, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                            if (objB != coroutineSingletons) {
                                SuperPass superPass9 = superPass5;
                                str2 = str;
                                objB2 = objB;
                                superPass6 = superPass9;
                                if (i3 != 0) {
                                }
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = null;
                                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 7;
                                if (productSelectionComponent2.g1(z, superPass6, str2, (String) objB2, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) == coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    } else {
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 8;
                        if (M0(superPass4, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) != coroutineSingletons) {
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                superPass4 = (SuperPass) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0;
                ResultKt.b(objB2);
                if (((Boolean) objB2).booleanValue()) {
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = this;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass4;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = 0;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 5;
                    objB2 = stringProvider.b(StringEnum.VALIDITY_EXPIRED, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                    if (objB2 != coroutineSingletons) {
                        productSelectionComponent2 = this;
                        superPass5 = superPass4;
                        i3 = 0;
                        str = (String) objB2;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = productSelectionComponent2;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass5;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = str;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = i3;
                        productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 6;
                        objB = stringProvider.b(StringEnum.VALIDITY_EXPIRED_DESC, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                        if (objB != coroutineSingletons) {
                            SuperPass superPass10 = superPass5;
                            str2 = str;
                            objB2 = objB;
                            superPass6 = superPass10;
                            if (i3 != 0) {
                            }
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = null;
                            productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 7;
                            if (productSelectionComponent2.g1(z, superPass6, str2, (String) objB2, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) == coroutineSingletons) {
                                return unit;
                            }
                        }
                    }
                } else {
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 8;
                    if (M0(superPass4, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) != coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 5:
                i3 = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0;
                superPass5 = (SuperPass) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1;
                productSelectionComponent2 = (ProductSelectionComponent) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0;
                ResultKt.b(objB2);
                str = (String) objB2;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = productSelectionComponent2;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = superPass5;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = str;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0 = i3;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 6;
                objB = stringProvider.b(StringEnum.VALIDITY_EXPIRED_DESC, new Object[0], productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2);
                if (objB != coroutineSingletons) {
                    SuperPass superPass11 = superPass5;
                    str2 = str;
                    objB2 = objB;
                    superPass6 = superPass11;
                    if (i3 != 0) {
                    }
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = null;
                    productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 7;
                    if (productSelectionComponent2.g1(z, superPass6, str2, (String) objB2, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 6:
                i3 = productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.I$0;
                str2 = (String) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2;
                superPass6 = (SuperPass) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1;
                productSelectionComponent2 = (ProductSelectionComponent) productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0;
                ResultKt.b(objB2);
                if (i3 != 0) {
                }
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$0 = null;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$1 = null;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.L$2 = null;
                productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2.label = 7;
                if (productSelectionComponent2.g1(z, superPass6, str2, (String) objB2, productSelectionComponent$checkAndLaunchRenewFlowIfAvailable$2) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 7:
                ResultKt.b(objB2);
                return unit;
            case 8:
                ResultKt.b(objB2);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        if (r2 == r4) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0106, code lost:
    
        if (r2 == r4) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O0(app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel.SingleJourneyTicketAppModel r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.O0(app.chalo.productpurchase.productselection.data.models.app.ProductConfigResponseAppModel$SingleJourneyTicketAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0144  */
    /* JADX WARN: Code duplicated, block: B:36:0x0171  */
    /* JADX WARN: Code duplicated, block: B:41:0x0192  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:46:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:49:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:68:0x021f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0234  */
    /* JADX WARN: Code duplicated, block: B:71:0x023b  */
    /* JADX WARN: Code duplicated, block: B:73:0x023f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0254  */
    /* JADX WARN: Code duplicated, block: B:79:0x025f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x0265  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x020e, code lost:
    
        if (r2 == r4) goto L75;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.productpurchase.productselection.ui.ProductSelectionDataState r25, kotlin.coroutines.jvm.internal.ContinuationImpl r26) {
        /*
            Method dump skipped, instruction units count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.p0(app.chalo.productpurchase.productselection.ui.ProductSelectionDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q0(ContinuationImpl continuationImpl) {
        ProductSelectionComponent$getMTicketsFlow$1 productSelectionComponent$getMTicketsFlow$1;
        if (continuationImpl instanceof ProductSelectionComponent$getMTicketsFlow$1) {
            productSelectionComponent$getMTicketsFlow$1 = (ProductSelectionComponent$getMTicketsFlow$1) continuationImpl;
            int i = productSelectionComponent$getMTicketsFlow$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$getMTicketsFlow$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$getMTicketsFlow$1 = new ProductSelectionComponent$getMTicketsFlow$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$getMTicketsFlow$1 = new ProductSelectionComponent$getMTicketsFlow$1(this, continuationImpl);
        }
        Object objA = productSelectionComponent$getMTicketsFlow$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$getMTicketsFlow$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            productSelectionComponent$getMTicketsFlow$1.label = 1;
            objA = this.r.a(productSelectionComponent$getMTicketsFlow$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return !((InstantTicketFeatureConfigForCity) objA).a(this.s.h()) ? this.o.k() : new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2(EmptyList.f17557a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0058  */
    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:22:0x008f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x0097  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0090 -> B:24:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object R0(java.util.Map r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$getPassengerString$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$getPassengerString$1 r0 = (app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$getPassengerString$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$getPassengerString$1 r0 = new app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$getPassengerString$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r7 = r0.L$3
            java.lang.StringBuilder r7 = (java.lang.StringBuilder) r7
            java.lang.Object r2 = r0.L$2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.L$1
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r0.L$0
            java.lang.StringBuilder r5 = (java.lang.StringBuilder) r5
            kotlin.ResultKt.b(r8)
            goto L92
        L37:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3f:
            kotlin.ResultKt.b(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
            r2 = 0
            r4 = r7
            r7 = r8
        L52:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9e
            java.lang.Object r8 = r4.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r5 = r8.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r8.getValue()
            app.chalo.models.mticketing.MTicketPassengerInfo r8 = (app.chalo.models.mticketing.MTicketPassengerInfo) r8
            if (r2 == 0) goto L71
            java.lang.String r2 = ","
            r7.append(r2)
        L71:
            int r8 = r8.d
            r7.append(r8)
            java.lang.String r8 = " "
            r7.append(r8)
            r0.L$0 = r7
            r0.L$1 = r4
            r0.L$2 = r5
            r0.L$3 = r7
            r0.label = r3
            app.chalo.models.mticketing.MTicketUtilsHelper r8 = r6.A
            app.chalo.datastore.LocalDataStore r8 = r8.i
            java.lang.Object r8 = r8.f(r5, r0)
            if (r8 != r1) goto L90
            return r1
        L90:
            r2 = r5
            r5 = r7
        L92:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L97
            goto L98
        L97:
            r2 = r8
        L98:
            r7.append(r2)
            r2 = r3
            r7 = r5
            goto L52
        L9e:
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.h(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.R0(java.util.Map, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object S0(final ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$getRenewErrorDialogUIState$1 productSelectionComponent$getRenewErrorDialogUIState$1;
        String str;
        DialogUIStateFactory dialogUIStateFactory;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError2;
        String str7;
        String str8;
        DialogUIStateFactory dialogUIStateFactory2;
        if (continuationImpl instanceof ProductSelectionComponent$getRenewErrorDialogUIState$1) {
            productSelectionComponent$getRenewErrorDialogUIState$1 = (ProductSelectionComponent$getRenewErrorDialogUIState$1) continuationImpl;
            int i = productSelectionComponent$getRenewErrorDialogUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$getRenewErrorDialogUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$getRenewErrorDialogUIState$1 = new ProductSelectionComponent$getRenewErrorDialogUIState$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$getRenewErrorDialogUIState$1 = new ProductSelectionComponent$getRenewErrorDialogUIState$1(this, continuationImpl);
        }
        Object obj = productSelectionComponent$getRenewErrorDialogUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$getRenewErrorDialogUIState$1.label;
        StringProvider stringProvider = this.v;
        if (i2 == 0) {
            ResultKt.b(obj);
            String str9 = superPassRenewError.c;
            str = superPassRenewError.d;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$0 = superPassRenewError;
            dialogUIStateFactory = DialogUIStateFactory.f9989a;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$1 = dialogUIStateFactory;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$2 = str9;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$3 = str;
            productSelectionComponent$getRenewErrorDialogUIState$1.label = 1;
            Object objB = stringProvider.b(StringEnum.OKAY, new Object[0], productSelectionComponent$getRenewErrorDialogUIState$1);
            if (objB != coroutineSingletons) {
                str2 = str9;
                obj = objB;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str10 = (String) productSelectionComponent$getRenewErrorDialogUIState$1.L$3;
            String str11 = (String) productSelectionComponent$getRenewErrorDialogUIState$1.L$2;
            DialogUIStateFactory dialogUIStateFactory3 = (DialogUIStateFactory) productSelectionComponent$getRenewErrorDialogUIState$1.L$1;
            ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError3 = (ProductSelectionErrorDialog.SuperPassRenewError) productSelectionComponent$getRenewErrorDialogUIState$1.L$0;
            ResultKt.b(obj);
            dialogUIStateFactory = dialogUIStateFactory3;
            str2 = str11;
            str = str10;
            superPassRenewError = superPassRenewError3;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str7 = (String) productSelectionComponent$getRenewErrorDialogUIState$1.L$4;
            str4 = (String) productSelectionComponent$getRenewErrorDialogUIState$1.L$3;
            str8 = (String) productSelectionComponent$getRenewErrorDialogUIState$1.L$2;
            dialogUIStateFactory2 = (DialogUIStateFactory) productSelectionComponent$getRenewErrorDialogUIState$1.L$1;
            superPassRenewError2 = (ProductSelectionErrorDialog.SuperPassRenewError) productSelectionComponent$getRenewErrorDialogUIState$1.L$0;
            ResultKt.b(obj);
        }
        String str12 = str8;
        str6 = str7;
        superPassRenewError = superPassRenewError2;
        str5 = str12;
        dialogUIStateFactory = dialogUIStateFactory2;
        str3 = (String) obj;
        final int i3 = 0;
        Function0 function0 = new Function0(this) { // from class: qx0
            public final /* synthetic */ ProductSelectionComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError4 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(true, superPassRenewError4.f8676a, superPassRenewError4.b, superPassRenewError4.e));
                        break;
                    default:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError5 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(false, superPassRenewError5.f8676a, superPassRenewError5.b, superPassRenewError5.e));
                        break;
                }
                return Unit.f17538a;
            }
        };
        final int i4 = 1;
        Function0 function1 = new Function0(this) { // from class: qx0
            public final /* synthetic */ ProductSelectionComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError4 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(true, superPassRenewError4.f8676a, superPassRenewError4.b, superPassRenewError4.e));
                        break;
                    default:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError5 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(false, superPassRenewError5.f8676a, superPassRenewError5.b, superPassRenewError5.e));
                        break;
                }
                return Unit.f17538a;
            }
        };
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.b(str5, str4, str6, str3, function0, function1);
        String str13 = (String) obj;
        if (superPassRenewError.f8676a) {
            productSelectionComponent$getRenewErrorDialogUIState$1.L$0 = superPassRenewError;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$1 = dialogUIStateFactory;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$2 = str2;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$3 = str;
            productSelectionComponent$getRenewErrorDialogUIState$1.L$4 = str13;
            productSelectionComponent$getRenewErrorDialogUIState$1.label = 2;
            Object objB2 = stringProvider.b(StringEnum.CANCEL_CAPS, new Object[0], productSelectionComponent$getRenewErrorDialogUIState$1);
            if (objB2 != coroutineSingletons) {
                superPassRenewError2 = superPassRenewError;
                str7 = str13;
                obj = objB2;
                str4 = str;
                str8 = str2;
                dialogUIStateFactory2 = dialogUIStateFactory;
                String str14 = str8;
                str6 = str7;
                superPassRenewError = superPassRenewError2;
                str5 = str14;
                dialogUIStateFactory = dialogUIStateFactory2;
                str3 = (String) obj;
            }
            return coroutineSingletons;
        }
        str3 = null;
        str4 = str;
        str5 = str2;
        str6 = str13;
        final int i5 = 0;
        Function0 function2 = new Function0(this) { // from class: qx0
            public final /* synthetic */ ProductSelectionComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError4 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(true, superPassRenewError4.f8676a, superPassRenewError4.b, superPassRenewError4.e));
                        break;
                    default:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError5 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(false, superPassRenewError5.f8676a, superPassRenewError5.b, superPassRenewError5.e));
                        break;
                }
                return Unit.f17538a;
            }
        };
        final int i6 = 1;
        Function0 function3 = new Function0(this) { // from class: qx0
            public final /* synthetic */ ProductSelectionComponent b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError4 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(true, superPassRenewError4.f8676a, superPassRenewError4.b, superPassRenewError4.e));
                        break;
                    default:
                        ProductSelectionErrorDialog.SuperPassRenewError superPassRenewError5 = superPassRenewError;
                        this.b.Z0(new ProductSelectionIntent.PassRenewConfirmationDialogClickIntent(false, superPassRenewError5.f8676a, superPassRenewError5.b, superPassRenewError5.e));
                        break;
                }
                return Unit.f17538a;
            }
        };
        dialogUIStateFactory.getClass();
        return DialogUIStateFactory.b(str5, str4, str6, str3, function2, function3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T0(String str, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$getSJTConfigForAgency$1 productSelectionComponent$getSJTConfigForAgency$1;
        ProductConfigResponseAppModel productConfigResponseAppModel;
        Object next;
        if (continuationImpl instanceof ProductSelectionComponent$getSJTConfigForAgency$1) {
            productSelectionComponent$getSJTConfigForAgency$1 = (ProductSelectionComponent$getSJTConfigForAgency$1) continuationImpl;
            int i = productSelectionComponent$getSJTConfigForAgency$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$getSJTConfigForAgency$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$getSJTConfigForAgency$1 = new ProductSelectionComponent$getSJTConfigForAgency$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$getSJTConfigForAgency$1 = new ProductSelectionComponent$getSJTConfigForAgency$1(this, continuationImpl);
        }
        Object objE = productSelectionComponent$getSJTConfigForAgency$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$getSJTConfigForAgency$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            productSelectionComponent$getSJTConfigForAgency$1.L$0 = str;
            productSelectionComponent$getSJTConfigForAgency$1.label = 1;
            objE = this.C.e(productSelectionComponent$getSJTConfigForAgency$1);
            if (objE == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) productSelectionComponent$getSJTConfigForAgency$1.L$0;
            ResultKt.b(objE);
        }
        List list = (List) objE;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                ProductConfigResponseAppModel productConfigResponseAppModel2 = (ProductConfigResponseAppModel) next;
                if ((productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) && StringsKt.x(((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel2).t, str, true)) {
                    break;
                }
            }
            productConfigResponseAppModel = (ProductConfigResponseAppModel) next;
        } else {
            productConfigResponseAppModel = null;
        }
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
            return (ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0105  */
    /* JADX WARN: Code duplicated, block: B:51:0x0115  */
    /* JADX WARN: Code duplicated, block: B:52:0x0119  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object U0(List list, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$inactiveProductSectionUIState$1 productSelectionComponent$inactiveProductSectionUIState$1;
        String str;
        Object objB;
        String text;
        List list2;
        ArrayList arrayList;
        IconType iconType;
        String strF;
        ImageUrlUIState imageUrlUIState;
        List list3 = list;
        if (continuationImpl instanceof ProductSelectionComponent$inactiveProductSectionUIState$1) {
            productSelectionComponent$inactiveProductSectionUIState$1 = (ProductSelectionComponent$inactiveProductSectionUIState$1) continuationImpl;
            int i = productSelectionComponent$inactiveProductSectionUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$inactiveProductSectionUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$inactiveProductSectionUIState$1 = new ProductSelectionComponent$inactiveProductSectionUIState$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$inactiveProductSectionUIState$1 = new ProductSelectionComponent$inactiveProductSectionUIState$1(this, continuationImpl);
        }
        Object obj = productSelectionComponent$inactiveProductSectionUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$inactiveProductSectionUIState$1.label;
        StringProvider stringProvider = this.v;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProductConfigResponseAppModel productConfigResponseAppModel = (ProductConfigResponseAppModel) CollectionsKt.L(0, list3);
            if (productConfigResponseAppModel == null) {
                str = null;
            } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
                str = ((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel).z;
            } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
                str = ((ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel).F;
            } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
                str = ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel).F;
            } else {
                if (!(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) && !(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) && !(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) && !(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
            }
            productSelectionComponent$inactiveProductSectionUIState$1.L$0 = list3;
            productSelectionComponent$inactiveProductSectionUIState$1.L$1 = str;
            productSelectionComponent$inactiveProductSectionUIState$1.label = 1;
            objB = stringProvider.b(StringEnum.INACTIVE_PLANS_DESC, new Object[0], productSelectionComponent$inactiveProductSectionUIState$1);
            if (objB != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str2 = (String) productSelectionComponent$inactiveProductSectionUIState$1.L$1;
            List list4 = (List) productSelectionComponent$inactiveProductSectionUIState$1.L$0;
            ResultKt.b(obj);
            str = str2;
            list3 = list4;
            objB = obj;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) productSelectionComponent$inactiveProductSectionUIState$1.L$1;
            list2 = (List) productSelectionComponent$inactiveProductSectionUIState$1.L$0;
            ResultKt.b(obj);
            text = str3;
        }
        ProductSelectionListHeader productSelectionListHeaderB = ProductSelectionContractKt.b(null, (String) obj);
        Intrinsics.i(text, "text");
        ProductAnnouncementTextUIState productAnnouncementTextUIState = new ProductAnnouncementTextUIState(new TextUIState.ChaloTextUIState(text, UITextStyle.BodyMedium, ChaloColorToken.Black_90.f9769a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
        List<ProductConfigResponseAppModel> list5 = list2;
        arrayList = new ArrayList(CollectionsKt.v(list5, 10));
        for (ProductConfigResponseAppModel productConfigResponseAppModel2 : list5) {
            String strE = AllProductConfigsResponseAppModelKt.e(productConfigResponseAppModel2);
            if (AllProductConfigsResponseAppModelKt.g(productConfigResponseAppModel2)) {
                iconType = IconType.IC_CHALO_BUS_LOGO;
            } else {
                iconType = null;
            }
            strF = AllProductConfigsResponseAppModelKt.f(productConfigResponseAppModel2);
            if (strF != null || strF.length() <= 0) {
                imageUrlUIState = null;
            } else {
                String strF2 = AllProductConfigsResponseAppModelKt.f(productConfigResponseAppModel2);
                Intrinsics.f(strF2);
                imageUrlUIState = new ImageUrlUIState(strF2, null, null, null, WebSocketProtocol.PAYLOAD_SHORT);
            }
            arrayList.add(ProductSelectionContractKt.a(strE, iconType, imageUrlUIState, productConfigResponseAppModel2.getC(), AllProductConfigsResponseAppModelKt.d(productConfigResponseAppModel2), AllProductConfigsResponseAppModelKt.a(productConfigResponseAppModel2), 0.4f, null));
        }
        return new ProductSelectionProductsListSectionUIState(productSelectionListHeaderB, null, productAnnouncementTextUIState, arrayList);
        String strB = StringExtsKt.b(str, (String) objB);
        productSelectionComponent$inactiveProductSectionUIState$1.L$0 = list3;
        productSelectionComponent$inactiveProductSectionUIState$1.L$1 = strB;
        productSelectionComponent$inactiveProductSectionUIState$1.label = 2;
        Object objB2 = stringProvider.b(StringEnum.INACTIVE_PASSES, new Object[0], productSelectionComponent$inactiveProductSectionUIState$1);
        if (objB2 != coroutineSingletons) {
            text = strB;
            obj = objB2;
            list2 = list3;
            ProductSelectionListHeader productSelectionListHeaderB2 = ProductSelectionContractKt.b(null, (String) obj);
            Intrinsics.i(text, "text");
            ProductAnnouncementTextUIState productAnnouncementTextUIState2 = new ProductAnnouncementTextUIState(new TextUIState.ChaloTextUIState(text, UITextStyle.BodyMedium, ChaloColorToken.Black_90.f9769a, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184));
            List<ProductConfigResponseAppModel> list6 = list2;
            arrayList = new ArrayList(CollectionsKt.v(list6, 10));
            while (r3.hasNext()) {
                String strE2 = AllProductConfigsResponseAppModelKt.e(productConfigResponseAppModel2);
                if (AllProductConfigsResponseAppModelKt.g(productConfigResponseAppModel2)) {
                    iconType = IconType.IC_CHALO_BUS_LOGO;
                } else {
                    iconType = null;
                }
                strF = AllProductConfigsResponseAppModelKt.f(productConfigResponseAppModel2);
                if (strF != null) {
                    imageUrlUIState = null;
                } else {
                    imageUrlUIState = null;
                }
                arrayList.add(ProductSelectionContractKt.a(strE2, iconType, imageUrlUIState, productConfigResponseAppModel2.getC(), AllProductConfigsResponseAppModelKt.d(productConfigResponseAppModel2), AllProductConfigsResponseAppModelKt.a(productConfigResponseAppModel2), 0.4f, null));
            }
            return new ProductSelectionProductsListSectionUIState(productSelectionListHeaderB2, null, productAnnouncementTextUIState2, arrayList);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    public final Object V0(ProductConfigResponseAppModel productConfigResponseAppModel, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1;
        ProductConfigResponseAppModel productConfigResponseAppModel2;
        ?? r8;
        if (continuationImpl instanceof ProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1) {
            productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = (ProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1) continuationImpl;
            int i = productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = new ProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1 = new ProductSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1(this, continuationImpl);
        }
        Object objV = productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(objV);
            Flow flowA = this.u.a(productConfigResponseAppModel.getF8638a());
            productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0 = productConfigResponseAppModel;
            productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = 1;
            objV = FlowKt.v(flowA, productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            productConfigResponseAppModel = (ProductConfigResponseAppModel) productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0;
            ResultKt.b(objV);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.I$0;
            productConfigResponseAppModel2 = (ProductConfigResponseAppModel) productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0;
            ResultKt.b(objV);
            r8 = i3;
        }
        if (OneTimeOfferConfigAppModelKt.a((OneTimeOfferConfigAppModel) objV, productConfigResponseAppModel2.getF8638a()) && r8 != 0) {
            z = true;
        }
        return Boolean.valueOf(z);
        Boolean bool = (Boolean) objV;
        ?? BooleanValue = bool != null ? bool.booleanValue() : 0;
        productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.L$0 = productConfigResponseAppModel;
        productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.I$0 = BooleanValue;
        productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1.label = 2;
        Object objA = this.p.a(productSelectionComponent$isOneTimeOfferAndHasUserAvailedIt$1);
        if (objA != coroutineSingletons) {
            productConfigResponseAppModel2 = productConfigResponseAppModel;
            r8 = BooleanValue;
            objV = objA;
            if (OneTimeOfferConfigAppModelKt.a((OneTimeOfferConfigAppModel) objV, productConfigResponseAppModel2.getF8638a())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return coroutineSingletons;
    }

    public final void W0(BookableSuperPassConfiguration bookableSuperPassConfiguration, SuperPass lSuperPass) {
        if (bookableSuperPassConfiguration != null) {
            Source lSource = Source.SOURCE_BOOKING_SUMMARY_SUPER_PASS_ACTIVITY;
            this.z.getClass();
            Intrinsics.i(lSource, "lSource");
            Intrinsics.i(lSuperPass, "lSuperPass");
            BookableSuperPassConfiguration.INSTANCE.getClass();
            String strA = BookableSuperPassConfiguration.Companion.a(bookableSuperPassConfiguration);
            String str = lSuperPass.f9560a.f9566a;
            SuperPassUserDetails.Companion companion = SuperPassUserDetails.INSTANCE;
            SuperPassUserDetails superPassUserDetails = lSuperPass.getC().c;
            companion.getClass();
            this.t.b(new ChaloNavigationRequest.Navigate(new SuperPassPurchaseArgs.ConfirmSuperPassPurchaseArgs.Renew(lSource, strA, SuperPassUserDetails.Companion.a(superPassUserDetails), str, lSuperPass.d.d, PostPassPurchaseSuccessFlowType.ACTIVATION), null, "PassPurchaseFlowTag", 2));
        }
    }

    public final boolean X0(ProductConfigResponseAppModel.SuperPassConfigAppModel superPassConfigAppModel, boolean z) {
        SceneArgs passSelectionArgs;
        SceneArgs passPurchase;
        String str = superPassConfigAppModel.l;
        if (!StringsKt.x(str, "rideBasedPass", true) && !StringsKt.x(str, "magicPass", true)) {
            passPurchase = null;
        } else if (superPassConfigAppModel.I.contains(ProductConfigServiceType.PREMIUM)) {
            List list = superPassConfigAppModel.E;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((SuperPassProductConfigSubCategoryResponseAppModel) obj).d) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.size() == 1) {
                String str2 = superPassConfigAppModel.j;
                Source source = Source.PRODUCT_SELECTION_ACTIVITY;
                passPurchase = new PassSelectionArgs(str2, source, source, (String) null, (PostPassPurchaseSuccessFlowType) null, 56);
            } else {
                passSelectionArgs = new PremiumBusArgs.StopSelectionArgs(superPassConfigAppModel.j, true, false, Source.PRODUCT_SELECTION_ACTIVITY, (String) null, 16);
                passPurchase = passSelectionArgs;
            }
        } else if (superPassConfigAppModel.J) {
            passPurchase = new TicketPurchaseArgs.StopSelectionArgs.PassPurchase(superPassConfigAppModel.j);
        } else {
            String str3 = superPassConfigAppModel.j;
            Source source2 = Source.PRODUCT_SELECTION_ACTIVITY;
            passSelectionArgs = new PassSelectionArgs(str3, source2, source2, (String) null, (PostPassPurchaseSuccessFlowType) null, 56);
            passPurchase = passSelectionArgs;
        }
        if (passPurchase == null) {
            return false;
        }
        this.t.b(new ChaloNavigationRequest.Navigate(passPurchase, new ChaloNavOptions(z ? new PopUpToConfig.Scene(ChaloScenes.ProductSelection, true) : PopUpToConfig.None.f9220a, 3), null, 4));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:104:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:108:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:115:0x0226  */
    /* JADX WARN: Code duplicated, block: B:117:0x0240  */
    /* JADX WARN: Code duplicated, block: B:118:0x0242  */
    /* JADX WARN: Code duplicated, block: B:121:0x024d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0261  */
    /* JADX WARN: Code duplicated, block: B:130:0x028b  */
    /* JADX WARN: Code duplicated, block: B:133:0x029c  */
    /* JADX WARN: Code duplicated, block: B:138:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:141:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:147:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:151:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x0203 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:164:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0296 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:0x02d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x02c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:45:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:66:0x016e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0173  */
    /* JADX WARN: Code duplicated, block: B:70:0x0179  */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0187  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0194  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:79:0x019a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x019e  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:88:0x01af  */
    /* JADX WARN: Code duplicated, block: B:90:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:94:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:96:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c7  */
    /* JADX WARN: Type inference failed for: r3v11, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v20, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v23, types: [T, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
    public final Object Y0(AllProductConfigsResponseAppModel allProductConfigsResponseAppModel, String str, boolean z, boolean z2, boolean z3, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$processConfigFetchSuccess$1 productSelectionComponent$processConfigFetchSuccess$1;
        boolean z4;
        boolean z5;
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModel2;
        String str2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str3;
        AllProductConfigsResponseAppModel allProductConfigsResponseAppModel3;
        List list;
        int i;
        Unit unit;
        Ref.ObjectRef objectRef;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        int size;
        int i2;
        LinkedHashMap linkedHashMap2;
        ?? V0;
        Job job;
        ?? r4;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        Object next;
        int g;
        Object next2;
        int g2;
        String f8638a;
        Object arrayList4;
        ProductConfigResponseAppModel productConfigResponseAppModel;
        boolean f;
        ProductGroup productGroup;
        ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel unknownProductConfigApiResponseModel;
        Iterator it2;
        Object next3;
        ProductConfigResponseAppModel productConfigResponseAppModel2;
        boolean zX0;
        if (continuationImpl instanceof ProductSelectionComponent$processConfigFetchSuccess$1) {
            productSelectionComponent$processConfigFetchSuccess$1 = (ProductSelectionComponent$processConfigFetchSuccess$1) continuationImpl;
            int i3 = productSelectionComponent$processConfigFetchSuccess$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$processConfigFetchSuccess$1.label = i3 - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$processConfigFetchSuccess$1 = new ProductSelectionComponent$processConfigFetchSuccess$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$processConfigFetchSuccess$1 = new ProductSelectionComponent$processConfigFetchSuccess$1(this, continuationImpl);
        }
        Object obj = productSelectionComponent$processConfigFetchSuccess$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = productSelectionComponent$processConfigFetchSuccess$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            productSelectionComponent$processConfigFetchSuccess$1.L$0 = allProductConfigsResponseAppModel;
            productSelectionComponent$processConfigFetchSuccess$1.L$1 = str;
            z4 = z;
            productSelectionComponent$processConfigFetchSuccess$1.Z$0 = z4;
            z5 = z2;
            productSelectionComponent$processConfigFetchSuccess$1.Z$1 = z5;
            productSelectionComponent$processConfigFetchSuccess$1.Z$2 = z3;
            productSelectionComponent$processConfigFetchSuccess$1.label = 1;
            Object objA = this.r.a(productSelectionComponent$processConfigFetchSuccess$1);
            if (objA != obj2) {
                allProductConfigsResponseAppModel2 = allProductConfigsResponseAppModel;
                obj = objA;
                str2 = str;
                z6 = z3;
            }
            return obj2;
        }
        if (i4 == 1) {
            z6 = productSelectionComponent$processConfigFetchSuccess$1.Z$2;
            boolean z9 = productSelectionComponent$processConfigFetchSuccess$1.Z$1;
            boolean z10 = productSelectionComponent$processConfigFetchSuccess$1.Z$0;
            str2 = (String) productSelectionComponent$processConfigFetchSuccess$1.L$1;
            allProductConfigsResponseAppModel2 = (AllProductConfigsResponseAppModel) productSelectionComponent$processConfigFetchSuccess$1.L$0;
            ResultKt.b(obj);
            z5 = z9;
            z4 = z10;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z7 = productSelectionComponent$processConfigFetchSuccess$1.Z$3;
            z6 = productSelectionComponent$processConfigFetchSuccess$1.Z$2;
            z8 = productSelectionComponent$processConfigFetchSuccess$1.Z$1;
            z4 = productSelectionComponent$processConfigFetchSuccess$1.Z$0;
            str3 = (String) productSelectionComponent$processConfigFetchSuccess$1.L$1;
            allProductConfigsResponseAppModel3 = (AllProductConfigsResponseAppModel) productSelectionComponent$processConfigFetchSuccess$1.L$0;
            ResultKt.b(obj);
        }
        list = (List) obj;
        i = 3;
        unit = Unit.f17538a;
        if (str3 != null) {
            it2 = list.iterator();
            do {
                if (it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!Intrinsics.d(((ProductConfigResponseAppModel) next3).getF8638a(), str3));
            productConfigResponseAppModel2 = (ProductConfigResponseAppModel) next3;
            if (productConfigResponseAppModel2 != null && productConfigResponseAppModel2.getE()) {
                if (productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
                    zX0 = X0((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel2, true);
                } else {
                    if (productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
                        if (!z7) {
                            this.t.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.MTicketTripInfoArgs(((ProductSelectionDataState) this.f.getValue()).f8674a, null, ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel2).j), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.ProductSelection, true), i), null, 4));
                            zX0 = true;
                        }
                    } else if (!(productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) && !(productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) && !(productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) && !(productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) && !(productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    zX0 = false;
                }
                if (zX0) {
                    return unit;
                }
            }
        }
        objectRef = new Ref.ObjectRef();
        arrayList = new ArrayList();
        for (Object obj3 : list) {
            productConfigResponseAppModel = (ProductConfigResponseAppModel) obj3;
            if (!StringsKt.x(productConfigResponseAppModel.getB(), "singleJourneyTicket", true) && z7) {
                f = false;
            } else if (!z6) {
                f = productConfigResponseAppModel.getF();
            } else if (productConfigResponseAppModel.getF()) {
                if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
                    unknownProductConfigApiResponseModel = (ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel;
                    if (StringsKt.x(unknownProductConfigApiResponseModel.r, "singleJourneyTicket", true)) {
                        productGroup = ProductGroup.TICKET;
                    } else if (StringsKt.x(unknownProductConfigApiResponseModel.s, "premiumReserveTicket", true)) {
                        productGroup = ProductGroup.PREMIUM_BUS;
                    } else {
                        productGroup = ProductGroup.LONGTERM;
                    }
                } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) {
                    productGroup = ProductGroup.CARDRECHARGE;
                } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) {
                    productGroup = ProductGroup.INSTANT_TICKET;
                } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) {
                    productGroup = ProductGroup.TICKET;
                } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) {
                    productGroup = ProductGroup.MERGED_TICKET_QUICK_PAY;
                } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
                    productGroup = ProductGroup.LONGTERM;
                } else {
                    if (!(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productGroup = ProductGroup.TICKET;
                }
                if (productGroup == ProductGroup.LONGTERM) {
                    f = true;
                } else {
                    f = false;
                }
            } else {
                f = false;
            }
            if (f) {
                arrayList.add(obj3);
            }
        }
        linkedHashMap = new LinkedHashMap();
        size = arrayList.size();
        i2 = 0;
        while (i2 < size) {
            Object obj4 = arrayList.get(i2);
            i2++;
            f8638a = ((ProductConfigResponseAppModel) obj4).getF8638a();
            arrayList4 = linkedHashMap.get(f8638a);
            if (arrayList4 == null) {
                arrayList4 = new ArrayList();
                linkedHashMap.put(f8638a, arrayList4);
            }
            ((List) arrayList4).add(obj4);
        }
        linkedHashMap2 = new LinkedHashMap(MapsKt.g(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            it = ((Iterable) entry.getValue()).iterator();
            if (it.hasNext()) {
                next = it.next();
                if (!it.hasNext()) {
                    g = ((ProductConfigResponseAppModel) next).getG();
                    do {
                        next2 = it.next();
                        g2 = ((ProductConfigResponseAppModel) next2).getG();
                        if (g > g2) {
                            next = next2;
                            g = g2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Intrinsics.f(next);
            linkedHashMap2.put(key, (ProductConfigResponseAppModel) next);
        }
        V0 = CollectionsKt.v0(new ProductSelectionComponent$sortBasedOnPriority$$inlined$sortedBy$1(), CollectionsKt.D0(linkedHashMap2.values()));
        objectRef.element = V0;
        if (!z4) {
            arrayList3 = new ArrayList();
            for (Object obj5 : (Iterable) V0) {
                if (!AllProductConfigsResponseAppModelKt.g((ProductConfigResponseAppModel) obj5)) {
                    arrayList3.add(obj5);
                }
            }
            objectRef.element = CollectionsKt.E0(arrayList3);
        }
        if (z8) {
            Iterable iterable = (Iterable) objectRef.element;
            arrayList2 = new ArrayList();
            for (Object obj6 : iterable) {
                if (AllProductConfigsResponseAppModelKt.g((ProductConfigResponseAppModel) obj6)) {
                    arrayList2.add(obj6);
                }
            }
            objectRef.element = CollectionsKt.E0(arrayList2);
        }
        job = this.E;
        if (job != null) {
            r4 = 0;
            ((JobSupport) job).cancel(null);
        } else {
            r4 = 0;
        }
        this.E = BuildersKt.d(this.j, r4, r4, new ProductSelectionComponent$processConfigFetchSuccess$4(this, z4, z8, r4), 3);
        E0(new rw0(4, allProductConfigsResponseAppModel3, list, objectRef));
        return unit;
        boolean zA = ((InstantTicketFeatureConfigForCity) obj).a(this.s.h());
        List list2 = allProductConfigsResponseAppModel2.f8629a;
        productSelectionComponent$processConfigFetchSuccess$1.L$0 = allProductConfigsResponseAppModel2;
        productSelectionComponent$processConfigFetchSuccess$1.L$1 = str2;
        productSelectionComponent$processConfigFetchSuccess$1.Z$0 = z4;
        productSelectionComponent$processConfigFetchSuccess$1.Z$1 = z5;
        productSelectionComponent$processConfigFetchSuccess$1.Z$2 = z6;
        productSelectionComponent$processConfigFetchSuccess$1.Z$3 = zA;
        productSelectionComponent$processConfigFetchSuccess$1.label = 2;
        Object objK0 = K0(list2, productSelectionComponent$processConfigFetchSuccess$1);
        if (objK0 != obj2) {
            z7 = zA;
            obj = objK0;
            z8 = z5;
            str3 = str2;
            allProductConfigsResponseAppModel3 = allProductConfigsResponseAppModel2;
            list = (List) obj;
            i = 3;
            unit = Unit.f17538a;
            if (str3 != null) {
                it2 = list.iterator();
                do {
                    if (it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (!Intrinsics.d(((ProductConfigResponseAppModel) next3).getF8638a(), str3));
                productConfigResponseAppModel2 = (ProductConfigResponseAppModel) next3;
                if (productConfigResponseAppModel2 != null) {
                    if (productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
                        zX0 = X0((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel2, true);
                    } else {
                        if (productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
                            if (!z7) {
                                this.t.b(new ChaloNavigationRequest.Navigate(new TicketPurchaseArgs.MTicketTripInfoArgs(((ProductSelectionDataState) this.f.getValue()).f8674a, null, ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel2).j), new ChaloNavOptions(new PopUpToConfig.Scene(ChaloScenes.ProductSelection, true), i), null, 4));
                                zX0 = true;
                            }
                        } else if (!(productConfigResponseAppModel2 instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        zX0 = false;
                    }
                    if (zX0) {
                        return unit;
                    }
                }
            }
            objectRef = new Ref.ObjectRef();
            arrayList = new ArrayList();
            while (r11.hasNext()) {
                productConfigResponseAppModel = (ProductConfigResponseAppModel) obj3;
                if (!StringsKt.x(productConfigResponseAppModel.getB(), "singleJourneyTicket", true)) {
                    if (!z6) {
                        f = productConfigResponseAppModel.getF();
                    } else if (productConfigResponseAppModel.getF()) {
                        f = false;
                    } else {
                        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
                            unknownProductConfigApiResponseModel = (ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel;
                            if (StringsKt.x(unknownProductConfigApiResponseModel.r, "singleJourneyTicket", true)) {
                                productGroup = ProductGroup.TICKET;
                            } else if (StringsKt.x(unknownProductConfigApiResponseModel.s, "premiumReserveTicket", true)) {
                                productGroup = ProductGroup.PREMIUM_BUS;
                            } else {
                                productGroup = ProductGroup.LONGTERM;
                            }
                        } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) {
                            productGroup = ProductGroup.CARDRECHARGE;
                        } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) {
                            productGroup = ProductGroup.INSTANT_TICKET;
                        } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) {
                            productGroup = ProductGroup.TICKET;
                        } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) {
                            productGroup = ProductGroup.MERGED_TICKET_QUICK_PAY;
                        } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
                            productGroup = ProductGroup.LONGTERM;
                        } else {
                            if (!(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            productGroup = ProductGroup.TICKET;
                        }
                        if (productGroup == ProductGroup.LONGTERM) {
                            f = true;
                        } else {
                            f = false;
                        }
                    }
                } else if (!z6) {
                    f = productConfigResponseAppModel.getF();
                } else if (productConfigResponseAppModel.getF()) {
                    f = false;
                } else {
                    if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) {
                        unknownProductConfigApiResponseModel = (ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel;
                        if (StringsKt.x(unknownProductConfigApiResponseModel.r, "singleJourneyTicket", true)) {
                            productGroup = ProductGroup.TICKET;
                        } else if (StringsKt.x(unknownProductConfigApiResponseModel.s, "premiumReserveTicket", true)) {
                            productGroup = ProductGroup.PREMIUM_BUS;
                        } else {
                            productGroup = ProductGroup.LONGTERM;
                        }
                    } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) {
                        productGroup = ProductGroup.CARDRECHARGE;
                    } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) {
                        productGroup = ProductGroup.INSTANT_TICKET;
                    } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel) {
                        productGroup = ProductGroup.TICKET;
                    } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) {
                        productGroup = ProductGroup.MERGED_TICKET_QUICK_PAY;
                    } else if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
                        productGroup = ProductGroup.LONGTERM;
                    } else {
                        if (!(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        productGroup = ProductGroup.TICKET;
                    }
                    if (productGroup == ProductGroup.LONGTERM) {
                        f = true;
                    } else {
                        f = false;
                    }
                }
                if (f) {
                    arrayList.add(obj3);
                }
            }
            linkedHashMap = new LinkedHashMap();
            size = arrayList.size();
            i2 = 0;
            while (i2 < size) {
                Object obj7 = arrayList.get(i2);
                i2++;
                f8638a = ((ProductConfigResponseAppModel) obj7).getF8638a();
                arrayList4 = linkedHashMap.get(f8638a);
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                    linkedHashMap.put(f8638a, arrayList4);
                }
                ((List) arrayList4).add(obj7);
            }
            linkedHashMap2 = new LinkedHashMap(MapsKt.g(linkedHashMap.size()));
            while (r3.hasNext()) {
                Object key2 = entry.getKey();
                it = ((Iterable) entry.getValue()).iterator();
                if (it.hasNext()) {
                    next = null;
                } else {
                    next = it.next();
                    if (!it.hasNext()) {
                        g = ((ProductConfigResponseAppModel) next).getG();
                        do {
                            next2 = it.next();
                            g2 = ((ProductConfigResponseAppModel) next2).getG();
                            if (g > g2) {
                                next = next2;
                                g = g2;
                            }
                        } while (it.hasNext());
                    }
                }
                Intrinsics.f(next);
                linkedHashMap2.put(key2, (ProductConfigResponseAppModel) next);
            }
            V0 = CollectionsKt.v0(new ProductSelectionComponent$sortBasedOnPriority$$inlined$sortedBy$1(), CollectionsKt.D0(linkedHashMap2.values()));
            objectRef.element = V0;
            if (!z4) {
                arrayList3 = new ArrayList();
                while (r3.hasNext()) {
                    if (!AllProductConfigsResponseAppModelKt.g((ProductConfigResponseAppModel) obj5)) {
                        arrayList3.add(obj5);
                    }
                }
                objectRef.element = CollectionsKt.E0(arrayList3);
            }
            if (z8) {
                Iterable iterable2 = (Iterable) objectRef.element;
                arrayList2 = new ArrayList();
                while (r3.hasNext()) {
                    if (AllProductConfigsResponseAppModelKt.g((ProductConfigResponseAppModel) obj6)) {
                        arrayList2.add(obj6);
                    }
                }
                objectRef.element = CollectionsKt.E0(arrayList2);
            }
            job = this.E;
            if (job != null) {
                r4 = 0;
                ((JobSupport) job).cancel(null);
            } else {
                r4 = 0;
            }
            this.E = BuildersKt.d(this.j, r4, r4, new ProductSelectionComponent$processConfigFetchSuccess$4(this, z4, z8, r4), 3);
            E0(new rw0(4, allProductConfigsResponseAppModel3, list, objectRef));
            return unit;
        }
        return obj2;
    }

    public final void Z0(ProductSelectionIntent productSelectionIntent) {
        C0(productSelectionIntent);
        boolean z = productSelectionIntent instanceof ProductSelectionIntent.InitializationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            BuildersKt.d(contextScope, null, null, new ProductSelectionComponent$handleInitializationIntent$1(this, (ProductSelectionIntent.InitializationIntent) productSelectionIntent, null), 3);
            return;
        }
        if (productSelectionIntent.equals(ProductSelectionIntent.RetryFetchIntent.f8685a)) {
            BuildersKt.d(contextScope, null, null, new ProductSelectionComponent$handleRetryFetchIntent$1(this, null), 3);
            return;
        }
        boolean z2 = productSelectionIntent instanceof ProductSelectionIntent.ProductClickedIntent;
        ChaloNavigationManager chaloNavigationManager = this.t;
        if (!z2) {
            if (productSelectionIntent instanceof ProductSelectionIntent.RecentBookingItemClickedIntent) {
                BuildersKt.d(contextScope, null, null, new ProductSelectionComponent$handleRecentBookingItemClickedIntent$1((ProductSelectionIntent.RecentBookingItemClickedIntent) productSelectionIntent, this, null), 3);
                return;
            }
            if (productSelectionIntent instanceof ProductSelectionIntent.PassRenewConfirmationDialogClickIntent) {
                BuildersKt.d(contextScope, null, null, new ProductSelectionComponent$handlePassRenewConfirmationDialogClickIntent$1(this, (ProductSelectionIntent.PassRenewConfirmationDialogClickIntent) productSelectionIntent, null), 3);
                return;
            }
            int i = 24;
            if ((productSelectionIntent instanceof ProductSelectionIntent.RecentMTicketErrorDialogOkayClickedIntent) || productSelectionIntent.equals(ProductSelectionIntent.MTicketDisabledRouteDialogCancelClickedIntent.f8678a)) {
                E0(new yw0(i));
                return;
            } else if (productSelectionIntent.equals(ProductSelectionIntent.MTicketDisabledRouteDialogContinueClickedIntent.f8679a)) {
                E0(new yw0(i));
                ChaloNavigationManagerKt.e(chaloNavigationManager, new TicketPurchaseArgs.MTicketTripInfoArgs(Source.PRODUCT_SELECTION_RECENT_PRODUCTS, null, null), null, 6);
                return;
            } else {
                if (!productSelectionIntent.equals(ProductSelectionIntent.RecentBookingsSeeAllClickedIntent.f8683a)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        ProductConfigResponseAppModel productConfigResponseAppModel = ((ProductSelectionIntent.ProductClickedIntent) productSelectionIntent).f8681a;
        String f8638a = productConfigResponseAppModel.getF8638a();
        String b = productConfigResponseAppModel.getB();
        Source source = Source.PRODUCT_SELECTION_ACTIVITY;
        AnalyticsContractImplKt.a(this.m, "product selected", source, ((ProductSelectionDataState) this.f.getValue()).f8674a, MapsKt.i(new Pair("productId", f8638a), new Pair("productType", b)), 16);
        if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SuperPassConfigAppModel) {
            X0((ProductConfigResponseAppModel.SuperPassConfigAppModel) productConfigResponseAppModel, false);
            return;
        }
        if (!(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel)) {
            if (productConfigResponseAppModel instanceof ProductConfigResponseAppModel.SingleJourneyTicketAppModel) {
                ChaloNavigationManagerKt.e(chaloNavigationManager, new TicketPurchaseArgs.MTicketTripInfoArgs(source, null, ((ProductConfigResponseAppModel.SingleJourneyTicketAppModel) productConfigResponseAppModel).j), null, 6);
                return;
            } else {
                if (!(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.CardRechargeConfigResponseAppModel) && !(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.InstantTicketConfigResponseAppModel) && !(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.QuickPayConfigResponseAppModel) && !(productConfigResponseAppModel instanceof ProductConfigResponseAppModel.GroupTicketConfigResponseAppModel)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
        }
        ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel unknownProductConfigApiResponseModel = (ProductConfigResponseAppModel.UnknownProductConfigApiResponseModel) productConfigResponseAppModel;
        String str = unknownProductConfigApiResponseModel.r;
        if (Intrinsics.d(str, "singleJourneyTicket") || Intrinsics.d(str, "sjPass")) {
            ChaloNavigationManagerKt.e(chaloNavigationManager, new TicketPurchaseArgs.MTicketTripInfoArgs(source, null, unknownProductConfigApiResponseModel.j), null, 6);
        } else if (Intrinsics.d(unknownProductConfigApiResponseModel.s, "premiumReserveTicket")) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new PremiumBusArgs.StopSelectionArgs(unknownProductConfigApiResponseModel.j, false, true, source, (String) null, 16), null, null, 6));
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ca, code lost:
    
        if (r13 == r1) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a1(java.util.List r11, java.util.List r12, kotlin.coroutines.jvm.internal.ContinuationImpl r13) {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.a1(java.util.List, java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void b1(String str, boolean z) {
        Source source = Source.PRODUCT_SELECTION_ACTIVITY;
        LinkedHashMap linkedHashMapK = MapsKt.k(new Pair("response", String.valueOf(z)));
        if (str != null) {
            linkedHashMapK.put("error message", str);
        }
        AnalyticsContractImplKt.b(this.m, "configuration fetched", source, linkedHashMapK, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c1(String str, String str2, SuperPass superPass, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$raiseRenewErrorDialogShownEvent$1 productSelectionComponent$raiseRenewErrorDialogShownEvent$1;
        AnalyticsContract analyticsContract;
        Map map;
        if (continuationImpl instanceof ProductSelectionComponent$raiseRenewErrorDialogShownEvent$1) {
            productSelectionComponent$raiseRenewErrorDialogShownEvent$1 = (ProductSelectionComponent$raiseRenewErrorDialogShownEvent$1) continuationImpl;
            int i = productSelectionComponent$raiseRenewErrorDialogShownEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$raiseRenewErrorDialogShownEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$raiseRenewErrorDialogShownEvent$1 = new ProductSelectionComponent$raiseRenewErrorDialogShownEvent$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$raiseRenewErrorDialogShownEvent$1 = new ProductSelectionComponent$raiseRenewErrorDialogShownEvent$1(this, continuationImpl);
        }
        Object obj = productSelectionComponent$raiseRenewErrorDialogShownEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$raiseRenewErrorDialogShownEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (str != null) {
                linkedHashMap.put("title", str);
            }
            linkedHashMap.put("reason", str2);
            MixpanelUtil mixpanelUtil = MixpanelUtil.f9617a;
            analyticsContract = this.m;
            productSelectionComponent$raiseRenewErrorDialogShownEvent$1.L$0 = analyticsContract;
            productSelectionComponent$raiseRenewErrorDialogShownEvent$1.L$1 = linkedHashMap;
            productSelectionComponent$raiseRenewErrorDialogShownEvent$1.label = 1;
            if (mixpanelUtil.c(linkedHashMap, superPass, productSelectionComponent$raiseRenewErrorDialogShownEvent$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            map = linkedHashMap;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map2 = (Map) productSelectionComponent$raiseRenewErrorDialogShownEvent$1.L$1;
            analyticsContract = (AnalyticsContract) productSelectionComponent$raiseRenewErrorDialogShownEvent$1.L$0;
            ResultKt.b(obj);
            map = map2;
        }
        AnalyticsContractImplKt.b(analyticsContract, "renew error dialog shown", Source.PRODUCT_SELECTION_RECENT_PRODUCTS, map, false, 24);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d1(MTicket mTicket, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$recentMTicketItemUIState$1 productSelectionComponent$recentMTicketItemUIState$1;
        Double d;
        Object objR0;
        final MTicket mTicket2 = mTicket;
        if (continuationImpl instanceof ProductSelectionComponent$recentMTicketItemUIState$1) {
            productSelectionComponent$recentMTicketItemUIState$1 = (ProductSelectionComponent$recentMTicketItemUIState$1) continuationImpl;
            int i = productSelectionComponent$recentMTicketItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$recentMTicketItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$recentMTicketItemUIState$1 = new ProductSelectionComponent$recentMTicketItemUIState$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$recentMTicketItemUIState$1 = new ProductSelectionComponent$recentMTicketItemUIState$1(this, continuationImpl);
        }
        Object obj = productSelectionComponent$recentMTicketItemUIState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$recentMTicketItemUIState$1.label;
        TextUIState.ChaloTextUIState chaloTextUIState = null;
        if (i2 == 0) {
            ResultKt.b(obj);
            d = new Double(this.A.i(mTicket2));
            if (d.doubleValue() == 0.0d) {
                d = null;
            }
            Map map = mTicket2.h;
            productSelectionComponent$recentMTicketItemUIState$1.L$0 = mTicket2;
            productSelectionComponent$recentMTicketItemUIState$1.L$1 = d;
            productSelectionComponent$recentMTicketItemUIState$1.label = 1;
            objR0 = R0(map, productSelectionComponent$recentMTicketItemUIState$1);
            if (objR0 == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Double d2 = (Double) productSelectionComponent$recentMTicketItemUIState$1.L$1;
            MTicket mTicket3 = (MTicket) productSelectionComponent$recentMTicketItemUIState$1.L$0;
            ResultKt.b(obj);
            d = d2;
            mTicket2 = mTicket3;
            objR0 = obj;
        }
        String str = (String) objR0;
        UITextAlign uITextAlign = null;
        UiEventHandler uiEventHandler = null;
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState("Single Journey Ticket", (UITextStyle) null, (ChaloColorToken) null, 0, uITextAlign, (UIFontWeight) null, (Integer) null, uiEventHandler, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8190);
        String str2 = mTicket2.f.d;
        UITextStyle uITextStyle = UITextStyle.HeadlineSmall;
        UIFontWeight uIFontWeight = UIFontWeight.Normal;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        Object[] objArr = 0 == true ? 1 : 0;
        Object[] objArr2 = 0 == true ? 1 : 0;
        FromToStopViewUIState fromToStopViewUIState = new FromToStopViewUIState(new TextUIState.ChaloTextUIState(str2, uITextStyle, (ChaloColorToken) black_87, 0, uITextAlign, uIFontWeight, (Integer) (0 == true ? 1 : 0), uiEventHandler, (UITextDecoration) (0 == true ? 1 : 0), (UITextOverflow) (0 == true ? 1 : 0), (UIFontStyle) (0 == true ? 1 : 0), (String) objArr, 8120), new TextUIState.ChaloTextUIState(mTicket2.f.f, uITextStyle, (ChaloColorToken) black_87, 0, (UITextAlign) (0 == true ? 1 : 0), uIFontWeight, (Integer) (0 == true ? 1 : 0), (UiEventHandler) (0 == true ? 1 : 0), (UITextDecoration) (0 == true ? 1 : 0), (UITextOverflow) objArr2, (UIFontStyle) null, (String) null, 8120));
        if (d != null) {
            chaloTextUIState = new TextUIState.ChaloTextUIState(this.w.e(d.doubleValue()), UITextStyle.DisplayMedium, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        }
        return new ProductSelectionSectionItemUIState.RecentProductItemUIState(chaloTextUIState, null, chaloTextUIState2, new ImageUIState(IconType.BUS_TRIP_PLANNER, (String) null, (ChaloColorToken) null, new ImageUISize(ChaloThemeHelper.a().B), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246), TextWithSpecialFeaturesTagsUIStateKt.c(0.0f, new Function1<TextWithSpecialFeatureBuilder, Unit>(this) { // from class: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent$recentMTicketItemUIState$3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                ArrayList arrayList = ((TextWithSpecialFeatureBuilder) obj3).f10091a;
                RouteStopsInfo routeStopsInfo = this.f8673a.f;
                TextWithSpecialFeatureBuilder.b(arrayList, routeStopsInfo.b, UITextStyle.HeadlineSmall, ChaloColorToken.Black_87.f9768a, UIFontWeight.Bold, 104);
                List list = routeStopsInfo.g;
                List<String> list2 = routeStopsInfo.h;
                ArrayList arrayList2 = new ArrayList();
                if (list != null) {
                    if (list.contains(RouteLegacySpecialFeature.AC)) {
                        arrayList2.add("AC");
                    } else if (list.contains(RouteLegacySpecialFeature.FAST)) {
                        arrayList2.add("FAST");
                    }
                }
                if (list2 != null) {
                    for (String str3 : list2) {
                        if (str3 != null) {
                            arrayList2.add(str3);
                        }
                    }
                }
                TextWithSpecialFeatureBuilder.d(arrayList, arrayList2);
                return Unit.f17538a;
            }
        }, 3), fromToStopViewUIState, null, new TextUIState.ChaloTextUIState(str, UITextStyle.BodyMedium, (ChaloColorToken) ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) (0 == true ? 1 : 0), null, (Integer) (0 == true ? 1 : 0), null, (UITextDecoration) (0 == true ? 1 : 0), null, null, (String) null, 8184), UiEventHandler.Companion.a(new fr0(18, this, mTicket2)), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v16, types: [T, java.lang.String] */
    public final Object e1(boolean z, String str, String str2, double d, String str3, List list, Double d2, Function0 function0, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$recentSuperPassItemUIState$1 productSelectionComponent$recentSuperPassItemUIState$1;
        Ref.ObjectRef objectRef;
        Double d3;
        double d4;
        Function0 function1;
        String str4;
        String str5;
        Object obj;
        List list2;
        IconType iconType;
        String str6;
        Ref.ObjectRef objectRef2;
        ImageUIState imageUIState;
        if (continuationImpl instanceof ProductSelectionComponent$recentSuperPassItemUIState$1) {
            productSelectionComponent$recentSuperPassItemUIState$1 = (ProductSelectionComponent$recentSuperPassItemUIState$1) continuationImpl;
            int i = productSelectionComponent$recentSuperPassItemUIState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$recentSuperPassItemUIState$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$recentSuperPassItemUIState$1 = new ProductSelectionComponent$recentSuperPassItemUIState$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$recentSuperPassItemUIState$1 = new ProductSelectionComponent$recentSuperPassItemUIState$1(this, continuationImpl);
        }
        Object obj2 = productSelectionComponent$recentSuperPassItemUIState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$recentSuperPassItemUIState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj2);
            IconType iconType2 = z ? IconType.IC_CHALO_BUS_LOGO : null;
            objectRef = new Ref.ObjectRef();
            productSelectionComponent$recentSuperPassItemUIState$1.L$0 = str3;
            productSelectionComponent$recentSuperPassItemUIState$1.L$1 = list;
            d3 = d2;
            productSelectionComponent$recentSuperPassItemUIState$1.L$2 = d3;
            productSelectionComponent$recentSuperPassItemUIState$1.L$3 = function0;
            productSelectionComponent$recentSuperPassItemUIState$1.L$4 = iconType2;
            productSelectionComponent$recentSuperPassItemUIState$1.L$5 = objectRef;
            productSelectionComponent$recentSuperPassItemUIState$1.L$6 = objectRef;
            productSelectionComponent$recentSuperPassItemUIState$1.L$7 = str;
            productSelectionComponent$recentSuperPassItemUIState$1.L$8 = str2;
            productSelectionComponent$recentSuperPassItemUIState$1.D$0 = d;
            productSelectionComponent$recentSuperPassItemUIState$1.label = 1;
            Object objB = this.v.b(StringEnum.CATEGORY, new Object[0], productSelectionComponent$recentSuperPassItemUIState$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            d4 = d;
            function1 = function0;
            str4 = str;
            str5 = str2;
            obj = objB;
            list2 = list;
            iconType = iconType2;
            str6 = str3;
            objectRef2 = objectRef;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d4 = productSelectionComponent$recentSuperPassItemUIState$1.D$0;
            str5 = (String) productSelectionComponent$recentSuperPassItemUIState$1.L$8;
            str4 = (String) productSelectionComponent$recentSuperPassItemUIState$1.L$7;
            objectRef = (Ref.ObjectRef) productSelectionComponent$recentSuperPassItemUIState$1.L$6;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) productSelectionComponent$recentSuperPassItemUIState$1.L$5;
            IconType iconType3 = (IconType) productSelectionComponent$recentSuperPassItemUIState$1.L$4;
            Function0 function2 = (Function0) productSelectionComponent$recentSuperPassItemUIState$1.L$3;
            Double d5 = (Double) productSelectionComponent$recentSuperPassItemUIState$1.L$2;
            List list3 = (List) productSelectionComponent$recentSuperPassItemUIState$1.L$1;
            String str7 = (String) productSelectionComponent$recentSuperPassItemUIState$1.L$0;
            ResultKt.b(obj2);
            str6 = str7;
            function1 = function2;
            d3 = d5;
            iconType = iconType3;
            objectRef2 = objectRef3;
            obj = obj2;
            list2 = list3;
        }
        objectRef.element = str4 + ", " + str5 + " " + obj;
        CurrencyFeature currencyFeature = this.w;
        if (d3 != null && !Intrinsics.b(d3, -1.0d)) {
            objectRef2.element = objectRef2.element + ", Upto " + currencyFeature.d() + d3;
        }
        String strE = currencyFeature.e(d4);
        UITextStyle uITextStyle = UITextStyle.DisplayMedium;
        ChaloColorToken.Black_87 black_87 = ChaloColorToken.Black_87.f9768a;
        TextUIState.ChaloTextUIState chaloTextUIState = new TextUIState.ChaloTextUIState(strE, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        if (iconType != null) {
            imageUIState = new ImageUIState(iconType, (String) null, (ChaloColorToken) null, new ImageUISize(Dp.m7276boximpl(Dp.m7278constructorimpl(ChaloThemeHelper.a().i - ChaloThemeHelper.a().d)), Dp.m7276boximpl(ChaloThemeHelper.a().r)), (UIContentScale) null, 0.0f, (UiEventHandler) null, 246);
        } else {
            imageUIState = null;
        }
        TextUIState.ChaloTextUIState chaloTextUIState2 = new TextUIState.ChaloTextUIState(str6, uITextStyle, black_87, 0, (UITextAlign) null, (UIFontWeight) null, (Integer) null, (UiEventHandler) null, (UITextDecoration) null, (UITextOverflow) null, (UIFontStyle) null, (String) null, 8184);
        TextUIState.ChaloTextUIState chaloTextUIState3 = new TextUIState.ChaloTextUIState((String) objectRef2.element, UITextStyle.BodyMedium, (ChaloColorToken) ChaloColorToken.Black_70.f9767a, 0, (UITextAlign) (0 == true ? 1 : 0), (UIFontWeight) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), (UiEventHandler) (0 == true ? 1 : 0), (UITextDecoration) (0 == true ? 1 : 0), (UITextOverflow) (0 == true ? 1 : 0), (UIFontStyle) (0 == true ? 1 : 0), (String) null, 8184);
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            RecentProductItemTagText recentProductItemTagTextA = SuperPassUIStateUtils.a((String) it.next());
            if (recentProductItemTagTextA != null) {
                arrayList.add(recentProductItemTagTextA);
            }
        }
        return new ProductSelectionSectionItemUIState.RecentProductItemUIState(chaloTextUIState, imageUIState, chaloTextUIState2, null, null, null, arrayList, chaloTextUIState3, UiEventHandler.Companion.a(function1), 113);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g1(boolean z, SuperPass superPass, String str, String str2, ContinuationImpl continuationImpl) {
        ProductSelectionComponent$showRenewErrorDialog$1 productSelectionComponent$showRenewErrorDialog$1;
        SuperPass superPass2;
        BookableSuperPassConfiguration bookableSuperPassConfiguration;
        if (continuationImpl instanceof ProductSelectionComponent$showRenewErrorDialog$1) {
            productSelectionComponent$showRenewErrorDialog$1 = (ProductSelectionComponent$showRenewErrorDialog$1) continuationImpl;
            int i = productSelectionComponent$showRenewErrorDialog$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productSelectionComponent$showRenewErrorDialog$1.label = i - Integer.MIN_VALUE;
            } else {
                productSelectionComponent$showRenewErrorDialog$1 = new ProductSelectionComponent$showRenewErrorDialog$1(this, continuationImpl);
            }
        } else {
            productSelectionComponent$showRenewErrorDialog$1 = new ProductSelectionComponent$showRenewErrorDialog$1(this, continuationImpl);
        }
        Object obj = productSelectionComponent$showRenewErrorDialog$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productSelectionComponent$showRenewErrorDialog$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            productSelectionComponent$showRenewErrorDialog$1.L$0 = superPass;
            productSelectionComponent$showRenewErrorDialog$1.L$1 = str;
            productSelectionComponent$showRenewErrorDialog$1.L$2 = str2;
            productSelectionComponent$showRenewErrorDialog$1.L$3 = null;
            productSelectionComponent$showRenewErrorDialog$1.Z$0 = z;
            productSelectionComponent$showRenewErrorDialog$1.label = 1;
            if (c1(str, str2, superPass, productSelectionComponent$showRenewErrorDialog$1) == obj2) {
                return obj2;
            }
            superPass2 = superPass;
            bookableSuperPassConfiguration = null;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = productSelectionComponent$showRenewErrorDialog$1.Z$0;
            BookableSuperPassConfiguration bookableSuperPassConfiguration2 = (BookableSuperPassConfiguration) productSelectionComponent$showRenewErrorDialog$1.L$3;
            str2 = (String) productSelectionComponent$showRenewErrorDialog$1.L$2;
            str = (String) productSelectionComponent$showRenewErrorDialog$1.L$1;
            SuperPass superPass3 = (SuperPass) productSelectionComponent$showRenewErrorDialog$1.L$0;
            ResultKt.b(obj);
            bookableSuperPassConfiguration = bookableSuperPassConfiguration2;
            superPass2 = superPass3;
        }
        E0(new mf(z, superPass2, str, str2, bookableSuperPassConfiguration));
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:32:0x0120  */
    /* JADX WARN: Code duplicated, block: B:50:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0188 -> B:48:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object h1(java.util.List r33, kotlin.coroutines.jvm.internal.ContinuationImpl r34) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.productselection.ui.ProductSelectionComponent.h1(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ProductSelectionDataState(Source.UNKNOWN, false, false, null, null, false, null, null, null);
    }
}

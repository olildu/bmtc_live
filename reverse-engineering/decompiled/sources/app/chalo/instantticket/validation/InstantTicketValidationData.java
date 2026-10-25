package app.chalo.instantticket.validation;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.citydata.data.model.app.RouteStopsInfo;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.instantticket.config.models.BrandingDetails;
import app.chalo.instantticket.config.models.InstantTicketConfiguration;
import app.chalo.premiumbus.helper.InstantTicketConfigHelper;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData;
import app.chalo.validationsdk.blevalidation.ui.RouteDetailsFieldData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/instantticket/validation/InstantTicketValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class InstantTicketValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f3977a;
    public final InstantTicketUserDetailsForProducts b;
    public final CurrencyFeature c;
    public final StringProvider d;
    public final TimeUtilsContract e;
    public final CityProvider f;
    public final InstantTicketConfigHelper g;
    public ProductValidationModel h;
    public Map i = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/instantticket/validation/InstantTicketValidationData$Companion;", "", "", "EXPIRY_DELAY_PERIODIC_CHECK_MILLIS", "J", "QR_CODE_REFRESH_DELAY_IN_MILLIS", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public InstantTicketValidationData(BasicInfoContract basicInfoContract, InstantTicketUserDetailsForProducts instantTicketUserDetailsForProducts, CurrencyFeature currencyFeature, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, CityProvider cityProvider, InstantTicketConfigHelper instantTicketConfigHelper) {
        this.f3977a = basicInfoContract;
        this.b = instantTicketUserDetailsForProducts;
        this.c = currencyFeature;
        this.d = stringProvider;
        this.e = timeUtilsContract;
        this.f = cityProvider;
        this.g = instantTicketConfigHelper;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel productValidationModel = this.h;
        if (productValidationModel != null) {
            return productValidationModel.getG();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ChaloTransitMode B() {
        return ChaloTransitMode.BUS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object C(ContinuationImpl continuationImpl) {
        InstantTicketValidationData$isValid$1 instantTicketValidationData$isValid$1;
        ProductValidationModel productValidationModel;
        if (continuationImpl instanceof InstantTicketValidationData$isValid$1) {
            instantTicketValidationData$isValid$1 = (InstantTicketValidationData$isValid$1) continuationImpl;
            int i = instantTicketValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationData$isValid$1 = new InstantTicketValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            instantTicketValidationData$isValid$1 = new InstantTicketValidationData$isValid$1(this, continuationImpl);
        }
        Object obj = instantTicketValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationData$isValid$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProductValidationModel productValidationModel2 = this.h;
            if (productValidationModel2 != null) {
                instantTicketValidationData$isValid$1.L$0 = productValidationModel2;
                instantTicketValidationData$isValid$1.label = 1;
                Object objC = this.f3977a.c(instantTicketValidationData$isValid$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productValidationModel = productValidationModel2;
                obj = objC;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        productValidationModel = (ProductValidationModel) instantTicketValidationData$isValid$1.L$0;
        ResultKt.b(obj);
        if (((Number) obj).longValue() < productValidationModel.getC()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts D() {
        return this.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object F(Continuation continuation) {
        InstantTicketValidationData$getActivationId$1 instantTicketValidationData$getActivationId$1;
        if (continuation instanceof InstantTicketValidationData$getActivationId$1) {
            instantTicketValidationData$getActivationId$1 = (InstantTicketValidationData$getActivationId$1) continuation;
            int i = instantTicketValidationData$getActivationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationData$getActivationId$1 = new InstantTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
            }
        } else {
            instantTicketValidationData$getActivationId$1 = new InstantTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
        }
        Object objX = instantTicketValidationData$getActivationId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            instantTicketValidationData$getActivationId$1.label = 1;
            objX = x(instantTicketValidationData$getActivationId$1);
            if (objX == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objX);
        }
        return String.valueOf(((Number) objX).longValue() / ((long) 1000));
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String a() {
        String f5979a;
        ProductValidationModel productValidationModel = this.h;
        return (productValidationModel == null || (f5979a = productValidationModel.getF5979a()) == null) ? "" : f5979a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        String b;
        ProductValidationModel productValidationModel = this.h;
        return (productValidationModel == null || (b = productValidationModel.getB()) == null) ? "" : b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.h = null;
        this.i = MapsKt.d();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ boolean d() {
        return ProductValidationData.DefaultImpls.a(this);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ ValidationPayloadMetaData e() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ProductValidationModel getH() {
        return this.h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        ProductValidationModel productValidationModel = this.h;
        if (productValidationModel == null) {
            return "";
        }
        String strA = this.c.a(productValidationModel.getE(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String f;
        ProductValidationModel productValidationModel = this.h;
        return (productValidationModel == null || (f = productValidationModel.getF()) == null) ? "" : f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        InstantTicketValidationData$isProductActivationValid$1 instantTicketValidationData$isProductActivationValid$1;
        long j;
        if (continuationImpl instanceof InstantTicketValidationData$isProductActivationValid$1) {
            instantTicketValidationData$isProductActivationValid$1 = (InstantTicketValidationData$isProductActivationValid$1) continuationImpl;
            int i = instantTicketValidationData$isProductActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationData$isProductActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationData$isProductActivationValid$1 = new InstantTicketValidationData$isProductActivationValid$1(this, continuationImpl);
            }
        } else {
            instantTicketValidationData$isProductActivationValid$1 = new InstantTicketValidationData$isProductActivationValid$1(this, continuationImpl);
        }
        Object objC = instantTicketValidationData$isProductActivationValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationData$isProductActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            long jP = p();
            instantTicketValidationData$isProductActivationValid$1.J$0 = jP;
            instantTicketValidationData$isProductActivationValid$1.label = 1;
            objC = this.f3977a.c(instantTicketValidationData$isProductActivationValid$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jP;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = instantTicketValidationData$isProductActivationValid$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(j > ((Number) objC).longValue());
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.i = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        String h;
        ProductValidationModel productValidationModel = this.h;
        return (productValidationModel == null || (h = productValidationModel.getH()) == null) ? "" : h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ Long l() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.h = productValidationModel;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        String f;
        ProductValidationModel productValidationModel = this.h;
        return (productValidationModel == null || (f = productValidationModel.getF()) == null) ? "" : f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        ProductValidationModel productValidationModel = this.h;
        if (productValidationModel != null) {
            return productValidationModel.getB();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        ProductValidationModel productValidationModel = this.h;
        if (productValidationModel != null) {
            return productValidationModel.getC();
        }
        return -1L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        return EmptyList.f17557a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        InstantTicketValidationData$getProductValidationBrandingLogoType$1 instantTicketValidationData$getProductValidationBrandingLogoType$1;
        String str;
        BrandingDetails brandingDetails;
        String str2;
        if (continuationImpl instanceof InstantTicketValidationData$getProductValidationBrandingLogoType$1) {
            instantTicketValidationData$getProductValidationBrandingLogoType$1 = (InstantTicketValidationData$getProductValidationBrandingLogoType$1) continuationImpl;
            int i = instantTicketValidationData$getProductValidationBrandingLogoType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationData$getProductValidationBrandingLogoType$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationData$getProductValidationBrandingLogoType$1 = new InstantTicketValidationData$getProductValidationBrandingLogoType$1(this, continuationImpl);
            }
        } else {
            instantTicketValidationData$getProductValidationBrandingLogoType$1 = new InstantTicketValidationData$getProductValidationBrandingLogoType$1(this, continuationImpl);
        }
        Object obj = instantTicketValidationData$getProductValidationBrandingLogoType$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationData$getProductValidationBrandingLogoType$1.label;
        CityProvider cityProvider = this.f;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProductValidationModel productValidationModel = this.h;
            InstantTicketValidationModel instantTicketValidationModel = productValidationModel instanceof InstantTicketValidationModel ? (InstantTicketValidationModel) productValidationModel : null;
            if (instantTicketValidationModel == null) {
                return ProductBookingBranding.None.INSTANCE;
            }
            String str3 = instantTicketValidationModel.i;
            CityAppModel cityAppModel = (CityAppModel) cityProvider.b().getValue();
            if (cityAppModel == null) {
                return ProductBookingBranding.None.INSTANCE;
            }
            if (!StringsKt.x(str3, cityAppModel.f8854a, true)) {
                return ProductBookingBranding.None.INSTANCE;
            }
            instantTicketValidationData$getProductValidationBrandingLogoType$1.L$0 = str3;
            instantTicketValidationData$getProductValidationBrandingLogoType$1.label = 1;
            Object objB = this.g.b(false, instantTicketValidationData$getProductValidationBrandingLogoType$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            str = str3;
            obj = objB;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) instantTicketValidationData$getProductValidationBrandingLogoType$1.L$0;
            ResultKt.b(obj);
        }
        InstantTicketConfiguration instantTicketConfiguration = (InstantTicketConfiguration) obj;
        if (instantTicketConfiguration == null || (brandingDetails = instantTicketConfiguration.f) == null || !brandingDetails.f3827a) {
            return ProductBookingBranding.None.INSTANCE;
        }
        String strA = instantTicketConfiguration.a();
        if (strA != null) {
            return new ProductBookingBranding.AgencyBranding(strA);
        }
        ArrayList arrayListK = cityProvider.k(ChaloTransitMode.BUS);
        if (arrayListK == null || arrayListK.isEmpty() || arrayListK.size() > 1) {
            return ProductBookingBranding.None.INSTANCE;
        }
        ProductBookingBranding.Companion companion = ProductBookingBranding.INSTANCE;
        AgencyInfoAppModel agencyInfoAppModel = (AgencyInfoAppModel) CollectionsKt.L(0, arrayListK);
        if (agencyInfoAppModel == null || (str2 = agencyInfoAppModel.f8852a) == null) {
            str2 = "";
        }
        companion.getClass();
        return ProductBookingBranding.Companion.a(str, str2);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        String f;
        ProductValidationModel productValidationModel = this.h;
        if (productValidationModel == null || (f = productValidationModel.getF()) == null) {
            return "";
        }
        String upperCase = f.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        InstantTicketValidationData$getProductDetailsFieldsData$1 instantTicketValidationData$getProductDetailsFieldsData$1;
        InstantTicketValidationModel instantTicketValidationModel;
        String str;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData;
        String str2;
        RouteStopsInfo routeStopsInfo;
        if (continuationImpl instanceof InstantTicketValidationData$getProductDetailsFieldsData$1) {
            instantTicketValidationData$getProductDetailsFieldsData$1 = (InstantTicketValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i = instantTicketValidationData$getProductDetailsFieldsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                instantTicketValidationData$getProductDetailsFieldsData$1.label = i - Integer.MIN_VALUE;
            } else {
                instantTicketValidationData$getProductDetailsFieldsData$1 = new InstantTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            instantTicketValidationData$getProductDetailsFieldsData$1 = new InstantTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object objK = instantTicketValidationData$getProductDetailsFieldsData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = instantTicketValidationData$getProductDetailsFieldsData$1.label;
        RouteDetailsFieldData routeDetailsFieldData = null;
        if (i2 == 0) {
            ResultKt.b(objK);
            String strR = StringsKt.R(TimeUtilsContract.DefaultImpls.a(this.e, p(), null, 6), ",", " on");
            ProductValidationModel productValidationModel = this.h;
            instantTicketValidationModel = productValidationModel instanceof InstantTicketValidationModel ? (InstantTicketValidationModel) productValidationModel : null;
            instantTicketValidationData$getProductDetailsFieldsData$1.L$0 = strR;
            instantTicketValidationData$getProductDetailsFieldsData$1.L$1 = instantTicketValidationModel;
            instantTicketValidationData$getProductDetailsFieldsData$1.label = 1;
            Object objB = this.d.b(StringEnum.AMOUNT_PAID, new Object[0], instantTicketValidationData$getProductDetailsFieldsData$1);
            if (objB != obj) {
                str = strR;
                objK = objB;
            }
            return obj;
        }
        if (i2 == 1) {
            instantTicketValidationModel = (InstantTicketValidationModel) instantTicketValidationData$getProductDetailsFieldsData$1.L$1;
            str = (String) instantTicketValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(objK);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductDetailsDisplayFieldData productDetailsDisplayFieldData2 = (ProductDetailsDisplayFieldData) instantTicketValidationData$getProductDetailsFieldsData$1.L$2;
            instantTicketValidationModel = (InstantTicketValidationModel) instantTicketValidationData$getProductDetailsFieldsData$1.L$1;
            String str3 = (String) instantTicketValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(objK);
            str2 = str3;
            productDetailsDisplayFieldData = productDetailsDisplayFieldData2;
        }
        String str4 = (String) objK;
        if (instantTicketValidationModel != null && (routeStopsInfo = instantTicketValidationModel.j) != null && !StringsKt.F(routeStopsInfo.b) && !StringsKt.F(routeStopsInfo.d) && !StringsKt.F(routeStopsInfo.f)) {
            routeDetailsFieldData = new RouteDetailsFieldData(routeStopsInfo.d, routeStopsInfo.f, routeStopsInfo.c, routeStopsInfo.e, routeStopsInfo.b);
        }
        return new ProductDetailsDisplayData(str2, null, null, productDetailsDisplayFieldData, routeDetailsFieldData, str4, null, null, null, 450);
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData3 = new ProductDetailsDisplayFieldData((String) objK, g());
        instantTicketValidationData$getProductDetailsFieldsData$1.L$0 = str;
        instantTicketValidationData$getProductDetailsFieldsData$1.L$1 = instantTicketValidationModel;
        instantTicketValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData3;
        instantTicketValidationData$getProductDetailsFieldsData$1.label = 2;
        objK = k(instantTicketValidationData$getProductDetailsFieldsData$1);
        if (objK != obj) {
            productDetailsDisplayFieldData = productDetailsDisplayFieldData3;
            str2 = str;
            String str5 = (String) objK;
            if (instantTicketValidationModel != null) {
                routeDetailsFieldData = new RouteDetailsFieldData(routeStopsInfo.d, routeStopsInfo.f, routeStopsInfo.c, routeStopsInfo.e, routeStopsInfo.b);
            }
            return new ProductDetailsDisplayData(str2, null, null, productDetailsDisplayFieldData, routeDetailsFieldData, str5, null, null, null, 450);
        }
        return obj;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.i);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        String f3978a;
        ProductValidationModel productValidationModel = this.h;
        return (productValidationModel == null || (f3978a = productValidationModel.getF3978a()) == null) ? "" : f3978a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        Long l;
        InstantTicketValidationModel instantTicketValidationModel = (InstantTicketValidationModel) this.h;
        long jLongValue = 0;
        if (instantTicketValidationModel != null && (l = instantTicketValidationModel.d) != null) {
            jLongValue = instantTicketValidationModel.c - l.longValue();
        }
        return new Long(jLongValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        return QRValidationType.DYNAMIC;
    }
}

package app.chalo.ondc.validation;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.userprofile.Gender;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayPassengerFieldData;
import app.chalo.validationsdk.blevalidation.ui.RouteDetailsFieldData;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/validation/OndcTicketValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcTicketValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f6804a;
    public final OndcTicketUserDetailsForProducts b;
    public final CurrencyFeature c;
    public final StringProvider d;
    public final TimeUtilsContract e;
    public OndcTicketValidationModel f;
    public Map g = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/validation/OndcTicketValidationData$Companion;", "", "", "EXPIRY_DELAY_PERIODIC_CHECK_MILLIS", "J", "QR_CODE_REFRESH_DELAY_IN_MILLIS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public OndcTicketValidationData(BasicInfoContract basicInfoContract, OndcTicketUserDetailsForProducts ondcTicketUserDetailsForProducts, CurrencyFeature currencyFeature, StringProvider stringProvider, TimeUtilsContract timeUtilsContract) {
        this.f6804a = basicInfoContract;
        this.b = ondcTicketUserDetailsForProducts;
        this.c = currencyFeature;
        this.d = stringProvider;
        this.e = timeUtilsContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel d = getD();
        if (d != null) {
            return ((OndcTicketValidationModel) d).getH();
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
        OndcTicketValidationData$isValid$1 ondcTicketValidationData$isValid$1;
        ProductValidationModel productValidationModel;
        if (continuationImpl instanceof OndcTicketValidationData$isValid$1) {
            ondcTicketValidationData$isValid$1 = (OndcTicketValidationData$isValid$1) continuationImpl;
            int i = ondcTicketValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationData$isValid$1 = new OndcTicketValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            ondcTicketValidationData$isValid$1 = new OndcTicketValidationData$isValid$1(this, continuationImpl);
        }
        Object obj = ondcTicketValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationData$isValid$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(obj);
            OndcTicketValidationModel ondcTicketValidationModel = this.f;
            if (ondcTicketValidationModel != null) {
                ondcTicketValidationData$isValid$1.L$0 = ondcTicketValidationModel;
                ondcTicketValidationData$isValid$1.label = 1;
                Object objC = this.f6804a.c(ondcTicketValidationData$isValid$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productValidationModel = ondcTicketValidationModel;
                obj = objC;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        productValidationModel = (ProductValidationModel) ondcTicketValidationData$isValid$1.L$0;
        ResultKt.b(obj);
        if (((Number) obj).longValue() < productValidationModel.getD()) {
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
        OndcTicketValidationData$getActivationId$1 ondcTicketValidationData$getActivationId$1;
        if (continuation instanceof OndcTicketValidationData$getActivationId$1) {
            ondcTicketValidationData$getActivationId$1 = (OndcTicketValidationData$getActivationId$1) continuation;
            int i = ondcTicketValidationData$getActivationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationData$getActivationId$1 = new OndcTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
            }
        } else {
            ondcTicketValidationData$getActivationId$1 = new OndcTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
        }
        Object objX = ondcTicketValidationData$getActivationId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            ondcTicketValidationData$getActivationId$1.label = 1;
            objX = x(ondcTicketValidationData$getActivationId$1);
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
        return this.f != null ? "mobileTicket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        return this.f != null ? "ondcTicket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.f = null;
        this.g = MapsKt.d();
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
    /* JADX INFO: renamed from: f */
    public final ProductValidationModel getD() {
        return this.f;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        if (ondcTicketValidationModel == null) {
            return "";
        }
        String strA = this.c.a(ondcTicketValidationModel.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String str;
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        return (ondcTicketValidationModel == null || (str = ondcTicketValidationModel.g) == null) ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        OndcTicketValidationData$isProductActivationValid$1 ondcTicketValidationData$isProductActivationValid$1;
        long j;
        if (continuationImpl instanceof OndcTicketValidationData$isProductActivationValid$1) {
            ondcTicketValidationData$isProductActivationValid$1 = (OndcTicketValidationData$isProductActivationValid$1) continuationImpl;
            int i = ondcTicketValidationData$isProductActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationData$isProductActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationData$isProductActivationValid$1 = new OndcTicketValidationData$isProductActivationValid$1(this, continuationImpl);
            }
        } else {
            ondcTicketValidationData$isProductActivationValid$1 = new OndcTicketValidationData$isProductActivationValid$1(this, continuationImpl);
        }
        Object objC = ondcTicketValidationData$isProductActivationValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcTicketValidationData$isProductActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            long jP = p();
            ondcTicketValidationData$isProductActivationValid$1.J$0 = jP;
            ondcTicketValidationData$isProductActivationValid$1.label = 1;
            objC = this.f6804a.c(ondcTicketValidationData$isProductActivationValid$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jP;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = ondcTicketValidationData$isProductActivationValid$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(j > ((Number) objC).longValue());
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.g = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        return this.f != null ? "Single Journey Ticket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long l() {
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        if (ondcTicketValidationModel != null) {
            return ondcTicketValidationModel.i;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.f = productValidationModel instanceof OndcTicketValidationModel ? (OndcTicketValidationModel) productValidationModel : null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        String str;
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        return (ondcTicketValidationModel == null || (str = ondcTicketValidationModel.g) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        if (ondcTicketValidationModel != null) {
            return ondcTicketValidationModel.c;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        if (ondcTicketValidationModel != null) {
            return ondcTicketValidationModel.d;
        }
        return -1L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        List list;
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        return (ondcTicketValidationModel == null || (list = ondcTicketValidationModel.n) == null) ? EmptyList.f17557a : list;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        return new ProductBookingBranding.Ondc();
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        String str;
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        if (ondcTicketValidationModel == null || (str = ondcTicketValidationModel.g) == null) {
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        OndcTicketValidationData$getProductDetailsFieldsData$1 ondcTicketValidationData$getProductDetailsFieldsData$1;
        String strR;
        int i;
        ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData;
        int i2;
        RouteDetailsFieldData routeDetailsFieldData;
        String str;
        String str2;
        String str3;
        if (continuationImpl instanceof OndcTicketValidationData$getProductDetailsFieldsData$1) {
            ondcTicketValidationData$getProductDetailsFieldsData$1 = (OndcTicketValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i3 = ondcTicketValidationData$getProductDetailsFieldsData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ondcTicketValidationData$getProductDetailsFieldsData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                ondcTicketValidationData$getProductDetailsFieldsData$1 = new OndcTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            ondcTicketValidationData$getProductDetailsFieldsData$1 = new OndcTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object obj = ondcTicketValidationData$getProductDetailsFieldsData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = ondcTicketValidationData$getProductDetailsFieldsData$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            OndcTicketUserDetailsForProducts ondcTicketUserDetailsForProducts = this.b;
            ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData2 = new ProductDetailsDisplayPassengerFieldData(ondcTicketUserDetailsForProducts.getE(), ondcTicketUserDetailsForProducts.getC(), ondcTicketUserDetailsForProducts.e(), Gender.Companion.b(Gender.INSTANCE, ondcTicketUserDetailsForProducts.b()));
            strR = StringsKt.R(TimeUtilsContract.DefaultImpls.a(this.e, p(), null, 6), ",", " on");
            OndcTicketValidationModel ondcTicketValidationModel = this.f;
            if ((ondcTicketValidationModel != null ? ondcTicketValidationModel.k : null) == null) {
                i = 0;
            } else {
                if ((ondcTicketValidationModel != null ? ondcTicketValidationModel.l : null) == null) {
                    i = 0;
                } else {
                    if ((ondcTicketValidationModel != null ? ondcTicketValidationModel.m : null) != null) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                }
            }
            ondcTicketValidationData$getProductDetailsFieldsData$1.L$0 = productDetailsDisplayPassengerFieldData2;
            ondcTicketValidationData$getProductDetailsFieldsData$1.L$1 = strR;
            ondcTicketValidationData$getProductDetailsFieldsData$1.I$0 = i;
            ondcTicketValidationData$getProductDetailsFieldsData$1.label = 1;
            Object objK = k(ondcTicketValidationData$getProductDetailsFieldsData$1);
            if (objK == obj2) {
                return obj2;
            }
            productDetailsDisplayPassengerFieldData = productDetailsDisplayPassengerFieldData2;
            obj = objK;
            i2 = i;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i2 = ondcTicketValidationData$getProductDetailsFieldsData$1.I$0;
            strR = (String) ondcTicketValidationData$getProductDetailsFieldsData$1.L$1;
            ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData3 = (ProductDetailsDisplayPassengerFieldData) ondcTicketValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(obj);
            productDetailsDisplayPassengerFieldData = productDetailsDisplayPassengerFieldData3;
        }
        String str4 = strR;
        String str5 = (String) obj;
        if (i2 != 0) {
            OndcTicketValidationModel ondcTicketValidationModel2 = this.f;
            routeDetailsFieldData = new RouteDetailsFieldData((ondcTicketValidationModel2 == null || (str3 = ondcTicketValidationModel2.l) == null) ? "" : str3, (ondcTicketValidationModel2 == null || (str2 = ondcTicketValidationModel2.m) == null) ? "" : str2, null, null, (ondcTicketValidationModel2 == null || (str = ondcTicketValidationModel2.k) == null) ? "" : str);
        } else {
            routeDetailsFieldData = null;
        }
        OndcTicketValidationModel ondcTicketValidationModel3 = this.f;
        return new ProductDetailsDisplayData(str4, productDetailsDisplayPassengerFieldData, null, null, routeDetailsFieldData, str5, ondcTicketValidationModel3 != null ? ondcTicketValidationModel3.j : null, ondcTicketValidationModel3 != null ? ondcTicketValidationModel3.o : null, null, 256);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.g);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        String str;
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        return (ondcTicketValidationModel == null || (str = ondcTicketValidationModel.b) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        long jLongValue;
        OndcTicketValidationModel ondcTicketValidationModel = this.f;
        if (ondcTicketValidationModel != null) {
            jLongValue = ondcTicketValidationModel.d - ondcTicketValidationModel.e.longValue();
        } else {
            jLongValue = 0;
        }
        return new Long(jLongValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        return this.b;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        return QRValidationType.STATIC;
    }
}

package app.chalo.metro.validation;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
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

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/metro/validation/MetroTicketValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MetroTicketValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BasicInfoContract f5563a;
    public final MetroTicketUserDetailsForProducts b;
    public final CurrencyFeature c;
    public final TimeUtilsContract d;
    public MetroTicketValidationModel e;
    public Map f = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/metro/validation/MetroTicketValidationData$Companion;", "", "", "EXPIRY_DELAY_PERIODIC_CHECK_MILLIS", "J", "QR_CODE_REFRESH_DELAY_IN_MILLIS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MetroTicketValidationData(BasicInfoContract basicInfoContract, MetroTicketUserDetailsForProducts metroTicketUserDetailsForProducts, CurrencyFeature currencyFeature, TimeUtilsContract timeUtilsContract) {
        this.f5563a = basicInfoContract;
        this.b = metroTicketUserDetailsForProducts;
        this.c = currencyFeature;
        this.d = timeUtilsContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel productValidationModelF = f();
        if (productValidationModelF != null) {
            return ((MetroTicketValidationModel) productValidationModelF).getH();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ChaloTransitMode B() {
        return ChaloTransitMode.METRO;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object C(ContinuationImpl continuationImpl) {
        MetroTicketValidationData$isValid$1 metroTicketValidationData$isValid$1;
        ProductValidationModel productValidationModel;
        if (continuationImpl instanceof MetroTicketValidationData$isValid$1) {
            metroTicketValidationData$isValid$1 = (MetroTicketValidationData$isValid$1) continuationImpl;
            int i = metroTicketValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationData$isValid$1 = new MetroTicketValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            metroTicketValidationData$isValid$1 = new MetroTicketValidationData$isValid$1(this, continuationImpl);
        }
        Object obj = metroTicketValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationData$isValid$1.label;
        boolean z = false;
        if (i2 == 0) {
            ResultKt.b(obj);
            MetroTicketValidationModel metroTicketValidationModel = this.e;
            if (metroTicketValidationModel != null) {
                metroTicketValidationData$isValid$1.L$0 = metroTicketValidationModel;
                metroTicketValidationData$isValid$1.label = 1;
                Object objC = this.f5563a.c(metroTicketValidationData$isValid$1);
                if (objC == coroutineSingletons) {
                    return coroutineSingletons;
                }
                productValidationModel = metroTicketValidationModel;
                obj = objC;
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        productValidationModel = (ProductValidationModel) metroTicketValidationData$isValid$1.L$0;
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
        MetroTicketValidationData$getActivationId$1 metroTicketValidationData$getActivationId$1;
        if (continuation instanceof MetroTicketValidationData$getActivationId$1) {
            metroTicketValidationData$getActivationId$1 = (MetroTicketValidationData$getActivationId$1) continuation;
            int i = metroTicketValidationData$getActivationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationData$getActivationId$1 = new MetroTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
            }
        } else {
            metroTicketValidationData$getActivationId$1 = new MetroTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
        }
        Object objX = metroTicketValidationData$getActivationId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            metroTicketValidationData$getActivationId$1.label = 1;
            objX = x(metroTicketValidationData$getActivationId$1);
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
        return this.e != null ? "mobileTicket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        return this.e != null ? "metroTicket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.e = null;
        this.f = MapsKt.d();
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
    public final ProductValidationModel f() {
        return this.e;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        if (metroTicketValidationModel == null) {
            return "";
        }
        String strA = this.c.a(metroTicketValidationModel.f, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String str;
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        return (metroTicketValidationModel == null || (str = metroTicketValidationModel.g) == null) ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        MetroTicketValidationData$isProductActivationValid$1 metroTicketValidationData$isProductActivationValid$1;
        long j;
        if (continuationImpl instanceof MetroTicketValidationData$isProductActivationValid$1) {
            metroTicketValidationData$isProductActivationValid$1 = (MetroTicketValidationData$isProductActivationValid$1) continuationImpl;
            int i = metroTicketValidationData$isProductActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                metroTicketValidationData$isProductActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                metroTicketValidationData$isProductActivationValid$1 = new MetroTicketValidationData$isProductActivationValid$1(this, continuationImpl);
            }
        } else {
            metroTicketValidationData$isProductActivationValid$1 = new MetroTicketValidationData$isProductActivationValid$1(this, continuationImpl);
        }
        Object objC = metroTicketValidationData$isProductActivationValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = metroTicketValidationData$isProductActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            long jP = p();
            metroTicketValidationData$isProductActivationValid$1.J$0 = jP;
            metroTicketValidationData$isProductActivationValid$1.label = 1;
            objC = this.f5563a.c(metroTicketValidationData$isProductActivationValid$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jP;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = metroTicketValidationData$isProductActivationValid$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(j > ((Number) objC).longValue());
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.f = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        return this.e != null ? "Metro Ticket" : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long l() {
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        if (metroTicketValidationModel != null) {
            return metroTicketValidationModel.i;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.e = productValidationModel instanceof MetroTicketValidationModel ? (MetroTicketValidationModel) productValidationModel : null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        String str;
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        return (metroTicketValidationModel == null || (str = metroTicketValidationModel.g) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        if (metroTicketValidationModel != null) {
            return metroTicketValidationModel.c;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        if (metroTicketValidationModel != null) {
            return metroTicketValidationModel.d;
        }
        return -1L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        List list;
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        return (metroTicketValidationModel == null || (list = metroTicketValidationModel.o) == null) ? EmptyList.f17557a : list;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        return ProductBookingBranding.None.INSTANCE;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        String str;
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        if (metroTicketValidationModel == null || (str = metroTicketValidationModel.g) == null) {
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        MetroTicketValidationData$getProductDetailsFieldsData$1 metroTicketValidationData$getProductDetailsFieldsData$1;
        String strA;
        int i;
        ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData;
        int i2;
        RouteDetailsFieldData routeDetailsFieldData;
        String str;
        String str2;
        if (continuationImpl instanceof MetroTicketValidationData$getProductDetailsFieldsData$1) {
            metroTicketValidationData$getProductDetailsFieldsData$1 = (MetroTicketValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i3 = metroTicketValidationData$getProductDetailsFieldsData$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                metroTicketValidationData$getProductDetailsFieldsData$1.label = i3 - Integer.MIN_VALUE;
            } else {
                metroTicketValidationData$getProductDetailsFieldsData$1 = new MetroTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            metroTicketValidationData$getProductDetailsFieldsData$1 = new MetroTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object obj = metroTicketValidationData$getProductDetailsFieldsData$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = metroTicketValidationData$getProductDetailsFieldsData$1.label;
        if (i4 == 0) {
            ResultKt.b(obj);
            MetroTicketUserDetailsForProducts metroTicketUserDetailsForProducts = this.b;
            ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData2 = new ProductDetailsDisplayPassengerFieldData(metroTicketUserDetailsForProducts.c(), metroTicketUserDetailsForProducts.a(), metroTicketUserDetailsForProducts.e(), Gender.Companion.b(Gender.INSTANCE, metroTicketUserDetailsForProducts.b()));
            strA = TimeUtilsContract.DefaultImpls.a(this.d, p(), null, 2);
            MetroTicketValidationModel metroTicketValidationModel = this.e;
            if ((metroTicketValidationModel != null ? metroTicketValidationModel.k : null) == null) {
                i = 0;
            } else {
                if ((metroTicketValidationModel != null ? metroTicketValidationModel.m : null) != null) {
                    i = 1;
                } else {
                    i = 0;
                }
            }
            metroTicketValidationData$getProductDetailsFieldsData$1.L$0 = productDetailsDisplayPassengerFieldData2;
            metroTicketValidationData$getProductDetailsFieldsData$1.L$1 = strA;
            metroTicketValidationData$getProductDetailsFieldsData$1.I$0 = i;
            metroTicketValidationData$getProductDetailsFieldsData$1.label = 1;
            Object objK = k(metroTicketValidationData$getProductDetailsFieldsData$1);
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
            i2 = metroTicketValidationData$getProductDetailsFieldsData$1.I$0;
            strA = (String) metroTicketValidationData$getProductDetailsFieldsData$1.L$1;
            ProductDetailsDisplayPassengerFieldData productDetailsDisplayPassengerFieldData3 = (ProductDetailsDisplayPassengerFieldData) metroTicketValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(obj);
            productDetailsDisplayPassengerFieldData = productDetailsDisplayPassengerFieldData3;
        }
        String str3 = strA;
        String str4 = (String) obj;
        if (i2 != 0) {
            MetroTicketValidationModel metroTicketValidationModel2 = this.e;
            routeDetailsFieldData = new RouteDetailsFieldData((metroTicketValidationModel2 == null || (str2 = metroTicketValidationModel2.k) == null) ? "" : str2, (metroTicketValidationModel2 == null || (str = metroTicketValidationModel2.m) == null) ? "" : str, metroTicketValidationModel2 != null ? metroTicketValidationModel2.l : null, metroTicketValidationModel2 != null ? metroTicketValidationModel2.n : null, "");
        } else {
            routeDetailsFieldData = null;
        }
        MetroTicketValidationModel metroTicketValidationModel3 = this.e;
        return new ProductDetailsDisplayData(str3, productDetailsDisplayPassengerFieldData, null, null, routeDetailsFieldData, str4, metroTicketValidationModel3 != null ? metroTicketValidationModel3.j : null, null, null, 384);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.f);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        String str;
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        return (metroTicketValidationModel == null || (str = metroTicketValidationModel.b) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        long jLongValue;
        MetroTicketValidationModel metroTicketValidationModel = this.e;
        if (metroTicketValidationModel != null) {
            jLongValue = metroTicketValidationModel.d - metroTicketValidationModel.e.longValue();
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

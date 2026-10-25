package app.chalo.premiumbus.prebookedtickets.validation;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.userprofile.Gender;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validation.superpass.GenerateHashCodeForEasyVerificationUseCase;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData;
import defpackage.uf0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumReserveTicketValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyFeature f7484a;
    public final StringProvider b;
    public final TimeUtilsContract c;
    public ProductValidationModel d;
    public Object e = MapsKt.d();
    public Object f = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/validation/PremiumReserveTicketValidationData$Companion;", "", "", "ACTIVATION_EXPIRY_DELAY_PERIODIC_CHECK_MILLIS", "J", "QR_CODE_REFRESH_DELAY_IN_MILLIS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public PremiumReserveTicketValidationData(CurrencyFeature currencyFeature, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, GenerateHashCodeForEasyVerificationUseCase generateHashCodeForEasyVerificationUseCase) {
        this.f7484a = currencyFeature;
        this.b = stringProvider;
        this.c = timeUtilsContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel productValidationModel = this.d;
        if (productValidationModel != null) {
            return productValidationModel.getJ();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ChaloTransitMode B() {
        return ChaloTransitMode.BUS;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object C(ContinuationImpl continuationImpl) {
        ProductValidationModel productValidationModel = this.d;
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = productValidationModel instanceof PremiumReserveTicketValidationModel ? (PremiumReserveTicketValidationModel) productValidationModel : null;
        return Boolean.valueOf(premiumReserveTicketValidationModel != null ? ((Boolean) premiumReserveTicketValidationModel.k.invoke()).booleanValue() : false);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts D() {
        ProductValidationModel productValidationModel = this.d;
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = productValidationModel instanceof PremiumReserveTicketValidationModel ? (PremiumReserveTicketValidationModel) productValidationModel : null;
        if (premiumReserveTicketValidationModel != null) {
            return premiumReserveTicketValidationModel.l;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object F(Continuation continuation) {
        return "0";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String a() {
        String i;
        ProductValidationModel productValidationModel = this.d;
        return (productValidationModel == null || (i = productValidationModel.getI()) == null) ? "" : i;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        String h;
        ProductValidationModel productValidationModel = this.d;
        return (productValidationModel == null || (h = productValidationModel.getH()) == null) ? "" : h;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.d = null;
        this.e = MapsKt.d();
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
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ProductValidationModel getD() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        ProductValidationModel productValidationModel = this.d;
        if (productValidationModel == null) {
            return "";
        }
        String strA = this.f7484a.a(productValidationModel.getF(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String g;
        ProductValidationModel productValidationModel = this.d;
        return (productValidationModel == null || (g = productValidationModel.getG()) == null) ? "" : g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        ProductValidationModel productValidationModel = this.d;
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = productValidationModel instanceof PremiumReserveTicketValidationModel ? (PremiumReserveTicketValidationModel) productValidationModel : null;
        return Boolean.valueOf(premiumReserveTicketValidationModel != null ? ((Boolean) premiumReserveTicketValidationModel.k.invoke()).booleanValue() : false);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.e = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        String j;
        ProductValidationModel productValidationModel = this.d;
        return (productValidationModel == null || (j = productValidationModel.getJ()) == null) ? "" : j;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ Long l() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.d = productValidationModel;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        String g;
        ProductValidationModel productValidationModel = this.d;
        return (productValidationModel == null || (g = productValidationModel.getG()) == null) ? "" : g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        ProductValidationModel productValidationModel = this.d;
        if (productValidationModel != null) {
            return productValidationModel.getD();
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        ProductValidationModel productValidationModel = this.d;
        if (productValidationModel != null) {
            return productValidationModel.getE();
        }
        return 0L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        return EmptyList.f17557a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        return ProductBookingBranding.None.INSTANCE;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        String g;
        ProductValidationModel productValidationModel = this.d;
        if (productValidationModel == null || (g = productValidationModel.getG()) == null) {
            return "";
        }
        String upperCase = g.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [T, app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData] */
    /* JADX WARN: Type inference failed for: r8v2, types: [T, app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData] */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        PremiumReserveTicketValidationData$getProductDetailsFieldsData$1 premiumReserveTicketValidationData$getProductDetailsFieldsData$1;
        Ref.ObjectRef objectRefV;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        Ref.ObjectRef objectRef6;
        String strA;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData2;
        Object objK;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData3;
        String str;
        if (continuationImpl instanceof PremiumReserveTicketValidationData$getProductDetailsFieldsData$1) {
            premiumReserveTicketValidationData$getProductDetailsFieldsData$1 = (PremiumReserveTicketValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i = premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label = i - Integer.MIN_VALUE;
            } else {
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1 = new PremiumReserveTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            premiumReserveTicketValidationData$getProductDetailsFieldsData$1 = new PremiumReserveTicketValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object objB = premiumReserveTicketValidationData$getProductDetailsFieldsData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label;
        TimeUtilsContract timeUtilsContract = this.c;
        StringProvider stringProvider = this.b;
        if (i2 == 0) {
            objectRefV = uf0.v(objB);
            objectRef = new Ref.ObjectRef();
            ProductValidationModel productValidationModel = this.d;
            PremiumReserveTicketValidationModel premiumReserveTicketValidationModel2 = productValidationModel instanceof PremiumReserveTicketValidationModel ? (PremiumReserveTicketValidationModel) productValidationModel : null;
            if (premiumReserveTicketValidationModel2 != null) {
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0 = objectRefV;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1 = objectRef;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2 = premiumReserveTicketValidationModel2;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$3 = objectRefV;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label = 1;
                Object objB2 = stringProvider.b(StringEnum.SCHEDULE_FREQ, new Object[0], premiumReserveTicketValidationData$getProductDetailsFieldsData$1);
                if (objB2 != obj) {
                    PremiumReserveTicketValidationModel premiumReserveTicketValidationModel3 = premiumReserveTicketValidationModel2;
                    objectRef2 = objectRef;
                    objB = objB2;
                    premiumReserveTicketValidationModel = premiumReserveTicketValidationModel3;
                    objectRef3 = objectRefV;
                }
            } else {
                strA = TimeUtilsContract.DefaultImpls.a(timeUtilsContract, p(), "on", 4);
                productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) objectRefV.element;
                productDetailsDisplayFieldData2 = (ProductDetailsDisplayFieldData) objectRef.element;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0 = strA;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayFieldData;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData2;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label = 3;
                objK = k(premiumReserveTicketValidationData$getProductDetailsFieldsData$1);
                if (objK != obj) {
                    productDetailsDisplayFieldData3 = productDetailsDisplayFieldData2;
                    objB = objK;
                    str = strA;
                    return new ProductDetailsDisplayData(str, null, productDetailsDisplayFieldData, productDetailsDisplayFieldData3, null, (String) objB, null, null, null, 466);
                }
            }
            return obj;
        }
        if (i2 == 1) {
            objectRefV = (Ref.ObjectRef) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$3;
            premiumReserveTicketValidationModel = (PremiumReserveTicketValidationModel) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2;
            objectRef2 = (Ref.ObjectRef) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1;
            objectRef3 = (Ref.ObjectRef) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                objectRef4 = (Ref.ObjectRef) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2;
                objectRef5 = (Ref.ObjectRef) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1;
                objectRef6 = (Ref.ObjectRef) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0;
                ResultKt.b(objB);
                objectRef4.element = new ProductDetailsDisplayFieldData((String) objB, g());
                objectRef = objectRef5;
                objectRefV = objectRef6;
                strA = TimeUtilsContract.DefaultImpls.a(timeUtilsContract, p(), "on", 4);
                productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) objectRefV.element;
                productDetailsDisplayFieldData2 = (ProductDetailsDisplayFieldData) objectRef.element;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0 = strA;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayFieldData;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData2;
                premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label = 3;
                objK = k(premiumReserveTicketValidationData$getProductDetailsFieldsData$1);
                if (objK != obj) {
                    productDetailsDisplayFieldData3 = productDetailsDisplayFieldData2;
                    objB = objK;
                    str = strA;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductDetailsDisplayFieldData productDetailsDisplayFieldData4 = (ProductDetailsDisplayFieldData) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2;
            productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1;
            String str2 = (String) premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(objB);
            productDetailsDisplayFieldData3 = productDetailsDisplayFieldData4;
            str = str2;
        }
        return new ProductDetailsDisplayData(str, null, productDetailsDisplayFieldData, productDetailsDisplayFieldData3, null, (String) objB, null, null, null, 466);
        objectRefV.element = new ProductDetailsDisplayFieldData((String) objB, TimeUtilsContract.DefaultImpls.a(timeUtilsContract, premiumReserveTicketValidationModel.n, null, 6));
        premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0 = objectRef3;
        premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1 = objectRef2;
        premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2 = objectRef2;
        premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$3 = null;
        premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label = 2;
        objB = stringProvider.b(StringEnum.AMOUNT_PAID, new Object[0], premiumReserveTicketValidationData$getProductDetailsFieldsData$1);
        if (objB != obj) {
            objectRef4 = objectRef2;
            objectRef5 = objectRef4;
            objectRef6 = objectRef3;
            objectRef4.element = new ProductDetailsDisplayFieldData((String) objB, g());
            objectRef = objectRef5;
            objectRefV = objectRef6;
            strA = TimeUtilsContract.DefaultImpls.a(timeUtilsContract, p(), "on", 4);
            productDetailsDisplayFieldData = (ProductDetailsDisplayFieldData) objectRefV.element;
            productDetailsDisplayFieldData2 = (ProductDetailsDisplayFieldData) objectRef.element;
            premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$0 = strA;
            premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayFieldData;
            premiumReserveTicketValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData2;
            premiumReserveTicketValidationData$getProductDetailsFieldsData$1.label = 3;
            objK = k(premiumReserveTicketValidationData$getProductDetailsFieldsData$1);
            if (objK != obj) {
                productDetailsDisplayFieldData3 = productDetailsDisplayFieldData2;
                objB = objK;
                str = strA;
                return new ProductDetailsDisplayData(str, null, productDetailsDisplayFieldData, productDetailsDisplayFieldData3, null, (String) objB, null, null, null, 466);
            }
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.e);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        String c;
        ProductValidationModel productValidationModel = this.d;
        return (productValidationModel == null || (c = productValidationModel.getC()) == null) ? "" : c;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        return new Long(-1L);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        PremiumReserveTicketValidationUserDetails premiumReserveTicketValidationUserDetails;
        ProductValidationModel productValidationModel = this.d;
        PremiumReserveTicketValidationModel premiumReserveTicketValidationModel = productValidationModel instanceof PremiumReserveTicketValidationModel ? (PremiumReserveTicketValidationModel) productValidationModel : null;
        return (premiumReserveTicketValidationModel == null || (premiumReserveTicketValidationUserDetails = premiumReserveTicketValidationModel.l) == null) ? new PremiumReserveTicketValidationUserDetails("", "", "", Gender.NULL, "") : premiumReserveTicketValidationUserDetails;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        return QRValidationType.DYNAMIC;
    }
}

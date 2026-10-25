package app.chalo.mTicketing.validation;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.data.ProductBookingBranding;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.models.mticketing.MTicketUtilsHelper;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.tito.domain.GetMTicketForTicketIdUseCase;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MTicketValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CurrencyFeature f5397a;
    public final StringProvider b;
    public final GetMTicketForTicketIdUseCase c;
    public final MTicketUtilsHelper d;
    public final UserProfileDetailsProvider e;
    public final TimeUtilsContract f;
    public MTicketProductValidationModel g;
    public Object h = MapsKt.d();
    public Object i = MapsKt.d();

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/mTicketing/validation/MTicketValidationData$Companion;", "", "", "MTICKET_ACTIVATION_EXPIRY_DELAY_PERIODIC_CHECK_MILLIS", "J", "QR_CODE_REFRESH_DELAY_IN_MILLIS", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MTicketValidationData(CurrencyFeature currencyFeature, StringProvider stringProvider, GetMTicketForTicketIdUseCase getMTicketForTicketIdUseCase, MTicketUtilsHelper mTicketUtilsHelper, UserProfileDetailsProvider userProfileDetailsProvider, TimeUtilsContract timeUtilsContract) {
        this.f5397a = currencyFeature;
        this.b = stringProvider;
        this.c = getMTicketForTicketIdUseCase;
        this.d = mTicketUtilsHelper;
        this.e = userProfileDetailsProvider;
        this.f = timeUtilsContract;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel h = getH();
        if (h != null) {
            return ((MTicketProductValidationModel) h).getJ();
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
        MTicketValidationData$isValid$1 mTicketValidationData$isValid$1;
        boolean zBooleanValue;
        if (continuationImpl instanceof MTicketValidationData$isValid$1) {
            mTicketValidationData$isValid$1 = (MTicketValidationData$isValid$1) continuationImpl;
            int i = mTicketValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationData$isValid$1 = new MTicketValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            mTicketValidationData$isValid$1 = new MTicketValidationData$isValid$1(this, continuationImpl);
        }
        Object objInvoke = mTicketValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationData$isValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            MTicketProductValidationModel mTicketProductValidationModel = this.g;
            if (mTicketProductValidationModel != null) {
                Function1 function1 = mTicketProductValidationModel.l;
                mTicketValidationData$isValid$1.label = 1;
                objInvoke = ((MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$2) function1).invoke(mTicketValidationData$isValid$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objInvoke);
        zBooleanValue = ((Boolean) objInvoke).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts D() {
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        if (mTicketProductValidationModel != null) {
            return mTicketProductValidationModel.k;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object F(Continuation continuation) {
        MTicketValidationData$getActivationId$1 mTicketValidationData$getActivationId$1;
        if (continuation instanceof MTicketValidationData$getActivationId$1) {
            mTicketValidationData$getActivationId$1 = (MTicketValidationData$getActivationId$1) continuation;
            int i = mTicketValidationData$getActivationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationData$getActivationId$1 = new MTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
            }
        } else {
            mTicketValidationData$getActivationId$1 = new MTicketValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
        }
        Object objX = mTicketValidationData$getActivationId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            mTicketValidationData$getActivationId$1.label = 1;
            objX = x(mTicketValidationData$getActivationId$1);
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

    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:33:0x0096  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:49:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0085 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
    
        if (r11 == r1) goto L40;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00ca -> B:42:0x00cb). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mTicketing.validation.MTicketValidationData.H(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String a() {
        String str;
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        return (mTicketProductValidationModel == null || (str = mTicketProductValidationModel.g) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        String str;
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        return (mTicketProductValidationModel == null || (str = mTicketProductValidationModel.h) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.g = null;
        this.h = MapsKt.d();
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
    /* JADX INFO: renamed from: f */
    public final ProductValidationModel getH() {
        return this.g;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        if (mTicketProductValidationModel == null) {
            return "";
        }
        String strA = this.f5397a.a(mTicketProductValidationModel.e, CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String str;
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        return (mTicketProductValidationModel == null || (str = mTicketProductValidationModel.f5390a) == null) ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        MTicketValidationData$isProductActivationValid$1 mTicketValidationData$isProductActivationValid$1;
        boolean zBooleanValue;
        if (continuationImpl instanceof MTicketValidationData$isProductActivationValid$1) {
            mTicketValidationData$isProductActivationValid$1 = (MTicketValidationData$isProductActivationValid$1) continuationImpl;
            int i = mTicketValidationData$isProductActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationData$isProductActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationData$isProductActivationValid$1 = new MTicketValidationData$isProductActivationValid$1(this, continuationImpl);
            }
        } else {
            mTicketValidationData$isProductActivationValid$1 = new MTicketValidationData$isProductActivationValid$1(this, continuationImpl);
        }
        Object objInvoke = mTicketValidationData$isProductActivationValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationData$isProductActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            MTicketProductValidationModel mTicketProductValidationModel = this.g;
            if (mTicketProductValidationModel == null) {
                mTicketProductValidationModel = null;
            }
            if (mTicketProductValidationModel != null) {
                Function1 function1 = mTicketProductValidationModel.n;
                mTicketValidationData$isProductActivationValid$1.label = 1;
                objInvoke = ((MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$4) function1).invoke(mTicketValidationData$isProductActivationValid$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                zBooleanValue = false;
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objInvoke);
        zBooleanValue = ((Boolean) objInvoke).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
        this.h = map;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        return mTicketProductValidationModel != null ? mTicketProductValidationModel.i : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ Long l() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.g = (MTicketProductValidationModel) productValidationModel;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        String str;
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        return (mTicketProductValidationModel == null || (str = mTicketProductValidationModel.f) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        if (mTicketProductValidationModel != null) {
            return mTicketProductValidationModel.c;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        if (mTicketProductValidationModel != null) {
            return mTicketProductValidationModel.d;
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
        String str;
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        if (mTicketProductValidationModel == null || (str = mTicketProductValidationModel.f5390a) == null) {
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.h(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:52:0x0107  */
    /* JADX WARN: Code duplicated, block: B:56:0x0136  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        if (r1 == r3) goto L59;
     */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object t(kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.mTicketing.validation.MTicketValidationData.t(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return MapsKt.u(this.h);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        String str;
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        return (mTicketProductValidationModel == null || (str = mTicketProductValidationModel.b) == null) ? "" : str;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        MTicketValidationData$getActivationTimestampMS$1 mTicketValidationData$getActivationTimestampMS$1;
        long jLongValue;
        if (continuationImpl instanceof MTicketValidationData$getActivationTimestampMS$1) {
            mTicketValidationData$getActivationTimestampMS$1 = (MTicketValidationData$getActivationTimestampMS$1) continuationImpl;
            int i = mTicketValidationData$getActivationTimestampMS$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mTicketValidationData$getActivationTimestampMS$1.label = i - Integer.MIN_VALUE;
            } else {
                mTicketValidationData$getActivationTimestampMS$1 = new MTicketValidationData$getActivationTimestampMS$1(this, continuationImpl);
            }
        } else {
            mTicketValidationData$getActivationTimestampMS$1 = new MTicketValidationData$getActivationTimestampMS$1(this, continuationImpl);
        }
        Object objInvoke = mTicketValidationData$getActivationTimestampMS$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = mTicketValidationData$getActivationTimestampMS$1.label;
        if (i2 == 0) {
            ResultKt.b(objInvoke);
            MTicketProductValidationModel mTicketProductValidationModel = this.g;
            if (mTicketProductValidationModel != null) {
                Function1 function1 = mTicketProductValidationModel.m;
                mTicketValidationData$getActivationTimestampMS$1.label = 1;
                objInvoke = ((MTicketValidationConverters$convertMTicketToMTicketProductValidationModel$2$3) function1).invoke(mTicketValidationData$getActivationTimestampMS$1);
                if (objInvoke == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                jLongValue = -1;
            }
            return new Long(jLongValue);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objInvoke);
        jLongValue = ((Number) objInvoke).longValue();
        return new Long(jLongValue);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        MTicketUserDetailsForProducts mTicketUserDetailsForProducts;
        MTicketProductValidationModel mTicketProductValidationModel = this.g;
        return (mTicketProductValidationModel == null || (mTicketUserDetailsForProducts = mTicketProductValidationModel.k) == null) ? new MTicketUserDetailsForProducts(null, this.e) : mTicketUserDetailsForProducts;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        return QRValidationType.DYNAMIC;
    }
}

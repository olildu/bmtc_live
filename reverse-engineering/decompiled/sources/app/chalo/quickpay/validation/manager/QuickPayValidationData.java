package app.chalo.quickpay.validation.manager;

import androidx.media3.exoplayer.ExoPlayer;
import app.chalo.constants.CurrencyRoundOffLogic;
import app.chalo.contract.BasicInfoContract;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.data.ProductBookingBranding;
import app.chalo.extensions.PrimitiveDataTypeExtentionsKt;
import app.chalo.features.encryption.EncryptionFeature;
import app.chalo.features.wallet.CurrencyFeature;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.AgencyInfoAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.ChaloTransitMode;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModelKt;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.receipt.UserDetailsForProducts;
import app.chalo.scenes.args.QRValidationType;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.utils.ChaloWalletOrderIdUtils;
import app.chalo.utils.timeutil.TimeUtilsContract;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationModel;
import app.chalo.validationsdk.blevalidation.data.models.ValidationPayloadMetaData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayData;
import app.chalo.validationsdk.blevalidation.ui.ProductDetailsDisplayFieldData;
import app.chalo.walletframework.quickpay.data.model.appmodel.QPUserDetailsForProducts;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/quickpay/validation/manager/QuickPayValidationData;", "Lapp/chalo/validationsdk/blevalidation/data/models/ProductValidationData;", "Companion", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class QuickPayValidationData implements ProductValidationData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CrashlyticsLogger f8913a;
    public final BasicInfoContract b;
    public final EncryptionFeature c;
    public final QPUserDetailsForProducts d;
    public final CurrencyFeature e;
    public final StringProvider f;
    public final TimeUtilsContract g;
    public final CityProvider h;
    public final byte[] i = {1};
    public final byte[] j = {-96};
    public ProductValidationModel k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lapp/chalo/quickpay/validation/manager/QuickPayValidationData$Companion;", "", "", "SEMI_CLOSED_WALLET_ID_BYTES_LENGTH", "I", "CLOSED_LOOP_WALLET_ID_BYTES_LENGTH", "wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8914a;

        static {
            int[] iArr = new int[WalletType.values().length];
            try {
                iArr[WalletType.SEMI_CLOSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8914a = iArr;
        }
    }

    public QuickPayValidationData(CrashlyticsLogger crashlyticsLogger, BasicInfoContract basicInfoContract, EncryptionFeature encryptionFeature, QPUserDetailsForProducts qPUserDetailsForProducts, CurrencyFeature currencyFeature, StringProvider stringProvider, TimeUtilsContract timeUtilsContract, CityProvider cityProvider) {
        this.f8913a = crashlyticsLogger;
        this.b = basicInfoContract;
        this.c = encryptionFeature;
        this.d = qPUserDetailsForProducts;
        this.e = currencyFeature;
        this.f = stringProvider;
        this.g = timeUtilsContract;
        this.h = cityProvider;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Long A() {
        ProductValidationModel productValidationModel = this.k;
        if (productValidationModel != null) {
            return productValidationModel.getJ();
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
        QuickPayValidationData$isValid$1 quickPayValidationData$isValid$1;
        ProductValidationModel productValidationModel;
        if (continuationImpl instanceof QuickPayValidationData$isValid$1) {
            quickPayValidationData$isValid$1 = (QuickPayValidationData$isValid$1) continuationImpl;
            int i = quickPayValidationData$isValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$isValid$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$isValid$1 = new QuickPayValidationData$isValid$1(this, continuationImpl);
            }
        } else {
            quickPayValidationData$isValid$1 = new QuickPayValidationData$isValid$1(this, continuationImpl);
        }
        Object obj = quickPayValidationData$isValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$isValid$1.label;
        boolean z = false;
        BasicInfoContract basicInfoContract = this.b;
        if (i2 == 0) {
            ResultKt.b(obj);
            ProductValidationModel productValidationModel2 = this.k;
            if (productValidationModel2 != null) {
                quickPayValidationData$isValid$1.L$0 = productValidationModel2;
                quickPayValidationData$isValid$1.label = 1;
                Object objC = basicInfoContract.c(quickPayValidationData$isValid$1);
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
        productValidationModel = (ProductValidationModel) quickPayValidationData$isValid$1.L$0;
        ResultKt.b(obj);
        if (((Number) obj).longValue() < productValidationModel.getD() && basicInfoContract.d()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts D() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object F(Continuation continuation) {
        QuickPayValidationData$getActivationId$1 quickPayValidationData$getActivationId$1;
        if (continuation instanceof QuickPayValidationData$getActivationId$1) {
            quickPayValidationData$getActivationId$1 = (QuickPayValidationData$getActivationId$1) continuation;
            int i = quickPayValidationData$getActivationId$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$getActivationId$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$getActivationId$1 = new QuickPayValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayValidationData$getActivationId$1 = new QuickPayValidationData$getActivationId$1(this, (ContinuationImpl) continuation);
        }
        Object objX = quickPayValidationData$getActivationId$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$getActivationId$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            quickPayValidationData$getActivationId$1.label = 1;
            objX = x(quickPayValidationData$getActivationId$1);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object H(ContinuationImpl continuationImpl) {
        QuickPayValidationData$getEncryptedData$1 quickPayValidationData$getEncryptedData$1;
        byte[] bArrB0;
        QuickPayValidationModel quickPayValidationModel;
        long j;
        int i;
        CrashlyticsLogger crashlyticsLogger = this.f8913a;
        if (continuationImpl instanceof QuickPayValidationData$getEncryptedData$1) {
            quickPayValidationData$getEncryptedData$1 = (QuickPayValidationData$getEncryptedData$1) continuationImpl;
            int i2 = quickPayValidationData$getEncryptedData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$getEncryptedData$1.label = i2 - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$getEncryptedData$1 = new QuickPayValidationData$getEncryptedData$1(this, continuationImpl);
            }
        } else {
            quickPayValidationData$getEncryptedData$1 = new QuickPayValidationData$getEncryptedData$1(this, continuationImpl);
        }
        Object obj = quickPayValidationData$getEncryptedData$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = quickPayValidationData$getEncryptedData$1.label;
        if (i3 == 0) {
            ResultKt.b(obj);
            try {
                ProductValidationModel productValidationModel = this.k;
                QuickPayValidationModel quickPayValidationModel2 = productValidationModel instanceof QuickPayValidationModel ? (QuickPayValidationModel) productValidationModel : null;
                if (quickPayValidationModel2 == null) {
                    bArrB0 = null;
                } else {
                    String str = (String) ChaloWalletOrderIdUtils.b(quickPayValidationModel2.i).d();
                    int i4 = WhenMappings.f8914a[quickPayValidationModel2.m.f10959a.ordinal()];
                    if (i4 == 1) {
                        i = 3;
                    } else {
                        if (i4 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = 4;
                    }
                    bArrB0 = ArraysKt.b0(ArraysKt.b0(PrimitiveDataTypeExtentionsKt.a(Integer.parseInt(str), i), PrimitiveDataTypeExtentionsKt.a((int) ((quickPayValidationModel2.f - 1640995200000L) / 1000), 4)), PrimitiveDataTypeExtentionsKt.a(quickPayValidationModel2.h, 3));
                }
            } catch (Throwable th) {
                crashlyticsLogger.i(th);
            }
            if (bArrB0 == null) {
                return null;
            }
            ProductValidationModel productValidationModel2 = this.k;
            QuickPayValidationModel quickPayValidationModel3 = productValidationModel2 instanceof QuickPayValidationModel ? (QuickPayValidationModel) productValidationModel2 : null;
            if (quickPayValidationModel3 == null) {
                IllegalStateException illegalStateException = new IllegalStateException("QuickPayValidationModel missing while preparing encrypted validation payload");
                crashlyticsLogger.i(illegalStateException);
                return new ChaloUseCaseResult.Failure(illegalStateException);
            }
            long jP = p();
            quickPayValidationData$getEncryptedData$1.L$0 = bArrB0;
            quickPayValidationData$getEncryptedData$1.L$1 = quickPayValidationModel3;
            quickPayValidationData$getEncryptedData$1.J$0 = jP;
            quickPayValidationData$getEncryptedData$1.label = 1;
            Object objC = this.b.c(quickPayValidationData$getEncryptedData$1);
            if (objC != coroutineSingletons) {
                quickPayValidationModel = quickPayValidationModel3;
                obj = objC;
                j = jP;
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        j = quickPayValidationData$getEncryptedData$1.J$0;
        quickPayValidationModel = (QuickPayValidationModel) quickPayValidationData$getEncryptedData$1.L$1;
        bArrB0 = (byte[]) quickPayValidationData$getEncryptedData$1.L$0;
        ResultKt.b(obj);
        String strC = Base64.c(Base64.f, ArraysKt.b0(bArrB0, PrimitiveDataTypeExtentionsKt.a((int) ((j - ((Number) obj).longValue()) / ((long) 1000)), 2)));
        String str2 = quickPayValidationModel.m.b;
        quickPayValidationData$getEncryptedData$1.L$0 = null;
        quickPayValidationData$getEncryptedData$1.L$1 = null;
        quickPayValidationData$getEncryptedData$1.label = 2;
        Object objA = this.c.a(strC, str2, quickPayValidationData$getEncryptedData$1);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(Continuation continuation) {
        QuickPayValidationData$getToneByteArray$1 quickPayValidationData$getToneByteArray$1;
        if (continuation instanceof QuickPayValidationData$getToneByteArray$1) {
            quickPayValidationData$getToneByteArray$1 = (QuickPayValidationData$getToneByteArray$1) continuation;
            int i = quickPayValidationData$getToneByteArray$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$getToneByteArray$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$getToneByteArray$1 = new QuickPayValidationData$getToneByteArray$1(this, (ContinuationImpl) continuation);
            }
        } else {
            quickPayValidationData$getToneByteArray$1 = new QuickPayValidationData$getToneByteArray$1(this, (ContinuationImpl) continuation);
        }
        Object objH = quickPayValidationData$getToneByteArray$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$getToneByteArray$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            quickPayValidationData$getToneByteArray$1.label = 1;
            objH = H(quickPayValidationData$getToneByteArray$1);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objH;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
            return null;
        }
        byte[] bArrB = Base64.b(Base64.f, (CharSequence) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a, 0, 6);
        ValidationPayloadMetaData validationPayloadMetaDataE = e();
        ValidationPayloadMetaData.QuickPayMeta quickPayMeta = (ValidationPayloadMetaData.QuickPayMeta) validationPayloadMetaDataE;
        byte[] bArr = this.i;
        if (quickPayMeta != null) {
            if (quickPayMeta.f10481a) {
                bArr = this.j;
            }
        } else if (validationPayloadMetaDataE != null) {
            throw new NoWhenBranchMatchedException();
        }
        return ArraysKt.b0(bArr, bArrB);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String a() {
        return "quickpay";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String b() {
        return "quickpay";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void clear() {
        this.k = null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ boolean d() {
        return ProductValidationData.DefaultImpls.a(this);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final ValidationPayloadMetaData e() {
        WalletTypeIdentifier walletTypeIdentifier;
        ProductValidationModel productValidationModel = this.k;
        QuickPayValidationModel quickPayValidationModel = productValidationModel instanceof QuickPayValidationModel ? (QuickPayValidationModel) productValidationModel : null;
        if (quickPayValidationModel == null || (walletTypeIdentifier = quickPayValidationModel.m) == null) {
            return null;
        }
        return new ValidationPayloadMetaData.QuickPayMeta(walletTypeIdentifier.d);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    /* JADX INFO: renamed from: f, reason: from getter */
    public final ProductValidationModel getK() {
        return this.k;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String g() {
        ProductValidationModel productValidationModel = this.k;
        if (productValidationModel == null) {
            return "";
        }
        String strA = this.e.a(productValidationModel.getE(), CurrencyRoundOffLogic.ROUND_OFF_LOGIC_NO_ROUNDING);
        return strA == null ? "" : strA;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String getId() {
        String f;
        ProductValidationModel productValidationModel = this.k;
        return (productValidationModel == null || (f = productValidationModel.getF()) == null) ? "" : f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object h(ContinuationImpl continuationImpl) {
        QuickPayValidationData$isProductActivationValid$1 quickPayValidationData$isProductActivationValid$1;
        long j;
        if (continuationImpl instanceof QuickPayValidationData$isProductActivationValid$1) {
            quickPayValidationData$isProductActivationValid$1 = (QuickPayValidationData$isProductActivationValid$1) continuationImpl;
            int i = quickPayValidationData$isProductActivationValid$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$isProductActivationValid$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$isProductActivationValid$1 = new QuickPayValidationData$isProductActivationValid$1(this, continuationImpl);
            }
        } else {
            quickPayValidationData$isProductActivationValid$1 = new QuickPayValidationData$isProductActivationValid$1(this, continuationImpl);
        }
        Object objC = quickPayValidationData$isProductActivationValid$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$isProductActivationValid$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            long jP = p();
            quickPayValidationData$isProductActivationValid$1.J$0 = jP;
            quickPayValidationData$isProductActivationValid$1.label = 1;
            objC = this.b.c(quickPayValidationData$isProductActivationValid$1);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
            j = jP;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = quickPayValidationData$isProductActivationValid$1.J$0;
            ResultKt.b(objC);
        }
        return Boolean.valueOf(j > ((Number) objC).longValue());
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long j() {
        return 1000L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object k(ContinuationImpl continuationImpl) {
        return this.f.b(StringEnum.CHALO_PAY, new Object[0], continuationImpl);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final /* bridge */ Long l() {
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void m(ProductValidationModel productValidationModel) {
        Intrinsics.i(productValidationModel, "productValidationModel");
        this.k = productValidationModel;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String n() {
        ProductValidationModel productValidationModel = this.k;
        if (productValidationModel == null) {
            return "";
        }
        String str = ((String) ChaloWalletOrderIdUtils.b(productValidationModel.getF()).d()) + productValidationModel.getD();
        return str == null ? "" : str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object o(ContinuationImpl continuationImpl) {
        QuickPayValidationData$getValidationStaticPayload$1 quickPayValidationData$getValidationStaticPayload$1;
        if (continuationImpl instanceof QuickPayValidationData$getValidationStaticPayload$1) {
            quickPayValidationData$getValidationStaticPayload$1 = (QuickPayValidationData$getValidationStaticPayload$1) continuationImpl;
            int i = quickPayValidationData$getValidationStaticPayload$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$getValidationStaticPayload$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$getValidationStaticPayload$1 = new QuickPayValidationData$getValidationStaticPayload$1(this, continuationImpl);
            }
        } else {
            quickPayValidationData$getValidationStaticPayload$1 = new QuickPayValidationData$getValidationStaticPayload$1(this, continuationImpl);
        }
        Object objH = quickPayValidationData$getValidationStaticPayload$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$getValidationStaticPayload$1.label;
        if (i2 == 0) {
            ResultKt.b(objH);
            quickPayValidationData$getValidationStaticPayload$1.label = 1;
            objH = H(quickPayValidationData$getValidationStaticPayload$1);
            if (objH == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objH);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objH;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return (String) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
        }
        return null;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long p() {
        ProductValidationModel productValidationModel = this.k;
        if (productValidationModel != null) {
            return productValidationModel.getD();
        }
        return 0L;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object q(ContinuationImpl continuationImpl) {
        return EmptyList.f17557a;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object r(ContinuationImpl continuationImpl) {
        ProductValidationModel productValidationModel = this.k;
        Object obj = null;
        QuickPayValidationModel quickPayValidationModel = productValidationModel instanceof QuickPayValidationModel ? (QuickPayValidationModel) productValidationModel : null;
        if (quickPayValidationModel == null) {
            return ProductBookingBranding.None.INSTANCE;
        }
        WalletTypeIdentifier walletTypeIdentifier = quickPayValidationModel.m;
        boolean z = walletTypeIdentifier.c;
        String str = walletTypeIdentifier.b;
        if (z) {
            return ProductBookingBranding.None.INSTANCE;
        }
        CityAppModel cityAppModel = (CityAppModel) this.h.getE().getValue();
        if (cityAppModel == null) {
            return ProductBookingBranding.None.INSTANCE;
        }
        ArrayList arrayListA = CityAppModelKt.a(ChaloTransitMode.BUS, cityAppModel);
        int size = arrayListA.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayListA.get(i);
            i++;
            if (StringsKt.x(((AgencyInfoAppModel) obj2).f8852a, str, true)) {
                obj = obj2;
                break;
            }
        }
        if (obj == null) {
            return ProductBookingBranding.None.INSTANCE;
        }
        ProductBookingBranding.Companion companion = ProductBookingBranding.INSTANCE;
        String str2 = cityAppModel.f8854a;
        companion.getClass();
        return ProductBookingBranding.Companion.a(str2, str);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final String s() {
        StringBuilder sb = new StringBuilder();
        ProductValidationModel productValidationModel = this.k;
        if (productValidationModel != null) {
            int d = ((int) ((productValidationModel.getD() - 1640995200000L) / 1000)) % ((int) Math.pow(26.0f, 5.0f));
            for (int i = 1; i < 6; i++) {
                sb.append((char) ((d % 26) + 65));
                d /= 26;
            }
        }
        String string = sb.toString();
        Intrinsics.h(string, "toString(...)");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object t(ContinuationImpl continuationImpl) {
        QuickPayValidationData$getProductDetailsFieldsData$1 quickPayValidationData$getProductDetailsFieldsData$1;
        String strA;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData2;
        String str;
        ProductDetailsDisplayFieldData productDetailsDisplayFieldData3;
        if (continuationImpl instanceof QuickPayValidationData$getProductDetailsFieldsData$1) {
            quickPayValidationData$getProductDetailsFieldsData$1 = (QuickPayValidationData$getProductDetailsFieldsData$1) continuationImpl;
            int i = quickPayValidationData$getProductDetailsFieldsData$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$getProductDetailsFieldsData$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$getProductDetailsFieldsData$1 = new QuickPayValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
            }
        } else {
            quickPayValidationData$getProductDetailsFieldsData$1 = new QuickPayValidationData$getProductDetailsFieldsData$1(this, continuationImpl);
        }
        Object objB = quickPayValidationData$getProductDetailsFieldsData$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$getProductDetailsFieldsData$1.label;
        StringProvider stringProvider = this.f;
        if (i2 == 0) {
            ResultKt.b(objB);
            strA = TimeUtilsContract.DefaultImpls.a(this.g, p(), "on", 4);
            quickPayValidationData$getProductDetailsFieldsData$1.L$0 = strA;
            quickPayValidationData$getProductDetailsFieldsData$1.label = 1;
            objB = stringProvider.b(StringEnum.PASSENGER, new Object[0], quickPayValidationData$getProductDetailsFieldsData$1);
            if (objB != obj) {
            }
            return obj;
        }
        if (i2 == 1) {
            strA = (String) quickPayValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(objB);
        } else {
            if (i2 == 2) {
                ProductDetailsDisplayFieldData productDetailsDisplayFieldData4 = (ProductDetailsDisplayFieldData) quickPayValidationData$getProductDetailsFieldsData$1.L$1;
                String str2 = (String) quickPayValidationData$getProductDetailsFieldsData$1.L$0;
                ResultKt.b(objB);
                productDetailsDisplayFieldData = productDetailsDisplayFieldData4;
                strA = str2;
                productDetailsDisplayFieldData2 = new ProductDetailsDisplayFieldData((String) objB, g());
                quickPayValidationData$getProductDetailsFieldsData$1.L$0 = strA;
                quickPayValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayFieldData;
                quickPayValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData2;
                quickPayValidationData$getProductDetailsFieldsData$1.label = 3;
                objB = k(quickPayValidationData$getProductDetailsFieldsData$1);
                if (objB != obj) {
                    str = strA;
                    productDetailsDisplayFieldData3 = productDetailsDisplayFieldData;
                }
                return obj;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductDetailsDisplayFieldData productDetailsDisplayFieldData5 = (ProductDetailsDisplayFieldData) quickPayValidationData$getProductDetailsFieldsData$1.L$2;
            ProductDetailsDisplayFieldData productDetailsDisplayFieldData6 = (ProductDetailsDisplayFieldData) quickPayValidationData$getProductDetailsFieldsData$1.L$1;
            String str3 = (String) quickPayValidationData$getProductDetailsFieldsData$1.L$0;
            ResultKt.b(objB);
            productDetailsDisplayFieldData2 = productDetailsDisplayFieldData5;
            productDetailsDisplayFieldData3 = productDetailsDisplayFieldData6;
            str = str3;
        }
        return new ProductDetailsDisplayData(str, null, productDetailsDisplayFieldData3, productDetailsDisplayFieldData2, null, (String) objB, null, null, null, 466);
        productDetailsDisplayFieldData = new ProductDetailsDisplayFieldData((String) objB, this.d.getC());
        quickPayValidationData$getProductDetailsFieldsData$1.L$0 = strA;
        quickPayValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayFieldData;
        quickPayValidationData$getProductDetailsFieldsData$1.label = 2;
        objB = stringProvider.b(StringEnum.AMOUNT_PAID, new Object[0], quickPayValidationData$getProductDetailsFieldsData$1);
        if (objB != obj) {
            productDetailsDisplayFieldData2 = new ProductDetailsDisplayFieldData((String) objB, g());
            quickPayValidationData$getProductDetailsFieldsData$1.L$0 = strA;
            quickPayValidationData$getProductDetailsFieldsData$1.L$1 = productDetailsDisplayFieldData;
            quickPayValidationData$getProductDetailsFieldsData$1.L$2 = productDetailsDisplayFieldData2;
            quickPayValidationData$getProductDetailsFieldsData$1.label = 3;
            objB = k(quickPayValidationData$getProductDetailsFieldsData$1);
            if (objB != obj) {
                str = strA;
                productDetailsDisplayFieldData3 = productDetailsDisplayFieldData;
                return new ProductDetailsDisplayData(str, null, productDetailsDisplayFieldData3, productDetailsDisplayFieldData2, null, (String) objB, null, null, null, 466);
            }
        }
        return obj;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final LinkedHashMap u() {
        return new LinkedHashMap();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object v(ContinuationImpl continuationImpl) {
        QuickPayValidationData$getStaticQRCode$1 quickPayValidationData$getStaticQRCode$1;
        if (continuationImpl instanceof QuickPayValidationData$getStaticQRCode$1) {
            quickPayValidationData$getStaticQRCode$1 = (QuickPayValidationData$getStaticQRCode$1) continuationImpl;
            int i = quickPayValidationData$getStaticQRCode$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                quickPayValidationData$getStaticQRCode$1.label = i - Integer.MIN_VALUE;
            } else {
                quickPayValidationData$getStaticQRCode$1 = new QuickPayValidationData$getStaticQRCode$1(this, continuationImpl);
            }
        } else {
            quickPayValidationData$getStaticQRCode$1 = new QuickPayValidationData$getStaticQRCode$1(this, continuationImpl);
        }
        Object objI = quickPayValidationData$getStaticQRCode$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = quickPayValidationData$getStaticQRCode$1.label;
        if (i2 == 0) {
            ResultKt.b(objI);
            quickPayValidationData$getStaticQRCode$1.label = 1;
            objI = I(quickPayValidationData$getStaticQRCode$1);
            if (objI == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objI);
        }
        byte[] bArr = (byte[]) objI;
        return bArr != null ? Base64.c(Base64.f, bArr).concat("Z") : "";
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final long w() {
        return ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final Object x(ContinuationImpl continuationImpl) {
        QuickPayValidationModel quickPayValidationModel = (QuickPayValidationModel) this.k;
        return new Long(quickPayValidationModel != null ? quickPayValidationModel.n : 0L);
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final UserDetailsForProducts y() {
        return this.d;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final QRValidationType z() {
        return QRValidationType.DYNAMIC;
    }

    @Override // app.chalo.validationsdk.blevalidation.data.models.ProductValidationData
    public final void i(HashMap map) {
    }
}

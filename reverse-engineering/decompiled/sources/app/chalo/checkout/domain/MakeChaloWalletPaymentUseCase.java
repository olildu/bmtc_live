package app.chalo.checkout.domain;

import app.chalo.checkout.data.exceptions.ChaloPayPaymentFailedException;
import app.chalo.checkout.data.model.api.response.ChaloPaymentStatus;
import app.chalo.checkout.data.model.app.ChaloPayPaymentResponseAppModel;
import app.chalo.checkout.data.model.app.request.ChaloPayPaymentRequestAppModel;
import app.chalo.checkout.data.model.app.request.ClosedLoopWalletPaymentRequestAppModel;
import app.chalo.checkout.data.repository.ICheckoutRepository;
import app.chalo.contract.BasicInfoContract;
import app.chalo.mvibase.simple.DataFetchOperationException;
import app.chalo.mvibase.simple.OperationFailureError;
import app.chalo.mvibase.simple.UseCaseOperationError;
import app.chalo.mvibase.simple.UseCaseOperationErrorKt;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.cityprovider.impl.data.models.app.CityAppModel;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/checkout/domain/MakeChaloWalletPaymentUseCase;", "", "checkout_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MakeChaloWalletPaymentUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f1381a;
    public final UserProfileDetailsProvider b;
    public final ICheckoutRepository c;
    public final CityProvider d;
    public final StringProvider e;
    public final BasicInfoContract f;
    public final WalletSyncOrchestrator g;
    public final WalletResolver h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1382a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

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
            f1382a = iArr;
            int[] iArr2 = new int[ChaloPaymentStatus.values().length];
            try {
                iArr2[ChaloPaymentStatus.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ChaloPaymentStatus.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ChaloPaymentStatus.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ChaloPaymentStatus.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[WalletResolverError.values().length];
            try {
                iArr3[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            c = iArr3;
        }
    }

    public MakeChaloWalletPaymentUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, ICheckoutRepository iCheckoutRepository, CityProvider cityProvider, StringProvider stringProvider, BasicInfoContract basicInfoContract, WalletSyncOrchestrator walletSyncOrchestrator, WalletResolver walletResolver) {
        this.f1381a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = iCheckoutRepository;
        this.d = cityProvider;
        this.e = stringProvider;
        this.f = basicInfoContract;
        this.g = walletSyncOrchestrator;
        this.h = walletResolver;
    }

    public static ChaloUseCaseResult.Failure a(ChaloPaymentFailureReason chaloPaymentFailureReason, String str) {
        return new ChaloUseCaseResult.Failure(new UseCaseOperationError(new OperationFailureError.UseCaseSpecificError(chaloPaymentFailureReason), chaloPaymentFailureReason.getErrorCode(), str));
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0200 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0213  */
    /* JADX WARN: Code duplicated, block: B:106:0x0215  */
    /* JADX WARN: Code duplicated, block: B:111:0x022c  */
    /* JADX WARN: Code duplicated, block: B:112:0x022e  */
    /* JADX WARN: Code duplicated, block: B:121:0x024f  */
    /* JADX WARN: Code duplicated, block: B:122:0x0251  */
    /* JADX WARN: Code duplicated, block: B:125:0x025c A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:127:0x026a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0272 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0286  */
    /* JADX WARN: Code duplicated, block: B:133:0x0288  */
    /* JADX WARN: Code duplicated, block: B:136:0x0293 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:138:0x0297 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:140:0x029c A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f0 A[Catch: Exception -> 0x0051, TRY_LEAVE, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0108  */
    /* JADX WARN: Code duplicated, block: B:58:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0121 A[Catch: Exception -> 0x0051, TRY_ENTER, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0173 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0186  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x0193 A[PHI: r0 r2 r3 r6
      0x0193: PHI (r0v39 int) = (r0v28 int), (r0v43 int) binds: [B:102:0x01fe, B:76:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r2v38 app.chalo.checkout.data.model.app.ChaloPayPaymentResponseAppModel) = 
      (r2v31 app.chalo.checkout.data.model.app.ChaloPayPaymentResponseAppModel)
      (r2v44 app.chalo.checkout.data.model.app.ChaloPayPaymentResponseAppModel)
     binds: [B:102:0x01fe, B:76:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r3v35 app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel) = 
      (r3v24 app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel)
      (r3v38 app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel)
     binds: [B:102:0x01fe, B:76:0x0171] A[DONT_GENERATE, DONT_INLINE]
      0x0193: PHI (r6v29 java.lang.String) = (r6v25 java.lang.String), (r6v33 java.lang.String) binds: [B:102:0x01fe, B:76:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x019a A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01af  */
    /* JADX WARN: Code duplicated, block: B:87:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01c2 A[Catch: Exception -> 0x0051, TryCatch #0 {Exception -> 0x0051, blocks: (B:14:0x004c, B:123:0x0252, B:19:0x0058, B:128:0x026c, B:22:0x0065, B:81:0x0189, B:25:0x0074, B:75:0x016f, B:77:0x0173, B:109:0x0220, B:117:0x0235, B:118:0x023a, B:119:0x023b, B:125:0x025c, B:28:0x0081, B:88:0x01b2, B:31:0x008e, B:107:0x0216, B:34:0x009d, B:101:0x01fc, B:103:0x0200, B:37:0x00aa, B:134:0x0289, B:40:0x00bd, B:47:0x00ea, B:49:0x00f0, B:52:0x0104, B:55:0x0109, B:59:0x0121, B:61:0x0127, B:64:0x012d, B:66:0x0139, B:71:0x0143, B:84:0x019a, B:90:0x01bc, B:91:0x01c1, B:92:0x01c2, B:94:0x01cc, B:97:0x01d2, B:130:0x0272, B:136:0x0293, B:138:0x0297, B:140:0x029c, B:141:0x02a1, B:43:0x00cb), top: B:170:0x002c }] */
    public final Object b(String str, String str2, int i, WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        MakeChaloWalletPaymentUseCase$invoke$1 makeChaloWalletPaymentUseCase$invoke$1;
        ChaloPaymentFailureReason chaloPaymentFailureReason;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase;
        ChaloPaymentFailureReason chaloPaymentFailureReason2;
        String str3;
        String str4;
        int i2;
        ChaloUseCaseResult chaloUseCaseResult;
        CityAppModel cityAppModel;
        String str5;
        int i3;
        UserProfileDetailsProvider userProfileDetailsProvider;
        UserProfileAppModel userProfileAppModelF;
        ChaloPaymentFailureReason chaloPaymentFailureReason3;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase2;
        String str6;
        int i4;
        WalletAppModel walletAppModel;
        String str7;
        UserProfileAppModel userProfileAppModelF2;
        ChaloPaymentFailureReason chaloPaymentFailureReason4;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase3;
        String str8;
        String str9;
        ChaloPayPaymentResponseAppModel chaloPayPaymentResponseAppModel;
        ChaloPaymentFailureReason chaloPaymentFailureReason5;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase4;
        int i5;
        ChaloPayPaymentResponseAppModel chaloPayPaymentResponseAppModel2;
        int i6;
        ChaloPaymentFailureReason chaloPaymentFailureReason6;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase5;
        ChaloPaymentFailureReason chaloPaymentFailureReason7;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase6;
        WalletTypeIdentifier walletTypeIdentifier2 = walletTypeIdentifier;
        CityProvider cityProvider = this.d;
        if (continuationImpl instanceof MakeChaloWalletPaymentUseCase$invoke$1) {
            makeChaloWalletPaymentUseCase$invoke$1 = (MakeChaloWalletPaymentUseCase$invoke$1) continuationImpl;
            int i7 = makeChaloWalletPaymentUseCase$invoke$1.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                makeChaloWalletPaymentUseCase$invoke$1.label = i7 - Integer.MIN_VALUE;
            } else {
                makeChaloWalletPaymentUseCase$invoke$1 = new MakeChaloWalletPaymentUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            makeChaloWalletPaymentUseCase$invoke$1 = new MakeChaloWalletPaymentUseCase$invoke$1(this, continuationImpl);
        }
        Object objB = makeChaloWalletPaymentUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i8 = makeChaloWalletPaymentUseCase$invoke$1.label;
        StringProvider stringProvider = this.e;
        int i9 = 0;
        try {
            switch (i8) {
                case 0:
                    ResultKt.b(objB);
                    makeChaloWalletPaymentUseCase$invoke$1.L$0 = str;
                    makeChaloWalletPaymentUseCase$invoke$1.L$1 = str2;
                    makeChaloWalletPaymentUseCase$invoke$1.L$2 = walletTypeIdentifier2;
                    makeChaloWalletPaymentUseCase$invoke$1.I$0 = i;
                    makeChaloWalletPaymentUseCase$invoke$1.label = 1;
                    Object objC = c(walletTypeIdentifier2, makeChaloWalletPaymentUseCase$invoke$1);
                    if (objC != coroutineSingletons) {
                        str3 = str;
                        objB = objC;
                        str4 = str2;
                        i2 = i;
                        chaloUseCaseResult = (ChaloUseCaseResult) objB;
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                                return ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        WalletAppModel walletAppModel2 = (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                        cityAppModel = (CityAppModel) cityProvider.getE().getValue();
                        if (cityAppModel != null || (str5 = cityAppModel.p) == null) {
                            str5 = "";
                        }
                        String strR = StringsKt.R(str5, "+", "");
                        i3 = WhenMappings.f1382a[walletTypeIdentifier2.f10959a.ordinal()];
                        ICheckoutRepository iCheckoutRepository = this.c;
                        userProfileDetailsProvider = this.b;
                        if (i3 != 1) {
                            int i10 = i2;
                            String str10 = str4;
                            userProfileAppModelF = userProfileDetailsProvider.f();
                            if (userProfileAppModelF != null || (str6 = userProfileAppModelF.e) == null) {
                                chaloPaymentFailureReason3 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                                makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                                makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason3;
                                makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                                makeChaloWalletPaymentUseCase$invoke$1.label = 2;
                                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                                if (objB != coroutineSingletons) {
                                    makeChaloWalletPaymentUseCase2 = this;
                                    makeChaloWalletPaymentUseCase2.getClass();
                                    return a(chaloPaymentFailureReason3, (String) objB);
                                }
                            } else {
                                ChaloPayPaymentRequestAppModel chaloPayPaymentRequestAppModel = new ChaloPayPaymentRequestAppModel(walletAppModel2.getF11008a(), str10, str6, strR, i10);
                                makeChaloWalletPaymentUseCase$invoke$1.L$0 = str3;
                                makeChaloWalletPaymentUseCase$invoke$1.L$1 = walletAppModel2;
                                makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                                makeChaloWalletPaymentUseCase$invoke$1.I$0 = i4;
                                makeChaloWalletPaymentUseCase$invoke$1.label = 3;
                                Object objG = iCheckoutRepository.g(chaloPayPaymentRequestAppModel, makeChaloWalletPaymentUseCase$invoke$1);
                                if (objG == coroutineSingletons) {
                                    i4 = i10;
                                } else {
                                    i4 = i10;
                                    walletAppModel = walletAppModel2;
                                    objB = objG;
                                    str7 = str3;
                                    chaloPayPaymentResponseAppModel = (ChaloPayPaymentResponseAppModel) objB;
                                    if (chaloPayPaymentResponseAppModel == null) {
                                        chaloPaymentFailureReason5 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason5;
                                        makeChaloWalletPaymentUseCase$invoke$1.label = 4;
                                        objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                                        if (objB == coroutineSingletons) {
                                            makeChaloWalletPaymentUseCase4 = this;
                                            makeChaloWalletPaymentUseCase4.getClass();
                                            return a(chaloPaymentFailureReason5, (String) objB);
                                        }
                                    } else {
                                        ChaloPayPaymentResponseAppModel chaloPayPaymentResponseAppModel3 = chaloPayPaymentResponseAppModel;
                                        i5 = i4;
                                        chaloPayPaymentResponseAppModel2 = chaloPayPaymentResponseAppModel3;
                                        i6 = WhenMappings.b[chaloPayPaymentResponseAppModel2.c.ordinal()];
                                        if (i6 != 1) {
                                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = chaloPayPaymentResponseAppModel2;
                                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = null;
                                            makeChaloWalletPaymentUseCase$invoke$1.label = 8;
                                            if (d(walletAppModel, str7, i5, makeChaloWalletPaymentUseCase$invoke$1) == coroutineSingletons) {
                                            }
                                            return new ChaloUseCaseResult.Success(chaloPayPaymentResponseAppModel2);
                                        }
                                        if (i6 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        chaloPaymentFailureReason6 = ChaloPaymentFailureReason.INTERNAL_SERVER_ERROR;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason6;
                                        makeChaloWalletPaymentUseCase$invoke$1.label = 9;
                                        objB = stringProvider.b(StringEnum.FACING_SOME_TECHNICAL_ERROR, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                                        if (objB == coroutineSingletons) {
                                            makeChaloWalletPaymentUseCase5 = this;
                                            makeChaloWalletPaymentUseCase5.getClass();
                                            return a(chaloPaymentFailureReason6, (String) objB);
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i3 == 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            userProfileAppModelF2 = userProfileDetailsProvider.f();
                            if (userProfileAppModelF2 != null || (str8 = userProfileAppModelF2.i) == null) {
                                chaloPaymentFailureReason4 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                                makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                                makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason4;
                                makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                                makeChaloWalletPaymentUseCase$invoke$1.label = 5;
                                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                                if (objB != coroutineSingletons) {
                                    makeChaloWalletPaymentUseCase3 = this;
                                    makeChaloWalletPaymentUseCase3.getClass();
                                    return a(chaloPaymentFailureReason4, (String) objB);
                                }
                            } else {
                                CityAppModel cityAppModel2 = (CityAppModel) cityProvider.getE().getValue();
                                ClosedLoopWalletPaymentRequestAppModel closedLoopWalletPaymentRequestAppModel = new ClosedLoopWalletPaymentRequestAppModel(i2, walletAppModel2.getF11008a(), str4, str8, walletTypeIdentifier2.b, (cityAppModel2 == null || (str9 = cityAppModel2.f8854a) == null) ? "" : str9);
                                i4 = i2;
                                makeChaloWalletPaymentUseCase$invoke$1.L$0 = str3;
                                makeChaloWalletPaymentUseCase$invoke$1.L$1 = walletAppModel2;
                                makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                                makeChaloWalletPaymentUseCase$invoke$1.I$0 = i4;
                                makeChaloWalletPaymentUseCase$invoke$1.label = 6;
                                Object objE = iCheckoutRepository.e(closedLoopWalletPaymentRequestAppModel, makeChaloWalletPaymentUseCase$invoke$1);
                                if (objE != coroutineSingletons) {
                                    walletAppModel = walletAppModel2;
                                    objB = objE;
                                    str7 = str3;
                                    chaloPayPaymentResponseAppModel = (ChaloPayPaymentResponseAppModel) objB;
                                    if (chaloPayPaymentResponseAppModel == null) {
                                        chaloPaymentFailureReason7 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason7;
                                        makeChaloWalletPaymentUseCase$invoke$1.label = 7;
                                        objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                                        if (objB == coroutineSingletons) {
                                            makeChaloWalletPaymentUseCase6 = this;
                                            makeChaloWalletPaymentUseCase6.getClass();
                                            return a(chaloPaymentFailureReason7, (String) objB);
                                        }
                                    } else {
                                        ChaloPayPaymentResponseAppModel chaloPayPaymentResponseAppModel4 = chaloPayPaymentResponseAppModel;
                                        i5 = i4;
                                        chaloPayPaymentResponseAppModel2 = chaloPayPaymentResponseAppModel4;
                                        i6 = WhenMappings.b[chaloPayPaymentResponseAppModel2.c.ordinal()];
                                        if (i6 != 1) {
                                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = chaloPayPaymentResponseAppModel2;
                                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = null;
                                            makeChaloWalletPaymentUseCase$invoke$1.label = 8;
                                            if (d(walletAppModel, str7, i5, makeChaloWalletPaymentUseCase$invoke$1) == coroutineSingletons) {
                                            }
                                            return new ChaloUseCaseResult.Success(chaloPayPaymentResponseAppModel2);
                                        }
                                        if (i6 != 2 && i6 != 3 && i6 != 4) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        chaloPaymentFailureReason6 = ChaloPaymentFailureReason.INTERNAL_SERVER_ERROR;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason6;
                                        makeChaloWalletPaymentUseCase$invoke$1.label = 9;
                                        objB = stringProvider.b(StringEnum.FACING_SOME_TECHNICAL_ERROR, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                                        if (objB == coroutineSingletons) {
                                            makeChaloWalletPaymentUseCase5 = this;
                                            makeChaloWalletPaymentUseCase5.getClass();
                                            return a(chaloPaymentFailureReason6, (String) objB);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                case 1:
                    int i11 = makeChaloWalletPaymentUseCase$invoke$1.I$0;
                    WalletTypeIdentifier walletTypeIdentifier3 = (WalletTypeIdentifier) makeChaloWalletPaymentUseCase$invoke$1.L$2;
                    String str11 = (String) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    str3 = (String) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    i2 = i11;
                    walletTypeIdentifier2 = walletTypeIdentifier3;
                    str4 = str11;
                    chaloUseCaseResult = (ChaloUseCaseResult) objB;
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                            return ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    WalletAppModel walletAppModel3 = (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
                    cityAppModel = (CityAppModel) cityProvider.getE().getValue();
                    if (cityAppModel != null) {
                        str5 = "";
                    } else {
                        str5 = "";
                    }
                    String strR2 = StringsKt.R(str5, "+", "");
                    i3 = WhenMappings.f1382a[walletTypeIdentifier2.f10959a.ordinal()];
                    ICheckoutRepository iCheckoutRepository2 = this.c;
                    userProfileDetailsProvider = this.b;
                    if (i3 != 1) {
                        int i12 = i2;
                        String str12 = str4;
                        userProfileAppModelF = userProfileDetailsProvider.f();
                        if (userProfileAppModelF != null) {
                            chaloPaymentFailureReason3 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason3;
                            makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                            makeChaloWalletPaymentUseCase$invoke$1.label = 2;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                            if (objB != coroutineSingletons) {
                                makeChaloWalletPaymentUseCase2 = this;
                                makeChaloWalletPaymentUseCase2.getClass();
                                return a(chaloPaymentFailureReason3, (String) objB);
                            }
                        } else {
                            chaloPaymentFailureReason3 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason3;
                            makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                            makeChaloWalletPaymentUseCase$invoke$1.label = 2;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                            if (objB != coroutineSingletons) {
                                makeChaloWalletPaymentUseCase2 = this;
                                makeChaloWalletPaymentUseCase2.getClass();
                                return a(chaloPaymentFailureReason3, (String) objB);
                            }
                        }
                    } else {
                        if (i3 == 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        userProfileAppModelF2 = userProfileDetailsProvider.f();
                        if (userProfileAppModelF2 != null) {
                            chaloPaymentFailureReason4 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason4;
                            makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                            makeChaloWalletPaymentUseCase$invoke$1.label = 5;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                            if (objB != coroutineSingletons) {
                                makeChaloWalletPaymentUseCase3 = this;
                                makeChaloWalletPaymentUseCase3.getClass();
                                return a(chaloPaymentFailureReason4, (String) objB);
                            }
                        } else {
                            chaloPaymentFailureReason4 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason4;
                            makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                            makeChaloWalletPaymentUseCase$invoke$1.label = 5;
                            objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                            if (objB != coroutineSingletons) {
                                makeChaloWalletPaymentUseCase3 = this;
                                makeChaloWalletPaymentUseCase3.getClass();
                                return a(chaloPaymentFailureReason4, (String) objB);
                            }
                        }
                    }
                    return coroutineSingletons;
                case 2:
                    chaloPaymentFailureReason3 = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    makeChaloWalletPaymentUseCase2 = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    makeChaloWalletPaymentUseCase2.getClass();
                    return a(chaloPaymentFailureReason3, (String) objB);
                case 3:
                    i4 = makeChaloWalletPaymentUseCase$invoke$1.I$0;
                    walletAppModel = (WalletAppModel) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    str7 = (String) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    chaloPayPaymentResponseAppModel = (ChaloPayPaymentResponseAppModel) objB;
                    if (chaloPayPaymentResponseAppModel == null) {
                        chaloPaymentFailureReason5 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason5;
                        makeChaloWalletPaymentUseCase$invoke$1.label = 4;
                        objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                        if (objB == coroutineSingletons) {
                            makeChaloWalletPaymentUseCase4 = this;
                            makeChaloWalletPaymentUseCase4.getClass();
                            return a(chaloPaymentFailureReason5, (String) objB);
                        }
                    } else {
                        ChaloPayPaymentResponseAppModel chaloPayPaymentResponseAppModel5 = chaloPayPaymentResponseAppModel;
                        i5 = i4;
                        chaloPayPaymentResponseAppModel2 = chaloPayPaymentResponseAppModel5;
                        i6 = WhenMappings.b[chaloPayPaymentResponseAppModel2.c.ordinal()];
                        if (i6 != 1) {
                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = chaloPayPaymentResponseAppModel2;
                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = null;
                            makeChaloWalletPaymentUseCase$invoke$1.label = 8;
                            if (d(walletAppModel, str7, i5, makeChaloWalletPaymentUseCase$invoke$1) == coroutineSingletons) {
                            }
                            return new ChaloUseCaseResult.Success(chaloPayPaymentResponseAppModel2);
                        }
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        chaloPaymentFailureReason6 = ChaloPaymentFailureReason.INTERNAL_SERVER_ERROR;
                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason6;
                        makeChaloWalletPaymentUseCase$invoke$1.label = 9;
                        objB = stringProvider.b(StringEnum.FACING_SOME_TECHNICAL_ERROR, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                        if (objB == coroutineSingletons) {
                            makeChaloWalletPaymentUseCase5 = this;
                            makeChaloWalletPaymentUseCase5.getClass();
                            return a(chaloPaymentFailureReason6, (String) objB);
                        }
                    }
                    return coroutineSingletons;
                case 4:
                    chaloPaymentFailureReason5 = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    makeChaloWalletPaymentUseCase4 = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    makeChaloWalletPaymentUseCase4.getClass();
                    return a(chaloPaymentFailureReason5, (String) objB);
                case 5:
                    chaloPaymentFailureReason4 = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    makeChaloWalletPaymentUseCase3 = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    makeChaloWalletPaymentUseCase3.getClass();
                    return a(chaloPaymentFailureReason4, (String) objB);
                case 6:
                    i4 = makeChaloWalletPaymentUseCase$invoke$1.I$0;
                    walletAppModel = (WalletAppModel) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    str7 = (String) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    chaloPayPaymentResponseAppModel = (ChaloPayPaymentResponseAppModel) objB;
                    if (chaloPayPaymentResponseAppModel == null) {
                        chaloPaymentFailureReason7 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason7;
                        makeChaloWalletPaymentUseCase$invoke$1.label = 7;
                        objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                        if (objB == coroutineSingletons) {
                            makeChaloWalletPaymentUseCase6 = this;
                            makeChaloWalletPaymentUseCase6.getClass();
                            return a(chaloPaymentFailureReason7, (String) objB);
                        }
                    } else {
                        ChaloPayPaymentResponseAppModel chaloPayPaymentResponseAppModel6 = chaloPayPaymentResponseAppModel;
                        i5 = i4;
                        chaloPayPaymentResponseAppModel2 = chaloPayPaymentResponseAppModel6;
                        i6 = WhenMappings.b[chaloPayPaymentResponseAppModel2.c.ordinal()];
                        if (i6 != 1) {
                            makeChaloWalletPaymentUseCase$invoke$1.L$0 = chaloPayPaymentResponseAppModel2;
                            makeChaloWalletPaymentUseCase$invoke$1.L$1 = null;
                            makeChaloWalletPaymentUseCase$invoke$1.label = 8;
                            if (d(walletAppModel, str7, i5, makeChaloWalletPaymentUseCase$invoke$1) == coroutineSingletons) {
                            }
                            return new ChaloUseCaseResult.Success(chaloPayPaymentResponseAppModel2);
                        }
                        if (i6 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        chaloPaymentFailureReason6 = ChaloPaymentFailureReason.INTERNAL_SERVER_ERROR;
                        makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                        makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason6;
                        makeChaloWalletPaymentUseCase$invoke$1.label = 9;
                        objB = stringProvider.b(StringEnum.FACING_SOME_TECHNICAL_ERROR, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                        if (objB == coroutineSingletons) {
                            makeChaloWalletPaymentUseCase5 = this;
                            makeChaloWalletPaymentUseCase5.getClass();
                            return a(chaloPaymentFailureReason6, (String) objB);
                        }
                    }
                    return coroutineSingletons;
                case 7:
                    chaloPaymentFailureReason7 = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    makeChaloWalletPaymentUseCase6 = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    makeChaloWalletPaymentUseCase6.getClass();
                    return a(chaloPaymentFailureReason7, (String) objB);
                case 8:
                    chaloPayPaymentResponseAppModel2 = (ChaloPayPaymentResponseAppModel) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    return new ChaloUseCaseResult.Success(chaloPayPaymentResponseAppModel2);
                case 9:
                    chaloPaymentFailureReason6 = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    makeChaloWalletPaymentUseCase5 = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    makeChaloWalletPaymentUseCase5.getClass();
                    return a(chaloPaymentFailureReason6, (String) objB);
                case 10:
                    chaloPaymentFailureReason = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$invoke$1.L$1;
                    makeChaloWalletPaymentUseCase = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$invoke$1.L$0;
                    ResultKt.b(objB);
                    makeChaloWalletPaymentUseCase.getClass();
                    return a(chaloPaymentFailureReason, (String) objB);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Exception e) {
            if (!(e instanceof ChaloPayPaymentFailedException)) {
                if (e instanceof DataFetchOperationException) {
                    return new ChaloUseCaseResult.Failure(UseCaseOperationErrorKt.a((DataFetchOperationException) e));
                }
                chaloPaymentFailureReason = ChaloPaymentFailureReason.UNKNOWN_ERROR;
                makeChaloWalletPaymentUseCase$invoke$1.L$0 = this;
                makeChaloWalletPaymentUseCase$invoke$1.L$1 = chaloPaymentFailureReason;
                makeChaloWalletPaymentUseCase$invoke$1.L$2 = null;
                makeChaloWalletPaymentUseCase$invoke$1.label = 10;
                objB = stringProvider.b(StringEnum.SOMETHING_WENT_WRONG, new Object[0], makeChaloWalletPaymentUseCase$invoke$1);
                if (objB != coroutineSingletons) {
                    makeChaloWalletPaymentUseCase = this;
                }
                return coroutineSingletons;
            }
            ChaloPayPaymentFailedException chaloPayPaymentFailedException = (ChaloPayPaymentFailedException) e;
            GenericChaloErrorResponse genericChaloErrorResponse = chaloPayPaymentFailedException.getGenericChaloErrorResponse();
            int errorCode = genericChaloErrorResponse != null ? genericChaloErrorResponse.f6497a : ChaloPaymentFailureReason.UNKNOWN_ERROR.getErrorCode();
            ChaloPaymentFailureReason[] chaloPaymentFailureReasonArrValues = ChaloPaymentFailureReason.values();
            int length = chaloPaymentFailureReasonArrValues.length;
            while (true) {
                if (i9 >= length) {
                    chaloPaymentFailureReason2 = null;
                    break;
                }
                chaloPaymentFailureReason2 = chaloPaymentFailureReasonArrValues[i9];
                if (chaloPaymentFailureReason2.getErrorCode() == errorCode) {
                    break;
                }
                i9++;
            }
            if (chaloPaymentFailureReason2 == null) {
                chaloPaymentFailureReason2 = ChaloPaymentFailureReason.UNKNOWN_ERROR;
            }
            GenericChaloErrorResponse genericChaloErrorResponse2 = chaloPayPaymentFailedException.getGenericChaloErrorResponse();
            return a(chaloPaymentFailureReason2, genericChaloErrorResponse2 != null ? genericChaloErrorResponse2.b : null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        MakeChaloWalletPaymentUseCase$resolveWallet$1 makeChaloWalletPaymentUseCase$resolveWallet$1;
        ChaloPaymentFailureReason chaloPaymentFailureReason;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase;
        ChaloPaymentFailureReason chaloPaymentFailureReason2;
        MakeChaloWalletPaymentUseCase makeChaloWalletPaymentUseCase2;
        ChaloUseCaseResult.Failure failureA;
        if (continuationImpl instanceof MakeChaloWalletPaymentUseCase$resolveWallet$1) {
            makeChaloWalletPaymentUseCase$resolveWallet$1 = (MakeChaloWalletPaymentUseCase$resolveWallet$1) continuationImpl;
            int i = makeChaloWalletPaymentUseCase$resolveWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                makeChaloWalletPaymentUseCase$resolveWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                makeChaloWalletPaymentUseCase$resolveWallet$1 = new MakeChaloWalletPaymentUseCase$resolveWallet$1(this, continuationImpl);
            }
        } else {
            makeChaloWalletPaymentUseCase$resolveWallet$1 = new MakeChaloWalletPaymentUseCase$resolveWallet$1(this, continuationImpl);
        }
        Object objE = makeChaloWalletPaymentUseCase$resolveWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = makeChaloWalletPaymentUseCase$resolveWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            makeChaloWalletPaymentUseCase$resolveWallet$1.label = 1;
            objE = this.h.e(walletTypeIdentifier, makeChaloWalletPaymentUseCase$resolveWallet$1);
            if (objE != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                chaloPaymentFailureReason = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$resolveWallet$1.L$1;
                makeChaloWalletPaymentUseCase = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$resolveWallet$1.L$0;
                ResultKt.b(objE);
                makeChaloWalletPaymentUseCase.getClass();
                failureA = a(chaloPaymentFailureReason, (String) objE);
                return new ChaloUseCaseResult.Failure(failureA);
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chaloPaymentFailureReason2 = (ChaloPaymentFailureReason) makeChaloWalletPaymentUseCase$resolveWallet$1.L$1;
            makeChaloWalletPaymentUseCase2 = (MakeChaloWalletPaymentUseCase) makeChaloWalletPaymentUseCase$resolveWallet$1.L$0;
            ResultKt.b(objE);
            makeChaloWalletPaymentUseCase2.getClass();
            failureA = a(chaloPaymentFailureReason2, (String) objE);
            return new ChaloUseCaseResult.Failure(failureA);
        }
        ResultKt.b(objE);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objE;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.c[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        StringProvider stringProvider = this.e;
        if (i3 == 1) {
            chaloPaymentFailureReason = ChaloPaymentFailureReason.CACHED_WALLET_FETCH_FAILED;
            makeChaloWalletPaymentUseCase$resolveWallet$1.L$0 = this;
            makeChaloWalletPaymentUseCase$resolveWallet$1.L$1 = chaloPaymentFailureReason;
            makeChaloWalletPaymentUseCase$resolveWallet$1.label = 2;
            objE = stringProvider.b(StringEnum.CACHED_WALLET_FETCH_FAILED, new Object[0], makeChaloWalletPaymentUseCase$resolveWallet$1);
            if (objE != coroutineSingletons) {
                makeChaloWalletPaymentUseCase = this;
                makeChaloWalletPaymentUseCase.getClass();
                failureA = a(chaloPaymentFailureReason, (String) objE);
                return new ChaloUseCaseResult.Failure(failureA);
            }
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            chaloPaymentFailureReason2 = ChaloPaymentFailureReason.UNAUTHORIZED;
            makeChaloWalletPaymentUseCase$resolveWallet$1.L$0 = this;
            makeChaloWalletPaymentUseCase$resolveWallet$1.L$1 = chaloPaymentFailureReason2;
            makeChaloWalletPaymentUseCase$resolveWallet$1.label = 3;
            objE = stringProvider.b(StringEnum.USER_NOT_LOGGED_IN, new Object[0], makeChaloWalletPaymentUseCase$resolveWallet$1);
            if (objE != coroutineSingletons) {
                makeChaloWalletPaymentUseCase2 = this;
                makeChaloWalletPaymentUseCase2.getClass();
                failureA = a(chaloPaymentFailureReason2, (String) objE);
                return new ChaloUseCaseResult.Failure(failureA);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ed, code lost:
    
        if (r26.g.b(r1, r3, false) == r4) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel r27, java.lang.String r28, int r29, kotlin.coroutines.jvm.internal.ContinuationImpl r30) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.checkout.domain.MakeChaloWalletPaymentUseCase.d(app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel, java.lang.String, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

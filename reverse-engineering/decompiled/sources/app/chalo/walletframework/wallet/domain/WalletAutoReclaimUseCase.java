package app.chalo.walletframework.wallet.domain;

import app.chalo.Device;
import app.chalo.network.exception.ChaloLocalException;
import app.chalo.network.exception.NetworkSuccessResponseParseException;
import app.chalo.network.model.GenericChaloErrorResponse;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.exceptions.WalletAutoReclaimException;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletAutoReclaimUseCase;", "", "Companion", "WalletAutoReclaimFailureReason", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletAutoReclaimUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11074a;
    public final UserProfileDetailsProvider b;
    public final Device c;
    public final WalletResolver d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletAutoReclaimUseCase$Companion;", "", "", "AUTO_RECLAIM_REQUEST_EXCEEDED_ERROR_CODE", "I", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/WalletAutoReclaimUseCase$WalletAutoReclaimFailureReason;", "", "<init>", "(Ljava/lang/String;I)V", "USER_NOT_LOGGED_IN", "SERVER_ERROR", "LOCAL_ERROR", "PARSE_ERROR", "AUTO_RECLAIM_REQUEST_EXCEEDED", "WALLET_NOT_CACHED", "USER_ID_MISMATCH", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum WalletAutoReclaimFailureReason {
        USER_NOT_LOGGED_IN,
        SERVER_ERROR,
        LOCAL_ERROR,
        PARSE_ERROR,
        AUTO_RECLAIM_REQUEST_EXCEEDED,
        WALLET_NOT_CACHED,
        USER_ID_MISMATCH;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.a(values());

        public static EnumEntries<WalletAutoReclaimFailureReason> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11075a;
        public static final /* synthetic */ int[] b;

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
            f11075a = iArr;
            int[] iArr2 = new int[WalletResolverError.values().length];
            try {
                iArr2[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
        }
    }

    public WalletAutoReclaimUseCase(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, Device device, WalletResolver walletResolver) {
        this.f11074a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = device;
        this.d = walletResolver;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        WalletAutoReclaimUseCase$invoke$1 walletAutoReclaimUseCase$invoke$1;
        if (continuationImpl instanceof WalletAutoReclaimUseCase$invoke$1) {
            walletAutoReclaimUseCase$invoke$1 = (WalletAutoReclaimUseCase$invoke$1) continuationImpl;
            int i = walletAutoReclaimUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAutoReclaimUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAutoReclaimUseCase$invoke$1 = new WalletAutoReclaimUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            walletAutoReclaimUseCase$invoke$1 = new WalletAutoReclaimUseCase$invoke$1(this, continuationImpl);
        }
        Object objC = walletAutoReclaimUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletAutoReclaimUseCase$invoke$1.label;
        try {
            if (i2 == 0) {
                ResultKt.b(objC);
                String strM = this.b.m();
                if (strM == null) {
                    return new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.USER_NOT_LOGGED_IN);
                }
                walletAutoReclaimUseCase$invoke$1.label = 1;
                objC = c(strM, walletTypeIdentifier, walletAutoReclaimUseCase$invoke$1);
                if (objC == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objC);
            }
            ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objC;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                return chaloUseCaseResult;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                return ((Boolean) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).booleanValue() ? new ChaloUseCaseResult.Success(Boolean.TRUE) : new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.SERVER_ERROR);
            }
            throw new NoWhenBranchMatchedException();
        } catch (ChaloLocalException e) {
            if (e instanceof ChaloLocalException.ServerErrorException) {
                GenericChaloErrorResponse genericChaloErrorResponse = ((ChaloLocalException.ServerErrorException) e).getGenericChaloErrorResponse();
                return (genericChaloErrorResponse == null || genericChaloErrorResponse.f6497a != 2021) ? new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.LOCAL_ERROR) : new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.AUTO_RECLAIM_REQUEST_EXCEEDED);
            }
            if ((e instanceof ChaloLocalException.NoInternetException) || (e instanceof ChaloLocalException.NoUpdateInFetchedDataBasedOnEtagVersion) || (e instanceof ChaloLocalException.RequestCancelledException) || (e instanceof ChaloLocalException.SecureCallUnauthorizedAndRefreshTokenServerUnreachableException) || (e instanceof ChaloLocalException.UnexpectedException)) {
                return new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.LOCAL_ERROR);
            }
            throw new NoWhenBranchMatchedException();
        } catch (NetworkSuccessResponseParseException unused) {
            return new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.PARSE_ERROR);
        } catch (WalletAutoReclaimException e2) {
            GenericChaloErrorResponse errorResponse = e2.getErrorResponse();
            return (errorResponse == null || errorResponse.f6497a != 2021) ? new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.SERVER_ERROR) : new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.AUTO_RECLAIM_REQUEST_EXCEEDED);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        WalletAutoReclaimUseCase$resolveWallet$1 walletAutoReclaimUseCase$resolveWallet$1;
        if (continuationImpl instanceof WalletAutoReclaimUseCase$resolveWallet$1) {
            walletAutoReclaimUseCase$resolveWallet$1 = (WalletAutoReclaimUseCase$resolveWallet$1) continuationImpl;
            int i = walletAutoReclaimUseCase$resolveWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletAutoReclaimUseCase$resolveWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletAutoReclaimUseCase$resolveWallet$1 = new WalletAutoReclaimUseCase$resolveWallet$1(this, continuationImpl);
            }
        } else {
            walletAutoReclaimUseCase$resolveWallet$1 = new WalletAutoReclaimUseCase$resolveWallet$1(this, continuationImpl);
        }
        Object objE = walletAutoReclaimUseCase$resolveWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletAutoReclaimUseCase$resolveWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            walletAutoReclaimUseCase$resolveWallet$1.label = 1;
            objE = this.d.e(walletTypeIdentifier, walletAutoReclaimUseCase$resolveWallet$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objE;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ChaloUseCaseResult.Success(((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        int i3 = WhenMappings.b[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        if (i3 == 1) {
            return new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.WALLET_NOT_CACHED);
        }
        if (i3 == 2) {
            return new ChaloUseCaseResult.Failure(WalletAutoReclaimFailureReason.USER_NOT_LOGGED_IN);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x0087  */
    /* JADX WARN: Code duplicated, block: B:34:0x008f  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a9, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
    
        if (r11 == r1) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r9, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.walletframework.wallet.domain.WalletAutoReclaimUseCase.c(java.lang.String, app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}

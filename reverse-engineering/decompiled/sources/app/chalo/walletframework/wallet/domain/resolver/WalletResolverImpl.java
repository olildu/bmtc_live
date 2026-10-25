package app.chalo.walletframework.wallet.domain.resolver;

import app.chalo.data.ClosedLoopWalletSetupConfig;
import app.chalo.data.WalletEnableConfig;
import app.chalo.data.WalletSetupConfiguration;
import app.chalo.domain.GetWalletSetupConfigurationUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.data.repository.WalletRepository;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolverImpl;", "Lapp/chalo/walletframework/wallet/domain/resolver/WalletResolver;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WalletResolverImpl implements WalletResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletRepository f11099a;
    public final UserProfileDetailsProvider b;
    public final GetWalletSetupConfigurationUseCase c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11100a;

        static {
            int[] iArr = new int[WalletResolverError.values().length];
            try {
                iArr[WalletResolverError.NOT_LOGGED_IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WalletResolverError.WALLET_NOT_CACHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11100a = iArr;
        }
    }

    public WalletResolverImpl(WalletRepository walletRepository, UserProfileDetailsProvider userProfileDetailsProvider, GetWalletSetupConfigurationUseCase getWalletSetupConfigurationUseCase) {
        this.f11099a = walletRepository;
        this.b = userProfileDetailsProvider;
        this.c = getWalletSetupConfigurationUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x008a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.domain.resolver.WalletResolver
    public final Object a(ContinuationImpl continuationImpl) {
        WalletResolverImpl$resolvePrimaryWalletForCurrentCity$1 walletResolverImpl$resolvePrimaryWalletForCurrentCity$1;
        WalletTypeIdentifier walletTypeIdentifier;
        ChaloUseCaseResult chaloUseCaseResult;
        int i;
        if (continuationImpl instanceof WalletResolverImpl$resolvePrimaryWalletForCurrentCity$1) {
            walletResolverImpl$resolvePrimaryWalletForCurrentCity$1 = (WalletResolverImpl$resolvePrimaryWalletForCurrentCity$1) continuationImpl;
            int i2 = walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.label = i2 - Integer.MIN_VALUE;
            } else {
                walletResolverImpl$resolvePrimaryWalletForCurrentCity$1 = new WalletResolverImpl$resolvePrimaryWalletForCurrentCity$1(this, continuationImpl);
            }
        } else {
            walletResolverImpl$resolvePrimaryWalletForCurrentCity$1 = new WalletResolverImpl$resolvePrimaryWalletForCurrentCity$1(this, continuationImpl);
        }
        Object objB = walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            if (this.b.m() != null) {
                walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.label = 1;
                objB = b(walletResolverImpl$resolvePrimaryWalletForCurrentCity$1);
                if (objB != obj) {
                }
                return obj;
            }
            return ResolvedPrimaryWalletResult.NotLoggedIn.f11097a;
        }
        if (i3 == 1) {
            ResultKt.b(objB);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            walletTypeIdentifier = (WalletTypeIdentifier) walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.L$0;
            ResultKt.b(objB);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) objB;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            return new ResolvedPrimaryWalletResult.ResolvedWallet(walletTypeIdentifier, (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
        }
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
            throw new NoWhenBranchMatchedException();
        }
        i = WhenMappings.f11100a[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new ResolvedPrimaryWalletResult.ResolvedWallet(walletTypeIdentifier, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        return ResolvedPrimaryWalletResult.NotLoggedIn.f11097a;
        WalletTypeIdentifier walletTypeIdentifier2 = (WalletTypeIdentifier) objB;
        if (walletTypeIdentifier2 == null) {
            return ResolvedPrimaryWalletResult.NoWalletConfigEnabled.f11096a;
        }
        walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.L$0 = walletTypeIdentifier2;
        walletResolverImpl$resolvePrimaryWalletForCurrentCity$1.label = 2;
        Object objE = e(walletTypeIdentifier2, walletResolverImpl$resolvePrimaryWalletForCurrentCity$1);
        if (objE != obj) {
            walletTypeIdentifier = walletTypeIdentifier2;
            objB = objE;
            chaloUseCaseResult = (ChaloUseCaseResult) objB;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                return new ResolvedPrimaryWalletResult.ResolvedWallet(walletTypeIdentifier, (WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                throw new NoWhenBranchMatchedException();
            }
            i = WhenMappings.f11100a[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return new ResolvedPrimaryWalletResult.ResolvedWallet(walletTypeIdentifier, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return ResolvedPrimaryWalletResult.NotLoggedIn.f11097a;
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.domain.resolver.WalletResolver
    public final Object b(Continuation continuation) {
        WalletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1 walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1;
        Object next;
        if (continuation instanceof WalletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1) {
            walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1 = (WalletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1) continuation;
            int i = walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1.label = i - Integer.MIN_VALUE;
            } else {
                walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1 = new WalletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1(this, continuation);
            }
        } else {
            walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1 = new WalletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1(this, continuation);
        }
        Object objB = walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1.label;
        if (i2 == 0) {
            ResultKt.b(objB);
            walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1.label = 1;
            objB = this.c.b(walletResolverImpl$resolvePrimaryWalletIdentifierForCurrentCity$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objB);
        }
        WalletEnableConfig walletEnableConfig = ((WalletSetupConfiguration) objB).f2412a;
        if (walletEnableConfig.f2410a && walletEnableConfig.b) {
            return WalletTypeIdentifier.Companion.c();
        }
        Iterator it = walletEnableConfig.c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ClosedLoopWalletSetupConfig) next).b);
        ClosedLoopWalletSetupConfig closedLoopWalletSetupConfig = (ClosedLoopWalletSetupConfig) next;
        if (closedLoopWalletSetupConfig != null) {
            return WalletTypeIdentifier.Companion.a(closedLoopWalletSetupConfig.f2344a);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.domain.resolver.WalletResolver
    public final Object c(ContinuationImpl continuationImpl) {
        WalletResolverImpl$getAllCachedWallets$1 walletResolverImpl$getAllCachedWallets$1;
        if (continuationImpl instanceof WalletResolverImpl$getAllCachedWallets$1) {
            walletResolverImpl$getAllCachedWallets$1 = (WalletResolverImpl$getAllCachedWallets$1) continuationImpl;
            int i = walletResolverImpl$getAllCachedWallets$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletResolverImpl$getAllCachedWallets$1.label = i - Integer.MIN_VALUE;
            } else {
                walletResolverImpl$getAllCachedWallets$1 = new WalletResolverImpl$getAllCachedWallets$1(this, continuationImpl);
            }
        } else {
            walletResolverImpl$getAllCachedWallets$1 = new WalletResolverImpl$getAllCachedWallets$1(this, continuationImpl);
        }
        Object objF = walletResolverImpl$getAllCachedWallets$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletResolverImpl$getAllCachedWallets$1.label;
        if (i2 == 0) {
            ResultKt.b(objF);
            String strM = this.b.m();
            if (strM == null) {
                return new ChaloUseCaseResult.Failure(WalletResolverError.NOT_LOGGED_IN);
            }
            walletResolverImpl$getAllCachedWallets$1.label = 1;
            objF = this.f11099a.F(strM, walletResolverImpl$getAllCachedWallets$1);
            if (objF == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objF);
        }
        return new ChaloUseCaseResult.Success(objF);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.domain.resolver.WalletResolver
    public final Object d(String str, ContinuationImpl continuationImpl) {
        WalletResolverImpl$getCachedWallet$1 walletResolverImpl$getCachedWallet$1;
        if (continuationImpl instanceof WalletResolverImpl$getCachedWallet$1) {
            walletResolverImpl$getCachedWallet$1 = (WalletResolverImpl$getCachedWallet$1) continuationImpl;
            int i = walletResolverImpl$getCachedWallet$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletResolverImpl$getCachedWallet$1.label = i - Integer.MIN_VALUE;
            } else {
                walletResolverImpl$getCachedWallet$1 = new WalletResolverImpl$getCachedWallet$1(this, continuationImpl);
            }
        } else {
            walletResolverImpl$getCachedWallet$1 = new WalletResolverImpl$getCachedWallet$1(this, continuationImpl);
        }
        Object objJ = walletResolverImpl$getCachedWallet$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletResolverImpl$getCachedWallet$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            String strM = this.b.m();
            if (strM == null) {
                return new ChaloUseCaseResult.Failure(WalletResolverError.NOT_LOGGED_IN);
            }
            walletResolverImpl$getCachedWallet$1.label = 1;
            objJ = this.f11099a.J(strM, str, walletResolverImpl$getCachedWallet$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        WalletAppModel walletAppModel = (WalletAppModel) objJ;
        return walletAppModel == null ? new ChaloUseCaseResult.Failure(WalletResolverError.WALLET_NOT_CACHED) : new ChaloUseCaseResult.Success(walletAppModel);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.walletframework.wallet.domain.resolver.WalletResolver
    public final Object e(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        WalletResolverImpl$getWalletForType$1 walletResolverImpl$getWalletForType$1;
        if (continuationImpl instanceof WalletResolverImpl$getWalletForType$1) {
            walletResolverImpl$getWalletForType$1 = (WalletResolverImpl$getWalletForType$1) continuationImpl;
            int i = walletResolverImpl$getWalletForType$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                walletResolverImpl$getWalletForType$1.label = i - Integer.MIN_VALUE;
            } else {
                walletResolverImpl$getWalletForType$1 = new WalletResolverImpl$getWalletForType$1(this, continuationImpl);
            }
        } else {
            walletResolverImpl$getWalletForType$1 = new WalletResolverImpl$getWalletForType$1(this, continuationImpl);
        }
        Object objX = walletResolverImpl$getWalletForType$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = walletResolverImpl$getWalletForType$1.label;
        if (i2 == 0) {
            ResultKt.b(objX);
            String strM = this.b.m();
            if (strM == null) {
                return new ChaloUseCaseResult.Failure(WalletResolverError.NOT_LOGGED_IN);
            }
            walletResolverImpl$getWalletForType$1.label = 1;
            objX = this.f11099a.x(strM, walletTypeIdentifier, walletResolverImpl$getWalletForType$1);
            if (objX == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objX);
        }
        WalletAppModel walletAppModel = (WalletAppModel) objX;
        return walletAppModel == null ? new ChaloUseCaseResult.Failure(WalletResolverError.WALLET_NOT_CACHED) : new ChaloUseCaseResult.Success(walletAppModel);
    }
}

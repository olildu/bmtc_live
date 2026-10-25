package app.chalo.walletframework.wallet.domain;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.quickpay.data.model.appmodel.QuickPayAppModel;
import app.chalo.walletframework.wallet.data.model.WalletType;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import app.chalo.walletframework.wallet.data.model.appmodel.WalletAppModel;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolver;
import app.chalo.walletframework.wallet.domain.resolver.WalletResolverError;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/ResolveQuickPayProductNameUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ResolveQuickPayProductNameUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WalletResolver f11071a;
    public final StringProvider b;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11072a;
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
            f11072a = iArr;
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

    public ResolveQuickPayProductNameUseCase(WalletResolver walletResolver, StringProvider stringProvider) {
        this.f11071a = walletResolver;
        this.b = stringProvider;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(QuickPayAppModel quickPayAppModel, ContinuationImpl continuationImpl) {
        ResolveQuickPayProductNameUseCase$invoke$2 resolveQuickPayProductNameUseCase$invoke$2;
        if (continuationImpl instanceof ResolveQuickPayProductNameUseCase$invoke$2) {
            resolveQuickPayProductNameUseCase$invoke$2 = (ResolveQuickPayProductNameUseCase$invoke$2) continuationImpl;
            int i = resolveQuickPayProductNameUseCase$invoke$2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                resolveQuickPayProductNameUseCase$invoke$2.label = i - Integer.MIN_VALUE;
            } else {
                resolveQuickPayProductNameUseCase$invoke$2 = new ResolveQuickPayProductNameUseCase$invoke$2(this, continuationImpl);
            }
        } else {
            resolveQuickPayProductNameUseCase$invoke$2 = new ResolveQuickPayProductNameUseCase$invoke$2(this, continuationImpl);
        }
        Object objD = resolveQuickPayProductNameUseCase$invoke$2.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = resolveQuickPayProductNameUseCase$invoke$2.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            String str = quickPayAppModel.k;
            resolveQuickPayProductNameUseCase$invoke$2.label = 1;
            objD = this.f11071a.d(str, resolveQuickPayProductNameUseCase$invoke$2);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objD);
                return objD;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return objD;
        }
        ResultKt.b(objD);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objD;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            WalletTypeIdentifier walletTypeIdentifierB = WalletTypeIdentifier.Companion.b((WalletAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a);
            resolveQuickPayProductNameUseCase$invoke$2.label = 2;
            Object objB = b(walletTypeIdentifierB, resolveQuickPayProductNameUseCase$invoke$2);
            if (objB != obj) {
                return objB;
            }
        } else {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            int i3 = WhenMappings.b[((WalletResolverError) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a).ordinal()];
            if (i3 != 1 && i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            resolveQuickPayProductNameUseCase$invoke$2.label = 3;
            Object objB2 = this.b.b(StringEnum.CHALO_PAY, new Object[0], resolveQuickPayProductNameUseCase$invoke$2);
            if (objB2 != obj) {
                return objB2;
            }
        }
        return obj;
    }

    public final Object b(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        int i = WhenMappings.f11072a[walletTypeIdentifier.f10959a.ordinal()];
        if (i != 1 && i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return this.b.b(StringEnum.CHALO_PAY, new Object[0], continuationImpl);
    }
}

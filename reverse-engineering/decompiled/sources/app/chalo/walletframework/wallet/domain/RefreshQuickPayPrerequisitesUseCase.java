package app.chalo.walletframework.wallet.domain;

import app.chalo.constants.Source;
import app.chalo.features.chalotime.domain.ChaloTimeRefreshManagerUseCase;
import app.chalo.features.encryption.EncryptionFeature;
import app.chalo.usecase.GetChaloTimeUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import app.chalo.walletframework.wallet.data.model.WalletTypeIdentifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/walletframework/wallet/domain/RefreshQuickPayPrerequisitesUseCase;", "", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RefreshQuickPayPrerequisitesUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EncryptionFeature f11065a;
    public final GetChaloTimeUseCase b;
    public final ChaloTimeRefreshManagerUseCase c;

    public RefreshQuickPayPrerequisitesUseCase(EncryptionFeature encryptionFeature, GetChaloTimeUseCase getChaloTimeUseCase, ChaloTimeRefreshManagerUseCase chaloTimeRefreshManagerUseCase) {
        this.f11065a = encryptionFeature;
        this.b = getChaloTimeUseCase;
        this.c = chaloTimeRefreshManagerUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0090  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(WalletTypeIdentifier walletTypeIdentifier, ContinuationImpl continuationImpl) {
        RefreshQuickPayPrerequisitesUseCase$invoke$1 refreshQuickPayPrerequisitesUseCase$invoke$1;
        String sourceName;
        if (continuationImpl instanceof RefreshQuickPayPrerequisitesUseCase$invoke$1) {
            refreshQuickPayPrerequisitesUseCase$invoke$1 = (RefreshQuickPayPrerequisitesUseCase$invoke$1) continuationImpl;
            int i = refreshQuickPayPrerequisitesUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                refreshQuickPayPrerequisitesUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                refreshQuickPayPrerequisitesUseCase$invoke$1 = new RefreshQuickPayPrerequisitesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            refreshQuickPayPrerequisitesUseCase$invoke$1 = new RefreshQuickPayPrerequisitesUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = refreshQuickPayPrerequisitesUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = refreshQuickPayPrerequisitesUseCase$invoke$1.label;
        Unit unit = Unit.f17538a;
        EncryptionFeature encryptionFeature = this.f11065a;
        GetChaloTimeUseCase getChaloTimeUseCase = this.b;
        if (i2 == 0) {
            ResultKt.b(objA);
            refreshQuickPayPrerequisitesUseCase$invoke$1.L$0 = walletTypeIdentifier;
            refreshQuickPayPrerequisitesUseCase$invoke$1.label = 1;
            objA = getChaloTimeUseCase.a(refreshQuickPayPrerequisitesUseCase$invoke$1);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            walletTypeIdentifier = (WalletTypeIdentifier) refreshQuickPayPrerequisitesUseCase$invoke$1.L$0;
            ResultKt.b(objA);
        } else {
            if (i2 == 2) {
                walletTypeIdentifier = (WalletTypeIdentifier) refreshQuickPayPrerequisitesUseCase$invoke$1.L$0;
                ResultKt.b(objA);
                if (objA instanceof ChaloUseCaseResult.Success) {
                    String str = walletTypeIdentifier.b;
                    refreshQuickPayPrerequisitesUseCase$invoke$1.L$0 = null;
                    refreshQuickPayPrerequisitesUseCase$invoke$1.label = 3;
                    objA = encryptionFeature.b(str, refreshQuickPayPrerequisitesUseCase$invoke$1);
                    if (objA != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                return unit;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(objA);
                return unit;
            }
            ResultKt.b(objA);
        }
        if (!((Boolean) objA).booleanValue()) {
            sourceName = Source.QUICKPAY_USECASE.getSourceName();
            refreshQuickPayPrerequisitesUseCase$invoke$1.label = 4;
            if (encryptionFeature.c(sourceName, refreshQuickPayPrerequisitesUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
        if (objA instanceof ChaloUseCaseResult.Failure) {
            this.c.e(Source.QUICKPAY_USECASE);
        }
        refreshQuickPayPrerequisitesUseCase$invoke$1.L$0 = walletTypeIdentifier;
        refreshQuickPayPrerequisitesUseCase$invoke$1.label = 2;
        objA = getChaloTimeUseCase.a(refreshQuickPayPrerequisitesUseCase$invoke$1);
        if (objA != coroutineSingletons) {
            if (objA instanceof ChaloUseCaseResult.Success) {
                String str2 = walletTypeIdentifier.b;
                refreshQuickPayPrerequisitesUseCase$invoke$1.L$0 = null;
                refreshQuickPayPrerequisitesUseCase$invoke$1.label = 3;
                objA = encryptionFeature.b(str2, refreshQuickPayPrerequisitesUseCase$invoke$1);
                if (objA != coroutineSingletons) {
                    if (!((Boolean) objA).booleanValue()) {
                        sourceName = Source.QUICKPAY_USECASE.getSourceName();
                        refreshQuickPayPrerequisitesUseCase$invoke$1.label = 4;
                        if (encryptionFeature.c(sourceName, refreshQuickPayPrerequisitesUseCase$invoke$1) == coroutineSingletons) {
                        }
                    }
                }
            }
            return unit;
        }
        return coroutineSingletons;
    }
}

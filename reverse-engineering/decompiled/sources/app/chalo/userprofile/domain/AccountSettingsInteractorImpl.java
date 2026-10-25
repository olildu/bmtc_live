package app.chalo.userprofile.domain;

import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import app.chalo.utils.PlatformFeature;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/userprofile/domain/AccountSettingsInteractorImpl;", "Lapp/chalo/userprofile/domain/AccountSettingsInteractor;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccountSettingsInteractorImpl implements AccountSettingsInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LogoutUserUseCase f10318a;

    public AccountSettingsInteractorImpl(LogoutUserUseCase logoutUserUseCase, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase) {
        this.f10318a = logoutUserUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofile.domain.AccountSettingsInteractor
    public final Object a(ContinuationImpl continuationImpl) {
        AccountSettingsInteractorImpl$getAvailableActions$1 accountSettingsInteractorImpl$getAvailableActions$1;
        List list;
        if (continuationImpl instanceof AccountSettingsInteractorImpl$getAvailableActions$1) {
            accountSettingsInteractorImpl$getAvailableActions$1 = (AccountSettingsInteractorImpl$getAvailableActions$1) continuationImpl;
            int i = accountSettingsInteractorImpl$getAvailableActions$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountSettingsInteractorImpl$getAvailableActions$1.label = i - Integer.MIN_VALUE;
            } else {
                accountSettingsInteractorImpl$getAvailableActions$1 = new AccountSettingsInteractorImpl$getAvailableActions$1(this, continuationImpl);
            }
        } else {
            accountSettingsInteractorImpl$getAvailableActions$1 = new AccountSettingsInteractorImpl$getAvailableActions$1(this, continuationImpl);
        }
        Object obj = accountSettingsInteractorImpl$getAvailableActions$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accountSettingsInteractorImpl$getAvailableActions$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            ArrayList arrayListB0 = CollectionsKt.b0(AccountSettingsAction.LOGOUT);
            accountSettingsInteractorImpl$getAvailableActions$1.L$0 = arrayListB0;
            accountSettingsInteractorImpl$getAvailableActions$1.label = 1;
            String strD = d(accountSettingsInteractorImpl$getAvailableActions$1);
            if (strD == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = arrayListB0;
            obj = strD;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) accountSettingsInteractorImpl$getAvailableActions$1.L$0;
            ResultKt.b(obj);
        }
        if (obj != null) {
            list.add(AccountSettingsAction.DELETE_ACCOUNT);
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofile.domain.AccountSettingsInteractor
    public final Object b(ContinuationImpl continuationImpl) {
        AccountSettingsInteractorImpl$logout$1 accountSettingsInteractorImpl$logout$1;
        if (continuationImpl instanceof AccountSettingsInteractorImpl$logout$1) {
            accountSettingsInteractorImpl$logout$1 = (AccountSettingsInteractorImpl$logout$1) continuationImpl;
            int i = accountSettingsInteractorImpl$logout$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountSettingsInteractorImpl$logout$1.label = i - Integer.MIN_VALUE;
            } else {
                accountSettingsInteractorImpl$logout$1 = new AccountSettingsInteractorImpl$logout$1(this, continuationImpl);
            }
        } else {
            accountSettingsInteractorImpl$logout$1 = new AccountSettingsInteractorImpl$logout$1(this, continuationImpl);
        }
        Object objA = accountSettingsInteractorImpl$logout$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accountSettingsInteractorImpl$logout$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            accountSettingsInteractorImpl$logout$1.label = 1;
            objA = this.f10318a.a(null, accountSettingsInteractorImpl$logout$1, true);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        return ((Boolean) objA).booleanValue() ? AccountSettingsLogoutResult.Success.f10320a : AccountSettingsLogoutResult.Failure.f10319a;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0066  */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.userprofile.domain.AccountSettingsInteractor
    public final Object c(ContinuationImpl continuationImpl) {
        AccountSettingsInteractorImpl$deleteAccount$1 accountSettingsInteractorImpl$deleteAccount$1;
        String str;
        if (continuationImpl instanceof AccountSettingsInteractorImpl$deleteAccount$1) {
            accountSettingsInteractorImpl$deleteAccount$1 = (AccountSettingsInteractorImpl$deleteAccount$1) continuationImpl;
            int i = accountSettingsInteractorImpl$deleteAccount$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountSettingsInteractorImpl$deleteAccount$1.label = i - Integer.MIN_VALUE;
            } else {
                accountSettingsInteractorImpl$deleteAccount$1 = new AccountSettingsInteractorImpl$deleteAccount$1(this, continuationImpl);
            }
        } else {
            accountSettingsInteractorImpl$deleteAccount$1 = new AccountSettingsInteractorImpl$deleteAccount$1(this, continuationImpl);
        }
        Object objD = accountSettingsInteractorImpl$deleteAccount$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accountSettingsInteractorImpl$deleteAccount$1.label;
        if (i2 == 0) {
            ResultKt.b(objD);
            accountSettingsInteractorImpl$deleteAccount$1.label = 1;
            objD = d(accountSettingsInteractorImpl$deleteAccount$1);
            if (objD != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objD);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) accountSettingsInteractorImpl$deleteAccount$1.L$0;
            ResultKt.b(objD);
        }
        return ((Boolean) objD).booleanValue() ? new AccountSettingsDeleteAccountResult.Success(str) : AccountSettingsDeleteAccountResult.LogoutFailed.f10316a;
        String str2 = (String) objD;
        if (str2 == null) {
            return AccountSettingsDeleteAccountResult.DeleteAccountNotAvailable.f10315a;
        }
        accountSettingsInteractorImpl$deleteAccount$1.L$0 = str2;
        accountSettingsInteractorImpl$deleteAccount$1.label = 2;
        Object objA = this.f10318a.a(null, accountSettingsInteractorImpl$deleteAccount$1, true);
        if (objA != coroutineSingletons) {
            str = str2;
            objD = objA;
            if (((Boolean) objD).booleanValue()) {
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final String d(ContinuationImpl continuationImpl) {
        AccountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1 accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1;
        if (continuationImpl instanceof AccountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1) {
            accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1 = (AccountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1) continuationImpl;
            int i = accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1.label = i - Integer.MIN_VALUE;
            } else {
                accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1 = new AccountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1(this, continuationImpl);
            }
        } else {
            accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1 = new AccountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1(this, continuationImpl);
        }
        Object obj = accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = accountSettingsInteractorImpl$getDeleteAccountUrlIfAvailable$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            float f = PlatformFeature.f10436a;
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        String str = ((MiscellaneousCityWiseConfigForCity) obj).r;
        if (str == null || StringsKt.F(str)) {
            return null;
        }
        return str;
    }
}

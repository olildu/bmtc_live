package app.chalo.login.domain;

import androidx.compose.material3.internal.CalendarModelKt;
import app.chalo.contract.BasicInfoContract;
import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.login.data.repository.LoginRepository;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/login/domain/CheckIfSkipConsentOptionAvailableUseCase;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfSkipConsentOptionAvailableUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LoginRepository f5229a;
    public final UserProfileDetailsProvider b;
    public final BasicInfoContract c;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase d;

    public CheckIfSkipConsentOptionAvailableUseCase(LoginRepository loginRepository, UserProfileDetailsProvider userProfileDetailsProvider, BasicInfoContract basicInfoContract, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase) {
        this.f5229a = loginRepository;
        this.b = userProfileDetailsProvider;
        this.c = basicInfoContract;
        this.d = getMiscellaneousCityWiseFlagsConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        CheckIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1 checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1;
        String str;
        long jLongValue;
        long j;
        long jLongValue2;
        long j2;
        long j3;
        if (continuationImpl instanceof CheckIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1) {
            checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1 = (CheckIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1) continuationImpl;
            int i = checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1 = new CheckIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1(this, continuationImpl);
            }
        } else {
            checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1 = new CheckIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1(this, continuationImpl);
        }
        Object objK = checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label;
        if (i2 == 0) {
            ResultKt.b(objK);
            checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = 1;
            objK = this.b.k(checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1);
            if (objK != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objK);
        } else {
            if (i2 == 2) {
                str = (String) checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.L$0;
                ResultKt.b(objK);
                jLongValue = ((Number) objK).longValue();
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.L$0 = null;
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$0 = jLongValue;
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = 3;
                objK = this.f5229a.f(jLongValue, str, checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1);
                if (objK != coroutineSingletons) {
                    j = jLongValue;
                    jLongValue2 = ((Number) objK).longValue();
                    checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$0 = j;
                    checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$1 = jLongValue2;
                    checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = 4;
                    objK = this.d.a(checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1);
                    if (objK != coroutineSingletons) {
                        j2 = j;
                        j3 = jLongValue2;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                j = checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$0;
                ResultKt.b(objK);
                jLongValue2 = ((Number) objK).longValue();
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$0 = j;
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$1 = jLongValue2;
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = 4;
                objK = this.d.a(checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1);
                if (objK != coroutineSingletons) {
                    j2 = j;
                    j3 = jLongValue2;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$1;
            j2 = checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$0;
            ResultKt.b(objK);
        }
        return Boolean.valueOf(j2 < (((long) ((MiscellaneousCityWiseConfigForCity) objK).s.f2408a) * CalendarModelKt.MillisecondsIn24Hours) + j3);
        str = (String) objK;
        if (str == null) {
            return Boolean.FALSE;
        }
        checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.L$0 = str;
        checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = 2;
        objK = this.c.c(checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1);
        if (objK != coroutineSingletons) {
            jLongValue = ((Number) objK).longValue();
            checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.L$0 = null;
            checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$0 = jLongValue;
            checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = 3;
            objK = this.f5229a.f(jLongValue, str, checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1);
            if (objK != coroutineSingletons) {
                j = jLongValue;
                jLongValue2 = ((Number) objK).longValue();
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$0 = j;
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.J$1 = jLongValue2;
                checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1.label = 4;
                objK = this.d.a(checkIfSkipConsentOptionAvailableUseCase$showSkipOptionForExistingUser$1);
                if (objK != coroutineSingletons) {
                    j2 = j;
                    j3 = jLongValue2;
                    return Boolean.valueOf(j2 < (((long) ((MiscellaneousCityWiseConfigForCity) objK).s.f2408a) * CalendarModelKt.MillisecondsIn24Hours) + j3);
                }
            }
        }
        return coroutineSingletons;
    }
}

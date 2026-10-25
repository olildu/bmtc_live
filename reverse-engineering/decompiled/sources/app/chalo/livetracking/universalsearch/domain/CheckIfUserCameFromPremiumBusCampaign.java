package app.chalo.livetracking.universalsearch.domain;

import app.chalo.data.MiscellaneousCityWiseConfigForCity;
import app.chalo.extensions.DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1;
import app.chalo.features.onetimeoffer.IUserPreferencesDataStore;
import app.chalo.usecase.GetMiscellaneousCityWiseFlagsConfigUseCase;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/universalsearch/domain/CheckIfUserCameFromPremiumBusCampaign;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CheckIfUserCameFromPremiumBusCampaign {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IUserPreferencesDataStore f5013a;
    public final GetMiscellaneousCityWiseFlagsConfigUseCase b;

    public CheckIfUserCameFromPremiumBusCampaign(IUserPreferencesDataStore iUserPreferencesDataStore, GetMiscellaneousCityWiseFlagsConfigUseCase getMiscellaneousCityWiseFlagsConfigUseCase) {
        this.f5013a = iUserPreferencesDataStore;
        this.b = getMiscellaneousCityWiseFlagsConfigUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(ContinuationImpl continuationImpl) {
        CheckIfUserCameFromPremiumBusCampaign$invoke$1 checkIfUserCameFromPremiumBusCampaign$invoke$1;
        String str;
        List list;
        List list2;
        String str2;
        if (continuationImpl instanceof CheckIfUserCameFromPremiumBusCampaign$invoke$1) {
            checkIfUserCameFromPremiumBusCampaign$invoke$1 = (CheckIfUserCameFromPremiumBusCampaign$invoke$1) continuationImpl;
            int i = checkIfUserCameFromPremiumBusCampaign$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                checkIfUserCameFromPremiumBusCampaign$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                checkIfUserCameFromPremiumBusCampaign$invoke$1 = new CheckIfUserCameFromPremiumBusCampaign$invoke$1(this, continuationImpl);
            }
        } else {
            checkIfUserCameFromPremiumBusCampaign$invoke$1 = new CheckIfUserCameFromPremiumBusCampaign$invoke$1(this, continuationImpl);
        }
        Object objV = checkIfUserCameFromPremiumBusCampaign$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = checkIfUserCameFromPremiumBusCampaign$invoke$1.label;
        IUserPreferencesDataStore iUserPreferencesDataStore = this.f5013a;
        if (i2 == 0) {
            ResultKt.b(objV);
            DataStoreExtensionsKt$getValueAsFlow$$inlined$map$1 dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D = iUserPreferencesDataStore.d();
            checkIfUserCameFromPremiumBusCampaign$invoke$1.label = 1;
            objV = FlowKt.v(dataStoreExtensionsKt$getValueAsFlow$$inlined$map$1D, checkIfUserCameFromPremiumBusCampaign$invoke$1);
            if (objV != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            ResultKt.b(objV);
        } else {
            if (i2 == 2) {
                str = (String) checkIfUserCameFromPremiumBusCampaign$invoke$1.L$0;
                ResultKt.b(objV);
                list = ((MiscellaneousCityWiseConfigForCity) objV).g;
                checkIfUserCameFromPremiumBusCampaign$invoke$1.L$0 = str;
                checkIfUserCameFromPremiumBusCampaign$invoke$1.L$1 = list;
                checkIfUserCameFromPremiumBusCampaign$invoke$1.label = 3;
                if (iUserPreferencesDataStore.f("", checkIfUserCameFromPremiumBusCampaign$invoke$1) != coroutineSingletons) {
                    list2 = list;
                    str2 = str;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list2 = (List) checkIfUserCameFromPremiumBusCampaign$invoke$1.L$1;
            str2 = (String) checkIfUserCameFromPremiumBusCampaign$invoke$1.L$0;
            ResultKt.b(objV);
        }
        return Boolean.valueOf(list2.contains(str2));
        String str3 = (String) objV;
        if (str3 == null) {
            return Boolean.FALSE;
        }
        checkIfUserCameFromPremiumBusCampaign$invoke$1.L$0 = str3;
        checkIfUserCameFromPremiumBusCampaign$invoke$1.label = 2;
        Object objA = this.b.a(checkIfUserCameFromPremiumBusCampaign$invoke$1);
        if (objA != coroutineSingletons) {
            str = str3;
            objV = objA;
            list = ((MiscellaneousCityWiseConfigForCity) objV).g;
            checkIfUserCameFromPremiumBusCampaign$invoke$1.L$0 = str;
            checkIfUserCameFromPremiumBusCampaign$invoke$1.L$1 = list;
            checkIfUserCameFromPremiumBusCampaign$invoke$1.label = 3;
            if (iUserPreferencesDataStore.f("", checkIfUserCameFromPremiumBusCampaign$invoke$1) != coroutineSingletons) {
                list2 = list;
                str2 = str;
                return Boolean.valueOf(list2.contains(str2));
            }
        }
        return coroutineSingletons;
    }
}

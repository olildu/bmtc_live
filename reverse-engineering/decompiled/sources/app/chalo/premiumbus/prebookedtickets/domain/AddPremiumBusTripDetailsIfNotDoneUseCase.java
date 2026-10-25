package app.chalo.premiumbus.prebookedtickets.domain;

import app.chalo.premiumbus.data.models.app.PremiumBusTripPollingResponseAppModel;
import app.chalo.premiumbus.data.models.app.PremiumBusTripStatus;
import app.chalo.premiumbus.data.models.app.PremiumReserveTripAppModel;
import app.chalo.premiumbus.data.repository.PremiumBusRepository;
import app.chalo.premiumbus.domains.FetchPremiumBusBookingsTripDetailsUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/prebookedtickets/domain/AddPremiumBusTripDetailsIfNotDoneUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AddPremiumBusTripDetailsIfNotDoneUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FetchPremiumBusBookingsTripDetailsUseCase f7294a;
    public final PremiumBusRepository b;

    public AddPremiumBusTripDetailsIfNotDoneUseCase(FetchPremiumBusBookingsTripDetailsUseCase fetchPremiumBusBookingsTripDetailsUseCase, PremiumBusRepository premiumBusRepository) {
        this.f7294a = fetchPremiumBusBookingsTripDetailsUseCase;
        this.b = premiumBusRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, List list, ContinuationImpl continuationImpl) {
        AddPremiumBusTripDetailsIfNotDoneUseCase$invoke$1 addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1;
        if (continuationImpl instanceof AddPremiumBusTripDetailsIfNotDoneUseCase$invoke$1) {
            addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1 = (AddPremiumBusTripDetailsIfNotDoneUseCase$invoke$1) continuationImpl;
            int i = addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1 = new AddPremiumBusTripDetailsIfNotDoneUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1 = new AddPremiumBusTripDetailsIfNotDoneUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (!list.isEmpty()) {
                addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.L$0 = str;
                addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.label = 1;
                objA = this.f7294a.a(list, addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1, false);
                if (objA != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
            return unit;
        }
        str = (String) addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.L$0;
        ResultKt.b(objA);
        String str2 = str;
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objA;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            List list2 = (List) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.L$0 = null;
            addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1.label = 2;
            List<PremiumBusTripPollingResponseAppModel> list3 = list2;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list3, 10));
            for (PremiumBusTripPollingResponseAppModel premiumBusTripPollingResponseAppModel : list3) {
                String str3 = premiumBusTripPollingResponseAppModel.f7107a;
                String str4 = premiumBusTripPollingResponseAppModel.d;
                PremiumBusTripStatus premiumBusTripStatus = premiumBusTripPollingResponseAppModel.e;
                arrayList.add(new PremiumReserveTripAppModel(str2, str3, str4, premiumBusTripStatus, premiumBusTripStatus == PremiumBusTripStatus.COMPLETED));
            }
            Object objM = this.b.m(arrayList, addPremiumBusTripDetailsIfNotDoneUseCase$invoke$1);
            if (objM != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM = unit;
            }
            if (objM == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return unit;
    }
}

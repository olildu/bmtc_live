package app.chalo.multimodalticket.domain;

import app.chalo.livetracking.tripplanner.data.models.app.GroupTicketJourneyLeg;
import app.chalo.livetracking.tripplanner.data.models.app.TripPlannerLegAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepAppModel;
import app.chalo.multimodalticket.data.model.app.GroupTicketSelectableStepLegDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lapp/chalo/multimodalticket/data/model/app/GroupTicketSelectableStepAppModel;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.multimodalticket.domain.NormalizeGroupTicketJourneyLegsUseCase$invoke$2", f = "NormalizeGroupTicketJourneyLegsUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
final class NormalizeGroupTicketJourneyLegsUseCase$invoke$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<GroupTicketSelectableStepAppModel>>, Object> {
    final /* synthetic */ List<GroupTicketJourneyLeg> $groupTicketJourneyLegList;
    int label;
    final /* synthetic */ NormalizeGroupTicketJourneyLegsUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalizeGroupTicketJourneyLegsUseCase$invoke$2(List list, NormalizeGroupTicketJourneyLegsUseCase normalizeGroupTicketJourneyLegsUseCase, Continuation continuation) {
        super(2, continuation);
        this.$groupTicketJourneyLegList = list;
        this.this$0 = normalizeGroupTicketJourneyLegsUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NormalizeGroupTicketJourneyLegsUseCase$invoke$2(this.$groupTicketJourneyLegList, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NormalizeGroupTicketJourneyLegsUseCase$invoke$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        List listV0 = CollectionsKt.v0(new NormalizeGroupTicketJourneyLegsUseCase$invoke$2$invokeSuspend$$inlined$sortedBy$1(), this.$groupTicketJourneyLegList);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        int i4 = 1;
        while (i2 < listV0.size()) {
            GroupTicketJourneyLeg groupTicketJourneyLeg = (GroupTicketJourneyLeg) listV0.get(i2);
            TripPlannerLegAppModel tripPlannerLegAppModel = groupTicketJourneyLeg.d;
            if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Bus) {
                arrayList.add(new GroupTicketSelectableStepAppModel(i3, i4, new GroupTicketSelectableStepLegDetails.Bus(groupTicketJourneyLeg)));
                i3++;
                i4++;
                i = i2 + 1;
                Boxing.b(i2);
            } else if (tripPlannerLegAppModel instanceof TripPlannerLegAppModel.Metro) {
                ArrayList arrayListB0 = CollectionsKt.b0(groupTicketJourneyLeg);
                while (true) {
                    i2++;
                    if (i2 >= listV0.size()) {
                        break;
                    }
                    GroupTicketJourneyLeg groupTicketJourneyLeg2 = (GroupTicketJourneyLeg) CollectionsKt.P(arrayListB0);
                    GroupTicketJourneyLeg groupTicketJourneyLeg3 = (GroupTicketJourneyLeg) listV0.get(i2);
                    this.this$0.getClass();
                    if (groupTicketJourneyLeg2.c != groupTicketJourneyLeg3.c) {
                        break;
                    }
                    arrayListB0.add(groupTicketJourneyLeg3);
                }
                arrayList.add(new GroupTicketSelectableStepAppModel(i3, i4, new GroupTicketSelectableStepLegDetails.Metro(arrayListB0)));
                i3++;
                i4++;
            } else {
                i = i2 + 1;
                Boxing.b(i2);
            }
            i2 = i;
        }
        return arrayList;
    }
}

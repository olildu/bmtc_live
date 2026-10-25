package app.chalo.livetracking.frameworklivetracking.domain;

import app.chalo.citydata.data.model.app.SeatAvailabilityLevel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketEtaResponseAppModel;
import app.chalo.livetracking.frameworklivetracking.data.model.app.RealtimeSocketResultKt;
import app.chalo.livetracking.provider.tracking.model.EstimatedEtaAppModel;
import app.chalo.livetracking.provider.tracking.model.StopLiveEtaAppModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/livetracking/frameworklivetracking/domain/ProcessLiveStopEtaDataUseCase;", "", "livetracking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProcessLiveStopEtaDataUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckLiveBusDelayedUseCase f4331a;

    public ProcessLiveStopEtaDataUseCase(CheckLiveBusDelayedUseCase checkLiveBusDelayedUseCase) {
        this.f4331a = checkLiveBusDelayedUseCase;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00b1 -> B:31:0x00b2). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.List r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.livetracking.frameworklivetracking.domain.ProcessLiveStopEtaDataUseCase.a(java.util.List, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ProcessLiveStopEtaDataUseCase$invoke$1 processLiveStopEtaDataUseCase$invoke$1;
        if (continuationImpl instanceof ProcessLiveStopEtaDataUseCase$invoke$1) {
            processLiveStopEtaDataUseCase$invoke$1 = (ProcessLiveStopEtaDataUseCase$invoke$1) continuationImpl;
            int i = processLiveStopEtaDataUseCase$invoke$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                processLiveStopEtaDataUseCase$invoke$1.label = i - Integer.MIN_VALUE;
            } else {
                processLiveStopEtaDataUseCase$invoke$1 = new ProcessLiveStopEtaDataUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            processLiveStopEtaDataUseCase$invoke$1 = new ProcessLiveStopEtaDataUseCase$invoke$1(this, continuationImpl);
        }
        Object objA = processLiveStopEtaDataUseCase$invoke$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = processLiveStopEtaDataUseCase$invoke$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            if (RealtimeSocketResultKt.c(arrayList)) {
                processLiveStopEtaDataUseCase$invoke$1.label = 1;
                objA = a(arrayList, processLiveStopEtaDataUseCase$invoke$1);
                if (objA == obj) {
                    return obj;
                }
            } else if (RealtimeSocketResultKt.b(arrayList)) {
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = arrayList.get(i3);
                    i3++;
                    RealtimeSocketEtaResponseAppModel realtimeSocketEtaResponseAppModel = (RealtimeSocketEtaResponseAppModel) obj2;
                    if (realtimeSocketEtaResponseAppModel.d > 0 && realtimeSocketEtaResponseAppModel.e < 7200) {
                        arrayList2.add(obj2);
                    }
                }
                List<RealtimeSocketEtaResponseAppModel> listV0 = CollectionsKt.v0(new ProcessLiveStopEtaDataUseCase$getEstimatedStopEtaUiModelList$$inlined$sortedBy$1(), arrayList2);
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(listV0, 10));
                for (RealtimeSocketEtaResponseAppModel realtimeSocketEtaResponseAppModel2 : listV0) {
                    arrayList3.add(new EstimatedEtaAppModel(realtimeSocketEtaResponseAppModel2.d, realtimeSocketEtaResponseAppModel2.e, realtimeSocketEtaResponseAppModel2.h, realtimeSocketEtaResponseAppModel2.c, SeatAvailabilityLevel.UNKNOWN));
                }
                if (!arrayList3.isEmpty()) {
                    return new StopLiveEtaAppModel.EstimatedEta(arrayList3);
                }
            } else if (RealtimeSocketResultKt.a(arrayList)) {
                return StopLiveEtaAppModel.AllBusPassed.f4371a;
            }
            return StopLiveEtaAppModel.NotAvailable.f4374a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(objA);
        List list = (List) objA;
        if (!list.isEmpty()) {
            return new StopLiveEtaAppModel.FixedEta(list);
        }
        return StopLiveEtaAppModel.NotAvailable.f4374a;
    }
}

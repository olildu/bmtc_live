package app.chalo.recent.domain;

import app.chalo.recent.database.entities.RecentsSpecialEntityStatus;
import app.chalo.recent.database.repository.recent.PlacesRecentRepository;
import app.chalo.recent.database.repository.recent.RecentRepositoryProvider;
import app.chalo.recent.database.repository.recent.RouteRecentRepository;
import app.chalo.recent.database.repository.recent.StopRecentRepository;
import app.chalo.recent.database.repository.recent.TripRecentRepository;
import app.chalo.recent.model.app.RecentsAppModelKt;
import app.chalo.recent.model.app.RecentsSpecialStatus;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.recent.domain.FetchRecentDataFromDbBasedOnSpecialStatusUseCase", f = "FetchRecentDataFromDbBasedOnSpecialStatusUseCase.kt", l = {29, 34, 39, 44}, m = "fetchRecentDataFromDb", v = 1)
final class FetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FetchRecentDataFromDbBasedOnSpecialStatusUseCase this$0;

    /* JADX WARN: Code duplicated, block: B:25:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d0  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        RecentsSpecialStatus recentsSpecialStatus;
        Flow flow;
        String str2;
        Flow flow2;
        Object objE;
        Flow flow3;
        Flow flow4;
        Flow flow5;
        Object objE2;
        Flow flow6;
        Flow flow7;
        Flow flow8;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        RecentRepositoryProvider recentRepositoryProvider = this.this$0.f8961a;
        int i2 = i - Integer.MIN_VALUE;
        this.label = i2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (i2 == 0) {
            ResultKt.b(obj);
            RouteRecentRepository f8954a = recentRepositoryProvider.getF8954a();
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = f8954a.g(this);
            if (obj != coroutineSingletons) {
                str = null;
                recentsSpecialStatus = null;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            RecentsSpecialStatus recentsSpecialStatus2 = (RecentsSpecialStatus) this.L$1;
            String str3 = (String) this.L$0;
            ResultKt.b(obj);
            recentsSpecialStatus = recentsSpecialStatus2;
            str = str3;
        } else {
            if (i2 == 2) {
                flow = (Flow) this.L$2;
                recentsSpecialStatus = (RecentsSpecialStatus) this.L$1;
                str2 = (String) this.L$0;
                ResultKt.b(obj);
                flow2 = (Flow) obj;
                PlacesRecentRepository d = recentRepositoryProvider.getD();
                RecentsSpecialEntityStatus recentsSpecialEntityStatusD = RecentsAppModelKt.d(recentsSpecialStatus);
                this.L$0 = str2;
                this.L$1 = flow;
                this.L$2 = flow2;
                this.label = 3;
                objE = d.e(recentsSpecialEntityStatusD, str2, this);
                if (objE != coroutineSingletons) {
                    Flow flow9 = flow;
                    flow3 = flow2;
                    obj = objE;
                    flow4 = flow9;
                    flow5 = (Flow) obj;
                    TripRecentRepository e = recentRepositoryProvider.getE();
                    this.L$0 = flow4;
                    this.L$1 = flow3;
                    this.L$2 = flow5;
                    this.label = 4;
                    objE2 = e.e((6 & 4) != 0 ? 3 : 5, str2, this);
                    if (objE2 != coroutineSingletons) {
                        flow6 = flow3;
                        flow7 = flow5;
                        obj = objE2;
                        flow8 = flow4;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                flow3 = (Flow) this.L$2;
                flow4 = (Flow) this.L$1;
                str2 = (String) this.L$0;
                ResultKt.b(obj);
                flow5 = (Flow) obj;
                TripRecentRepository e2 = recentRepositoryProvider.getE();
                this.L$0 = flow4;
                this.L$1 = flow3;
                this.L$2 = flow5;
                this.label = 4;
                objE2 = e2.e((6 & 4) != 0 ? 3 : 5, str2, this);
                if (objE2 != coroutineSingletons) {
                    flow6 = flow3;
                    flow7 = flow5;
                    obj = objE2;
                    flow8 = flow4;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flow7 = (Flow) this.L$2;
            flow6 = (Flow) this.L$1;
            flow8 = (Flow) this.L$0;
            ResultKt.b(obj);
        }
        return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(new Flow[]{flow8, flow6, flow7, (Flow) obj}, new FetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2(5, null));
        Flow flow10 = (Flow) obj;
        StopRecentRepository b = recentRepositoryProvider.getB();
        RecentsSpecialEntityStatus recentsSpecialEntityStatusD2 = RecentsAppModelKt.d(recentsSpecialStatus);
        this.L$0 = str;
        this.L$1 = recentsSpecialStatus;
        this.L$2 = flow10;
        this.label = 2;
        Object objG = b.g(recentsSpecialEntityStatusD2, str, this);
        if (objG != coroutineSingletons) {
            String str4 = str;
            flow = flow10;
            obj = objG;
            str2 = str4;
            flow2 = (Flow) obj;
            PlacesRecentRepository d2 = recentRepositoryProvider.getD();
            RecentsSpecialEntityStatus recentsSpecialEntityStatusD3 = RecentsAppModelKt.d(recentsSpecialStatus);
            this.L$0 = str2;
            this.L$1 = flow;
            this.L$2 = flow2;
            this.label = 3;
            objE = d2.e(recentsSpecialEntityStatusD3, str2, this);
            if (objE != coroutineSingletons) {
                Flow flow11 = flow;
                flow3 = flow2;
                obj = objE;
                flow4 = flow11;
                flow5 = (Flow) obj;
                TripRecentRepository e3 = recentRepositoryProvider.getE();
                this.L$0 = flow4;
                this.L$1 = flow3;
                this.L$2 = flow5;
                this.label = 4;
                objE2 = e3.e((6 & 4) != 0 ? 3 : 5, str2, this);
                if (objE2 != coroutineSingletons) {
                    flow6 = flow3;
                    flow7 = flow5;
                    obj = objE2;
                    flow8 = flow4;
                    return new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(new Flow[]{flow8, flow6, flow7, (Flow) obj}, new FetchRecentDataFromDbBasedOnSpecialStatusUseCase$fetchRecentDataFromDb$2(5, null));
                }
            }
        }
        return coroutineSingletons;
    }
}

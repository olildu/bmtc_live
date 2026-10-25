package app.chalo.home.ui.base;

import app.chalo.providers.cityprovider.CityProviderKt;
import app.chalo.ridehailing.data.RideHailingRepository;
import app.chalo.ridehailing.data.app.RideBookingUserFeedbackAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingFeedbackRequestAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingFeedbackResponseAppModel;
import app.chalo.ridehailing.data.app.RideHailingBookingFeedbackResultAppModel;
import app.chalo.ridehailing.domain.SubmitRideHailingBookingFeedbackUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.home.ui.base.HomeComponent$syncRideHailingUserFeedbackDataWithBackendIfRequired$1", f = "HomeComponent.kt", l = {1735, 1741, 1748}, m = "invokeSuspend", v = 1)
final class HomeComponent$syncRideHailingUserFeedbackDataWithBackendIfRequired$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ HomeComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeComponent$syncRideHailingUserFeedbackDataWithBackendIfRequired$1(HomeComponent homeComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = homeComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HomeComponent$syncRideHailingUserFeedbackDataWithBackendIfRequired$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeComponent$syncRideHailingUserFeedbackDataWithBackendIfRequired$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00be  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x00bc A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        ChaloUseCaseResult chaloUseCaseResult;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int size;
        int i;
        RideHailingRepository rideHailingRepository;
        RideHailingBookingFeedbackResultAppModel rideHailingBookingFeedbackResultAppModel;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            String strB = CityProviderKt.b(this.this$0.m);
            if (strB != null) {
                RideHailingRepository rideHailingRepository2 = this.this$0.s0;
                this.label = 1;
                obj = rideHailingRepository2.c(strB, this);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return unit;
        }
        if (i2 == 1) {
            ResultKt.b(obj);
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                return unit;
            }
            ResultKt.b(obj);
        }
        chaloUseCaseResult = (ChaloUseCaseResult) obj;
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            arrayList2 = ((RideHailingBookingFeedbackResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f9110a;
            arrayList3 = new ArrayList();
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                rideHailingBookingFeedbackResultAppModel = (RideHailingBookingFeedbackResultAppModel) obj2;
                str = rideHailingBookingFeedbackResultAppModel.f9111a;
                if (!rideHailingBookingFeedbackResultAppModel.b) {
                    str = null;
                }
                if (str != null) {
                    arrayList3.add(str);
                }
            }
            if (!arrayList3.isEmpty()) {
                rideHailingRepository = this.this$0.s0;
                this.label = 3;
                if (rideHailingRepository.b(arrayList3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
        List list = (List) obj;
        if (list != null) {
            List<RideBookingUserFeedbackAppModel> list2 = list;
            arrayList = new ArrayList(CollectionsKt.v(list2, 10));
            for (RideBookingUserFeedbackAppModel rideBookingUserFeedbackAppModel : list2) {
                Intrinsics.i(rideBookingUserFeedbackAppModel, "<this>");
                String str2 = rideBookingUserFeedbackAppModel.f9106a;
                int i3 = rideBookingUserFeedbackAppModel.c;
                String str3 = rideBookingUserFeedbackAppModel.d;
                String str4 = rideBookingUserFeedbackAppModel.e;
                List list3 = rideBookingUserFeedbackAppModel.f;
                arrayList.add(new RideHailingBookingFeedbackRequestAppModel(i3, str2, str3, str4, !list3.isEmpty() ? list3 : null));
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            SubmitRideHailingBookingFeedbackUseCase submitRideHailingBookingFeedbackUseCase = this.this$0.t0;
            this.label = 2;
            obj = submitRideHailingBookingFeedbackUseCase.a(arrayList, this);
            if (obj != coroutineSingletons) {
                chaloUseCaseResult = (ChaloUseCaseResult) obj;
                if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
                    if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                        throw new NoWhenBranchMatchedException();
                    }
                    arrayList2 = ((RideHailingBookingFeedbackResponseAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a).f9110a;
                    arrayList3 = new ArrayList();
                    size = arrayList2.size();
                    i = 0;
                    while (i < size) {
                        Object obj3 = arrayList2.get(i);
                        i++;
                        rideHailingBookingFeedbackResultAppModel = (RideHailingBookingFeedbackResultAppModel) obj3;
                        str = rideHailingBookingFeedbackResultAppModel.f9111a;
                        if (!rideHailingBookingFeedbackResultAppModel.b) {
                            str = null;
                        }
                        if (str != null) {
                            arrayList3.add(str);
                        }
                    }
                    if (!arrayList3.isEmpty()) {
                        rideHailingRepository = this.this$0.s0;
                        this.label = 3;
                        if (rideHailingRepository.b(arrayList3, this) == coroutineSingletons) {
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        return unit;
    }
}

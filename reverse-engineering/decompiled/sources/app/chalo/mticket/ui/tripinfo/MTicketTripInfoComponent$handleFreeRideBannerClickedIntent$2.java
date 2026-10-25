package app.chalo.mticket.ui.tripinfo;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.utils.SystemHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.mticket.ui.tripinfo.MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$2", f = "MTicketTripInfoComponent.kt", l = {384, 385, 389}, m = "invokeSuspend", v = 1)
final class MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ MTicketTripInfoComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$2(MTicketTripInfoComponent mTicketTripInfoComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = mTicketTripInfoComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MTicketTripInfoComponent$handleFreeRideBannerClickedIntent$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0091  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SystemHelper systemHelper;
        String str;
        SystemHelper systemHelper2;
        String str2;
        Object objB;
        String str3;
        SystemHelper systemHelper3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            MTicketTripInfoComponent mTicketTripInfoComponent = this.this$0;
            systemHelper = mTicketTripInfoComponent.u;
            this.L$0 = systemHelper;
            this.label = 1;
            obj = mTicketTripInfoComponent.p.b(StringEnum.ZOPHOP_RECOMMEND_SUBJECT, new Object[0], this);
            if (obj != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            systemHelper = (SystemHelper) this.L$0;
            ResultKt.b(obj);
        } else {
            if (i == 2) {
                str = (String) this.L$1;
                systemHelper2 = (SystemHelper) this.L$0;
                ResultKt.b(obj);
                str2 = (String) obj;
                this.L$0 = systemHelper2;
                this.L$1 = str;
                this.L$2 = str2;
                this.label = 3;
                objB = this.this$0.p.b(StringEnum.INVITE_FRIEND, new Object[0], this);
                if (objB != coroutineSingletons) {
                    str3 = str2;
                    obj = objB;
                    systemHelper3 = systemHelper2;
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = (String) this.L$2;
            str = (String) this.L$1;
            systemHelper3 = (SystemHelper) this.L$0;
            ResultKt.b(obj);
        }
        systemHelper3.k((String) obj, str3, str);
        return Unit.f17538a;
        String str4 = (String) obj;
        MTicketTripInfoComponent mTicketTripInfoComponent2 = this.this$0;
        StringProvider stringProvider = mTicketTripInfoComponent2.p;
        StringEnum stringEnum = StringEnum.ZOPHOP_RECOMMEND_TEXT;
        Object[] objArr = {mTicketTripInfoComponent2.u.c()};
        this.L$0 = systemHelper;
        this.L$1 = str4;
        this.label = 2;
        Object objB2 = stringProvider.b(stringEnum, objArr, this);
        if (objB2 != coroutineSingletons) {
            SystemHelper systemHelper4 = systemHelper;
            str = str4;
            obj = objB2;
            systemHelper2 = systemHelper4;
            str2 = (String) obj;
            this.L$0 = systemHelper2;
            this.L$1 = str;
            this.L$2 = str2;
            this.label = 3;
            objB = this.this$0.p.b(StringEnum.INVITE_FRIEND, new Object[0], this);
            if (objB != coroutineSingletons) {
                str3 = str2;
                obj = objB;
                systemHelper3 = systemHelper2;
                systemHelper3.k((String) obj, str3, str);
                return Unit.f17538a;
            }
        }
        return coroutineSingletons;
    }
}

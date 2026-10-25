package app.chalo.productpurchase.passpurchase.ui.enteruserdetails;

import app.chalo.scenes.args.SuperPassBasicUserPurpose;
import app.chalo.userprofile.Gender;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.productpurchase.passpurchase.ui.enteruserdetails.SuperPassEnterUserDetailsViewModel$handleNextBtnClickIntent$1", f = "SuperPassEnterUserDetailsViewModel.kt", l = {213, 223}, m = "invokeSuspend", v = 1)
final class SuperPassEnterUserDetailsViewModel$handleNextBtnClickIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SuperPassEnterUserDetailsViewModel this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8430a;

        static {
            int[] iArr = new int[SuperPassBasicUserPurpose.values().length];
            try {
                iArr[SuperPassBasicUserPurpose.COMPLETE_DETAILS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SuperPassBasicUserPurpose.ONLY_NAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SuperPassBasicUserPurpose.EDIT_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f8430a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperPassEnterUserDetailsViewModel$handleNextBtnClickIntent$1(SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superPassEnterUserDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperPassEnterUserDetailsViewModel$handleNextBtnClickIntent$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperPassEnterUserDetailsViewModel$handleNextBtnClickIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00e2 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
                return unit;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        SuperPassBasicUserPurpose superPassBasicUserPurpose = ((SuperPassEnterUserDetailsDataState) this.this$0.f.getValue()).f;
        int i2 = superPassBasicUserPurpose == null ? -1 : WhenMappings.f8430a[superPassBasicUserPurpose.ordinal()];
        if (i2 != -1) {
            if (i2 == 1) {
                Long l = ((SuperPassEnterUserDetailsDataState) this.this$0.f.getValue()).c;
                if (l != null) {
                    long jLongValue = l.longValue();
                    String string = StringsKt.u0(((SuperPassEnterUserDetailsDataState) this.this$0.f.getValue()).f8412a).toString();
                    Gender gender = ((SuperPassEnterUserDetailsDataState) this.this$0.f.getValue()).b;
                    Long l2 = ((SuperPassEnterUserDetailsDataState) this.this$0.f.getValue()).c;
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        String strQ = this.this$0.q.Q(jLongValue);
                        Long l3 = ((SuperPassEnterUserDetailsDataState) this.this$0.f.getValue()).d;
                        if (l3 != null) {
                            long jLongValue3 = l3.longValue();
                            SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel = this.this$0;
                            this.label = 1;
                            if (SuperPassEnterUserDetailsViewModel.r(superPassEnterUserDetailsViewModel, string, gender, strQ, jLongValue2, jLongValue3, this) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                }
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                SuperPassEnterUserDetailsViewModel superPassEnterUserDetailsViewModel2 = this.this$0;
                String string2 = StringsKt.u0(((SuperPassEnterUserDetailsDataState) superPassEnterUserDetailsViewModel2.f.getValue()).f8412a).toString();
                boolean z = ((SuperPassEnterUserDetailsDataState) this.this$0.f.getValue()).f == SuperPassBasicUserPurpose.EDIT_NAME;
                this.label = 2;
                if (SuperPassEnterUserDetailsViewModel.s(superPassEnterUserDetailsViewModel2, string2, z, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
    }
}

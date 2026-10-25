package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.extensions.UtilityExtensionsKt;
import app.chalo.usecase.FeedbackDataAppModel;
import app.chalo.usecase.GetRideFeedbackDataUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import defpackage.s8;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$collectRideFeedbackIfReqOrNavigateToHomeScreen$2", f = "BleValidationFragmentComponent.android.kt", l = {1074, 1090}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$collectRideFeedbackIfReqOrNavigateToHomeScreen$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ GetRideFeedbackDataUseCase.FeedbackFilter $feedbackFilter;
    Object L$0;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10571a;

        static {
            int[] iArr = new int[GetRideFeedbackDataUseCase.FeedbackFilter.values().length];
            try {
                iArr[GetRideFeedbackDataUseCase.FeedbackFilter.CONDUCTOR_VALIDATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetRideFeedbackDataUseCase.FeedbackFilter.TITO_RIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f10571a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$collectRideFeedbackIfReqOrNavigateToHomeScreen$2(GetRideFeedbackDataUseCase.FeedbackFilter feedbackFilter, BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, Continuation continuation) {
        super(2, continuation);
        this.$feedbackFilter = feedbackFilter;
        this.this$0 = bleValidationFragmentComponentAndroid;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$collectRideFeedbackIfReqOrNavigateToHomeScreen$2(this.$feedbackFilter, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$collectRideFeedbackIfReqOrNavigateToHomeScreen$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0098  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Long l;
        ChaloUseCaseResult chaloUseCaseResult;
        FeedbackDataAppModel feedbackDataAppModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Unit unit = Unit.f17538a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.b(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l = (Long) this.L$0;
                ResultKt.b(obj);
            }
            chaloUseCaseResult = (ChaloUseCaseResult) obj;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                this.this$0.Q0();
                return unit;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            feedbackDataAppModel = (FeedbackDataAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            String message = "BleValidationCompletion here44 success = ".concat(UtilityExtensionsKt.a(feedbackDataAppModel.b));
            Intrinsics.i(message, "message");
            Random.f17624a.getClass();
            if (Random.b.f() * 100 <= feedbackDataAppModel.f10171a || feedbackDataAppModel.b.isEmpty()) {
                this.this$0.Q0();
                return unit;
            }
            BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
            List list = feedbackDataAppModel.b;
            long jLongValue = l.longValue();
            bleValidationFragmentComponentAndroid.getClass();
            bleValidationFragmentComponentAndroid.E0(new s8(bleValidationFragmentComponentAndroid, list, jLongValue, 1));
            return unit;
        }
        ResultKt.b(obj);
        int i2 = WhenMappings.f10571a[this.$feedbackFilter.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid2 = this.this$0;
            this.label = 1;
            if (BleValidationFragmentComponentAndroid.F0(bleValidationFragmentComponentAndroid2, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        this.this$0.Q0();
        BleValidationMetaData bleValidationMetaData = ((BleValidationState) this.this$0.f.getValue()).j;
        Long l2 = bleValidationMetaData != null ? bleValidationMetaData.f : null;
        BleValidationMetaData bleValidationMetaData2 = ((BleValidationState) this.this$0.f.getValue()).j;
        if ((bleValidationMetaData2 != null ? bleValidationMetaData2.d.b : null) == null || l2 == null) {
            this.this$0.Q0();
            return unit;
        }
        GetRideFeedbackDataUseCase getRideFeedbackDataUseCase = this.this$0.z;
        GetRideFeedbackDataUseCase.FeedbackFilter feedbackFilter = this.$feedbackFilter;
        this.L$0 = l2;
        this.label = 2;
        Object objA = getRideFeedbackDataUseCase.a(feedbackFilter, this);
        if (objA != coroutineSingletons) {
            l = l2;
            obj = objA;
            chaloUseCaseResult = (ChaloUseCaseResult) obj;
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Failure) {
                this.this$0.Q0();
                return unit;
            }
            if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            feedbackDataAppModel = (FeedbackDataAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            String message2 = "BleValidationCompletion here44 success = ".concat(UtilityExtensionsKt.a(feedbackDataAppModel.b));
            Intrinsics.i(message2, "message");
            Random.f17624a.getClass();
            if (Random.b.f() * 100 <= feedbackDataAppModel.f10171a) {
            }
            this.this$0.Q0();
            return unit;
        }
        return coroutineSingletons;
    }
}

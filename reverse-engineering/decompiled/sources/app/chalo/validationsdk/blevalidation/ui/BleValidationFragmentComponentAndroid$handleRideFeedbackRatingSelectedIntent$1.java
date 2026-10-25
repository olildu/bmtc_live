package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProductKt;
import app.chalo.ridefeedbacktracker.ChaloRideFeedbackCollectionHelper;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSelectedIntent$1", f = "BleValidationFragmentComponent.android.kt", l = {637}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSelectedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleValidationIntent.RideFeedbackRatingSelectedIntent $intent;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSelectedIntent$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, BleValidationIntent.RideFeedbackRatingSelectedIntent rideFeedbackRatingSelectedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
        this.$intent = rideFeedbackRatingSelectedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSelectedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSelectedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RideRatingBottomsheetInfo rideRatingBottomsheetInfo;
        ChaloRideFeedbackCollectionHelper chaloRideFeedbackCollectionHelper;
        Source source;
        int i;
        ValidationProduct validationProduct;
        int i2;
        ValidationProduct validationProduct2;
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Unit unit = Unit.f17538a;
        if (i3 == 0) {
            ResultKt.b(obj);
            BleValidationBottomsheetInfo bleValidationBottomsheetInfo = ((BleValidationState) this.this$0.f.getValue()).e;
            if (bleValidationBottomsheetInfo != null && (rideRatingBottomsheetInfo = bleValidationBottomsheetInfo.d) != null) {
                BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
                chaloRideFeedbackCollectionHelper = bleValidationFragmentComponentAndroid.A;
                source = Source.BLE_VALIDATION_ACTIVITY;
                i = this.$intent.f10593a;
                int i4 = rideRatingBottomsheetInfo.f10620a;
                BleValidationMetaData bleValidationMetaData = ((BleValidationState) bleValidationFragmentComponentAndroid.f.getValue()).j;
                if (bleValidationMetaData != null && (validationProduct = bleValidationMetaData.d.b) != null) {
                    long j2 = rideRatingBottomsheetInfo.b;
                    BasicInfoContract basicInfoContract = this.this$0.t;
                    this.L$0 = chaloRideFeedbackCollectionHelper;
                    this.L$1 = source;
                    this.L$2 = validationProduct;
                    this.I$0 = i;
                    this.I$1 = i4;
                    this.J$0 = j2;
                    this.label = 1;
                    obj = basicInfoContract.c(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    i2 = i4;
                    validationProduct2 = validationProduct;
                    j = j2;
                }
            }
            return unit;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j = this.J$0;
        i2 = this.I$1;
        i = this.I$0;
        validationProduct2 = (ValidationProduct) this.L$2;
        source = (Source) this.L$1;
        chaloRideFeedbackCollectionHelper = (ChaloRideFeedbackCollectionHelper) this.L$0;
        ResultKt.b(obj);
        Source source2 = source;
        long jLongValue = ((Number) obj).longValue();
        chaloRideFeedbackCollectionHelper.getClass();
        Intrinsics.i(source2, "source");
        Intrinsics.i(validationProduct2, "validationProduct");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("selectedRating", Integer.valueOf(i));
        linkedHashMap.put("maxRating", Integer.valueOf(i2));
        linkedHashMap.put("bookingId", validationProduct2.getC());
        linkedHashMap.put("productType", ValidationProductKt.a(validationProduct2).d());
        linkedHashMap.put("productSubType", ValidationProductKt.a(validationProduct2).e());
        linkedHashMap.put("punchTsInMillis", Long.valueOf(j));
        linkedHashMap.put("feedbackSubmittedTsMillis", Long.valueOf(jLongValue));
        AnalyticsContractImplKt.b(chaloRideFeedbackCollectionHelper.f9094a, "ride feedback rating selected", source2, linkedHashMap, false, 24);
        return unit;
    }
}

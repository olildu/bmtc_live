package app.chalo.validationsdk.blevalidation.ui;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.extensions.UtilityExtensionsKt;
import app.chalo.models.validation.ValidationProduct;
import app.chalo.models.validation.ValidationProductKt;
import app.chalo.ridefeedbacktracker.ChaloRideFeedback;
import app.chalo.ridefeedbacktracker.ChaloRideFeedbackCollectionHelper;
import app.chalo.usecase.FeedbackTags;
import defpackage.wa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.validationsdk.blevalidation.ui.BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSubmittedIntent$1", f = "BleValidationFragmentComponent.android.kt", l = {658}, m = "invokeSuspend", v = 1)
final class BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSubmittedIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleValidationIntent.RideFeedbackRatingSubmittedIntent $intent;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ BleValidationFragmentComponentAndroid this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSubmittedIntent$1(BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid, BleValidationIntent.RideFeedbackRatingSubmittedIntent rideFeedbackRatingSubmittedIntent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bleValidationFragmentComponentAndroid;
        this.$intent = rideFeedbackRatingSubmittedIntent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSubmittedIntent$1(this.this$0, this.$intent, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BleValidationFragmentComponentAndroid$handleRideFeedbackRatingSubmittedIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        RideRatingBottomsheetInfo rideRatingBottomsheetInfo;
        ValidationProduct validationProduct;
        ValidationProduct validationProduct2;
        Object objC;
        ChaloRideFeedbackCollectionHelper chaloRideFeedbackCollectionHelper;
        ValidationProduct validationProduct3;
        int i;
        List list;
        long j;
        Source source;
        String str;
        int i2;
        ValidationProduct validationProduct4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        Unit unit = Unit.f17538a;
        if (i3 == 0) {
            ResultKt.b(obj);
            BleValidationBottomsheetInfo bleValidationBottomsheetInfo = ((BleValidationState) this.this$0.f.getValue()).e;
            if (bleValidationBottomsheetInfo != null && (rideRatingBottomsheetInfo = bleValidationBottomsheetInfo.d) != null) {
                BleValidationMetaData bleValidationMetaData = ((BleValidationState) this.this$0.f.getValue()).j;
                if (bleValidationMetaData == null || (validationProduct = bleValidationMetaData.d.b) == null) {
                    this.this$0.E0(new wa(6));
                    this.this$0.Q0();
                } else {
                    BleValidationFragmentComponentAndroid bleValidationFragmentComponentAndroid = this.this$0;
                    BleValidationIntent.RideFeedbackRatingSubmittedIntent rideFeedbackRatingSubmittedIntent = this.$intent;
                    ChaloRideFeedbackCollectionHelper chaloRideFeedbackCollectionHelper2 = bleValidationFragmentComponentAndroid.A;
                    Source source2 = Source.BLE_VALIDATION_ACTIVITY;
                    int i4 = rideFeedbackRatingSubmittedIntent.f10594a;
                    int i5 = rideRatingBottomsheetInfo.f10620a;
                    List list2 = rideFeedbackRatingSubmittedIntent.b;
                    String str2 = rideFeedbackRatingSubmittedIntent.c;
                    BleValidationMetaData bleValidationMetaData2 = ((BleValidationState) bleValidationFragmentComponentAndroid.f.getValue()).j;
                    if (bleValidationMetaData2 != null && (validationProduct2 = bleValidationMetaData2.d.b) != null) {
                        long j2 = rideRatingBottomsheetInfo.b;
                        BasicInfoContract basicInfoContract = bleValidationFragmentComponentAndroid.t;
                        this.L$0 = validationProduct2;
                        this.L$1 = str2;
                        this.L$2 = list2;
                        this.L$3 = validationProduct;
                        this.L$4 = source2;
                        this.L$5 = chaloRideFeedbackCollectionHelper2;
                        this.J$0 = j2;
                        this.I$0 = i5;
                        this.I$1 = i4;
                        this.label = 1;
                        objC = basicInfoContract.c(this);
                        if (objC == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        chaloRideFeedbackCollectionHelper = chaloRideFeedbackCollectionHelper2;
                        validationProduct3 = validationProduct;
                        i = i5;
                        list = list2;
                        j = j2;
                        source = source2;
                        str = str2;
                        i2 = i4;
                        validationProduct4 = validationProduct2;
                    }
                }
            }
            return unit;
        }
        if (i3 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i6 = this.I$1;
        int i7 = this.I$0;
        long j3 = this.J$0;
        chaloRideFeedbackCollectionHelper = (ChaloRideFeedbackCollectionHelper) this.L$5;
        Source source3 = (Source) this.L$4;
        ValidationProduct validationProduct5 = (ValidationProduct) this.L$3;
        List list3 = (List) this.L$2;
        String str3 = (String) this.L$1;
        ValidationProduct validationProduct6 = (ValidationProduct) this.L$0;
        ResultKt.b(obj);
        i2 = i6;
        validationProduct3 = validationProduct5;
        list = list3;
        str = str3;
        validationProduct4 = validationProduct6;
        j = j3;
        source = source3;
        i = i7;
        objC = obj;
        ChaloRideFeedback chaloRideFeedback = new ChaloRideFeedback(i2, i, list, str, validationProduct4, j, ((Number) objC).longValue());
        chaloRideFeedbackCollectionHelper.getClass();
        Intrinsics.i(source, "source");
        Intrinsics.i(validationProduct3, "validationProduct");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("selectedRating", Integer.valueOf(i2));
        linkedHashMap.put("maxRating", Integer.valueOf(i));
        List list4 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list4, 10));
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            arrayList.add(((FeedbackTags) it.next()).b);
        }
        linkedHashMap.put("selectedFeedbackTags", UtilityExtensionsKt.a(arrayList));
        String str4 = chaloRideFeedback.d;
        if (str4 == null) {
            str4 = "";
        }
        linkedHashMap.put("textFeedback", str4);
        linkedHashMap.put("punchTsInMillis", Long.valueOf(chaloRideFeedback.f));
        linkedHashMap.put("feedbackSubmittedTsMillis", Long.valueOf(chaloRideFeedback.g));
        linkedHashMap.put("bookingId", validationProduct3.getC());
        linkedHashMap.put("productType", ValidationProductKt.a(validationProduct3).d());
        linkedHashMap.put("productSubType", ValidationProductKt.a(validationProduct3).e());
        AnalyticsContractImplKt.b(chaloRideFeedbackCollectionHelper.f9094a, "ride feedback submitted", source, linkedHashMap, false, 24);
        this.this$0.E0(new wa(6));
        this.this$0.Q0();
        return unit;
    }
}

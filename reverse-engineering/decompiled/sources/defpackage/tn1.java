package defpackage;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import app.chalo.compose.components.UserSelfReviewComposableKt;
import app.chalo.compose.components.buttons.ChaloFilledButtonKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.usecase.FeedbackData;
import app.chalo.usecase.FeedbackTags;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tn1 implements Function3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19675a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tn1(int i, Object obj, Object obj2, Object obj3) {
        this.f19675a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f19675a) {
            case 0:
                FeedbackData feedbackData = (FeedbackData) this.b;
                List list = (List) this.c;
                Function1 function1 = (Function1) this.d;
                FlowRowScope FlowRow = (FlowRowScope) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                Intrinsics.i(FlowRow, "$this$FlowRow");
                int i = 0;
                if (composer.shouldExecute((iIntValue & 17) != 16, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2016657073, iIntValue, -1, "app.chalo.compose.components.UserReviewCardCollectionComposable.<anonymous>.<anonymous> (UserSelfReviewComposable.kt:85)");
                    }
                    for (Object obj4 : feedbackData.c) {
                        int i2 = i + 1;
                        if (i < 0) {
                            CollectionsKt.z0();
                            throw null;
                        }
                        FeedbackTags feedbackTags = (FeedbackTags) obj4;
                        String str = ((FeedbackTags) feedbackData.c.get(i)).b;
                        boolean zContains = list.contains(feedbackTags);
                        Modifier modifierM785paddingVpY3zN4 = PaddingKt.m785paddingVpY3zN4(Modifier.INSTANCE, ChaloTheme.b(composer, 6).d, ChaloTheme.b(composer, 6).d);
                        RoundedCornerShape roundedCornerShapeM1074RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m1074RoundedCornerShape0680j_4(ChaloTheme.b(composer, 6).i);
                        boolean zChanged = composer.changed(function1) | composer.changed(feedbackTags);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new cm1(8, function1, feedbackTags);
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Composer composer2 = composer;
                        ChaloFilledButtonKt.j(modifierM785paddingVpY3zN4, str, null, 0L, 0L, 0L, 0L, roundedCornerShapeM1074RoundedCornerShape0680j_4, 0.0f, zContains, null, (Function0) objRememberedValue, composer2, 0, 0, 1404);
                        composer = composer2;
                        i = i2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return Unit.f17538a;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.b;
                MutableState mutableState = (MutableState) this.c;
                MutableState mutableState2 = (MutableState) this.d;
                AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj;
                Composer composer3 = (Composer) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                Intrinsics.i(AnimatedVisibility, "$this$AnimatedVisibility");
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1339979773, iIntValue2, -1, "app.chalo.compose.components.bottomsheet.UserRatingBottomSheet.<anonymous>.<anonymous> (UserRatingBottomSheet.kt:96)");
                }
                FeedbackData feedbackData2 = (FeedbackData) mutableState.getValue();
                Object objRememberedValue2 = composer3.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new sh1(snapshotStateList, 27);
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                Function1 function2 = (Function1) objRememberedValue2;
                Object objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new xq0(mutableState2, 16);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                UserSelfReviewComposableKt.b(feedbackData2, snapshotStateList, function2, (Function1) objRememberedValue3, ((FeedbackData) mutableState.getValue()).d, false, composer3, 3504, 32);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.f17538a;
        }
    }
}

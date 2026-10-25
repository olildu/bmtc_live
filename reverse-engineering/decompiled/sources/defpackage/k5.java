package defpackage;

import androidx.compose.animation.AnimateBoundsModifierKt;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedBoundsNode;
import androidx.compose.animation.SharedTransitionDefaults;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.ui.geometry.Rect;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k5 implements BoundsTransform {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17465a;

    public /* synthetic */ k5(int i) {
        this.f17465a = i;
    }

    @Override // androidx.compose.animation.BoundsTransform
    public final FiniteAnimationSpec createAnimationSpec(Rect rect, Rect rect2) {
        switch (this.f17465a) {
            case 0:
                return AnimateBoundsModifierKt.DefaultBoundsTransform$lambda$0(rect, rect2);
            case 1:
                return SharedBoundsNode.approachPlaceMatchInTransition$lambda$0(rect, rect2);
            default:
                return SharedTransitionDefaults.BoundsTransform$lambda$0(rect, rect2);
        }
    }
}

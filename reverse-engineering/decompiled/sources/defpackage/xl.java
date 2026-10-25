package defpackage;

import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.WideNavigationRailKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.window.embedding.SplitAttributes;
import app.chalo.compose.components.buttons.ConfirmationState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20031a;
    public final /* synthetic */ float b;

    public /* synthetic */ xl(float f, int i) {
        this.f20031a = i;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f20031a) {
            case 0:
                DraggableAnchorsConfig DraggableAnchors = (DraggableAnchorsConfig) obj;
                Intrinsics.i(DraggableAnchors, "$this$DraggableAnchors");
                DraggableAnchors.at(ConfirmationState.DEFAULT, 0.0f);
                DraggableAnchors.at(ConfirmationState.CONFIRMED, this.b);
                return Unit.f17538a;
            case 1:
                return NavigationItemKt.placeAnimatedLabelAndIcon_2QYhCQ8$lambda$40$lambda$39(this.b, (GraphicsLayerScope) obj);
            case 2:
                return PaddingKt.padding_3ABfNKs$lambda$0(this.b, (InspectorInfo) obj);
            case 3:
                return Boolean.valueOf(SplitAttributes.SplitType.Companion.ratio$lambda$0(this.b, ((Float) obj).floatValue()));
            default:
                return WideNavigationRailKt.ModalWideNavigationRailContent_pU6N4AM$lambda$23$lambda$22$lambda$21(this.b, 0.0f, (androidx.compose.material3.internal.DraggableAnchorsConfig) obj);
        }
    }
}

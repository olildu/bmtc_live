package defpackage;

import androidx.compose.foundation.text.contextmenu.internal.PlatformDefaultTextContextMenuProviders_androidKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionContainerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import app.chalo.compose.webview.KWebView;
import coil3.compose.AsyncImagePainter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class xq0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20044a;
    public final /* synthetic */ MutableState b;

    public /* synthetic */ xq0(MutableState mutableState, int i) {
        this.f20044a = i;
        this.b = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it) {
        switch (this.f20044a) {
            case 0:
                LayoutCoordinates it2 = (LayoutCoordinates) it;
                Intrinsics.i(it2, "it");
                LayoutCoordinates parentCoordinates = it2.getParentCoordinates();
                this.b.setValue(Boolean.valueOf(Intrinsics.c(parentCoordinates != null ? Float.valueOf(Float.intBitsToFloat((int) (LayoutCoordinatesKt.positionInParent(parentCoordinates) & BodyPartID.bodyIdMax))) : null, 0.0f)));
                return Unit.f17538a;
            case 1:
                return PlatformDefaultTextContextMenuProviders_androidKt.ProvideBothDefaultProviders$lambda$4$0$0(this.b, (LayoutCoordinates) it);
            case 2:
                this.b.setValue(Dp.m7276boximpl(((Dp) it).m7292unboximpl()));
                return Unit.f17538a;
            case 3:
                Boolean bool = (Boolean) it;
                bool.booleanValue();
                this.b.setValue(bool);
                return Unit.f17538a;
            case 4:
                Boolean bool2 = (Boolean) it;
                bool2.booleanValue();
                this.b.setValue(bool2);
                return Unit.f17538a;
            case 5:
                if (((Boolean) it).booleanValue()) {
                    MutableState mutableState = this.b;
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        mutableState.setValue(Boolean.TRUE);
                    }
                }
                return Unit.f17538a;
            case 6:
                if (((Boolean) it).booleanValue()) {
                    MutableState mutableState2 = this.b;
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        mutableState2.setValue(Boolean.TRUE);
                    }
                }
                return Unit.f17538a;
            case 7:
                Intrinsics.i((AsyncImagePainter.State.Success) it, "it");
                this.b.setValue(Boolean.TRUE);
                return Unit.f17538a;
            case 8:
                Intrinsics.i((AsyncImagePainter.State.Success) it, "it");
                this.b.setValue(Boolean.TRUE);
                return Unit.f17538a;
            case 9:
                this.b.setValue(Dp.m7276boximpl(((Dp) it).m7292unboximpl()));
                return Unit.f17538a;
            case 10:
                Intrinsics.i((AsyncImagePainter.State.Error) it, "it");
                this.b.setValue(Boolean.TRUE);
                return Unit.f17538a;
            case 11:
                return SelectionContainerKt.SelectionContainer$lambda$3$0(this.b, (Selection) it);
            case 12:
                LayoutCoordinates it3 = (LayoutCoordinates) it;
                Intrinsics.i(it3, "it");
                this.b.setValue(IntSize.m7437boximpl(it3.mo5941getSizeYbymL2g()));
                return Unit.f17538a;
            case 13:
                Intrinsics.i(it, "it");
                this.b.setValue(it);
                return Unit.f17538a;
            case 14:
                Float f = (Float) it;
                f.floatValue();
                this.b.setValue(f);
                return Unit.f17538a;
            case 15:
                this.b.setValue((KWebView) it);
                return Unit.f17538a;
            default:
                String it4 = (String) it;
                Intrinsics.i(it4, "it");
                this.b.setValue(it4);
                return Unit.f17538a;
        }
    }
}

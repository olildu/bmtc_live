package defpackage;

import androidx.compose.foundation.text.input.internal.TextFieldCoreModifierNode;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19211a;
    public final /* synthetic */ TextFieldCoreModifierNode b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Placeable d;
    public final /* synthetic */ MeasureScope e;

    public /* synthetic */ rh1(TextFieldCoreModifierNode textFieldCoreModifierNode, int i, Placeable placeable, MeasureScope measureScope, int i2) {
        this.f19211a = i2;
        this.b = textFieldCoreModifierNode;
        this.c = i;
        this.d = placeable;
        this.e = measureScope;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19211a) {
            case 0:
                return TextFieldCoreModifierNode.measureHorizontalScroll_3p2s80s$lambda$0(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
            default:
                return TextFieldCoreModifierNode.measureVerticalScroll_3p2s80s$lambda$0(this.b, this.c, this.d, this.e, (Placeable.PlacementScope) obj);
        }
    }
}

package defpackage;

import androidx.compose.foundation.text.selection.SelectionManager_androidKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class p11 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18996a;
    public final /* synthetic */ Density b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ p11(MutableState mutableState, Density density) {
        this.f18996a = 10;
        this.c = mutableState;
        this.b = density;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18996a) {
            case 0:
                LayoutCoordinates it = (LayoutCoordinates) obj;
                Intrinsics.i(it, "it");
                if (Dp.m7277compareTo0680j_4(this.b.mo401toDpu2uoSUM((int) (it.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)), Dp.m7278constructorimpl(0)) > 0) {
                    this.c.setValue(Boolean.TRUE);
                }
                return Unit.f17538a;
            case 1:
                LayoutCoordinates it2 = (LayoutCoordinates) obj;
                Intrinsics.i(it2, "it");
                gf.q(this.c, this.b, (int) (it2.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
            case 2:
                LayoutCoordinates it3 = (LayoutCoordinates) obj;
                Intrinsics.i(it3, "it");
                gf.q(this.c, this.b, (int) (it3.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
            case 3:
                LayoutCoordinates it4 = (LayoutCoordinates) obj;
                Intrinsics.i(it4, "it");
                gf.q(this.c, this.b, (int) (it4.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
            case 4:
                LayoutCoordinates it5 = (LayoutCoordinates) obj;
                Intrinsics.i(it5, "it");
                gf.q(this.c, this.b, (int) (it5.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
            case 5:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0$1(this.b, this.c, (DpSize) obj);
            case 6:
                return SelectionManager_androidKt.selectionMagnifier$lambda$0$4$0(this.b, this.c, (Function0) obj);
            case 7:
                LayoutCoordinates it6 = (LayoutCoordinates) obj;
                Intrinsics.i(it6, "it");
                gf.q(this.c, this.b, (int) (it6.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
            case 8:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0(this.b, this.c, (Function0) obj);
            case 9:
                return TextFieldSelectionManager_androidKt.textFieldMagnifier$lambda$0$4$0$1(this.b, this.c, (DpSize) obj);
            default:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                Intrinsics.i(coordinates, "coordinates");
                gf.q(this.c, this.b, (int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax));
                return Unit.f17538a;
        }
    }

    public /* synthetic */ p11(Density density, MutableState mutableState, int i) {
        this.f18996a = i;
        this.b = density;
        this.c = mutableState;
    }
}

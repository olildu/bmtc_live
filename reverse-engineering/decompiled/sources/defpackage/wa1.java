package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wa1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19910a;
    public final /* synthetic */ MutableState b;
    public final /* synthetic */ MutableState c;
    public final /* synthetic */ MutableState d;
    public final /* synthetic */ MutableState e;

    public /* synthetic */ wa1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, int i) {
        this.f19910a = i;
        this.b = mutableState;
        this.c = mutableState2;
        this.d = mutableState3;
        this.e = mutableState4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutCoordinates it = (LayoutCoordinates) obj;
        switch (this.f19910a) {
            case 0:
                Intrinsics.i(it, "it");
                this.b.setValue(Offset.m4354boximpl(it.mo5946localToWindowMKHz9U(Offset.INSTANCE.m4381getZeroF1C5BW0())));
                this.c.setValue(IntSize.m7437boximpl(it.mo5941getSizeYbymL2g()));
                if (!IntSize.m7443equalsimpl0(((IntSize) this.d.getValue()).m7449unboximpl(), IntSize.INSTANCE.m7450getZeroYbymL2g())) {
                    this.e.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                Intrinsics.i(it, "it");
                Offset.Companion companion = Offset.INSTANCE;
                this.b.setValue(Offset.m4354boximpl(it.mo5946localToWindowMKHz9U(companion.m4381getZeroF1C5BW0())));
                this.c.setValue(IntSize.m7437boximpl(it.mo5941getSizeYbymL2g()));
                if (!Offset.m4362equalsimpl0(((Offset) this.d.getValue()).m4375unboximpl(), companion.m4381getZeroF1C5BW0())) {
                    MutableState mutableState = this.e;
                    if (!((Boolean) mutableState.getValue()).booleanValue()) {
                        mutableState.setValue(Boolean.TRUE);
                    }
                }
                break;
            case 2:
                Intrinsics.i(it, "it");
                this.b.setValue(Offset.m4354boximpl(it.mo5946localToWindowMKHz9U(Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(((int) (it.mo5941getSizeYbymL2g() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(((int) (it.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax)) / 2.0f)) & BodyPartID.bodyIdMax)))));
                this.c.setValue(IntSize.m7437boximpl(it.mo5941getSizeYbymL2g()));
                if (!Offset.m4362equalsimpl0(((Offset) this.d.getValue()).m4375unboximpl(), Offset.INSTANCE.m4381getZeroF1C5BW0())) {
                    MutableState mutableState2 = this.e;
                    if (!((Boolean) mutableState2.getValue()).booleanValue()) {
                        mutableState2.setValue(Boolean.TRUE);
                    }
                }
                break;
            default:
                Intrinsics.i(it, "it");
                Offset.Companion companion2 = Offset.INSTANCE;
                this.b.setValue(Offset.m4354boximpl(it.mo5946localToWindowMKHz9U(companion2.m4381getZeroF1C5BW0())));
                this.c.setValue(IntSize.m7437boximpl(it.mo5941getSizeYbymL2g()));
                if (!Offset.m4362equalsimpl0(((Offset) this.d.getValue()).m4375unboximpl(), companion2.m4381getZeroF1C5BW0())) {
                    this.e.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f17538a;
    }
}

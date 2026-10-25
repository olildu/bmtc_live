package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.layout.LayoutCoordinates;
import app.chalo.ads.NativeInlineAdTelemetry;
import com.google.android.gms.ads.nativead.NativeAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17417a;
    public final /* synthetic */ NativeAd b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ jl0(NativeAd nativeAd, MutableState mutableState, int i) {
        this.f17417a = i;
        this.b = nativeAd;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17417a) {
            case 0:
                LayoutCoordinates coordinates = (LayoutCoordinates) obj;
                Intrinsics.i(coordinates, "coordinates");
                int iMo5941getSizeYbymL2g = (int) (coordinates.mo5941getSizeYbymL2g() >> 32);
                int iMo5941getSizeYbymL2g2 = (int) (coordinates.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax);
                MutableState mutableState = this.c;
                Integer num = (Integer) mutableState.getValue();
                StringBuilder sbS = uf0.s(iMo5941getSizeYbymL2g, iMo5941getSizeYbymL2g2, "width=", " height=", " stableWidthPx=");
                sbS.append(num);
                String string = sbS.toString();
                NativeAd nativeAd = this.b;
                NativeInlineAdTelemetry.a("template_positioned", null, null, null, "hero", nativeAd, string, 29);
                if (((Integer) mutableState.getValue()) == null && ((int) (coordinates.mo5941getSizeYbymL2g() >> 32)) > 0) {
                    NativeInlineAdTelemetry.a("template_stable_width_set", null, null, null, "hero", nativeAd, vo1.j((int) (coordinates.mo5941getSizeYbymL2g() >> 32), "stableWidthPx="), 29);
                    mutableState.setValue(Integer.valueOf((int) (coordinates.mo5941getSizeYbymL2g() >> 32)));
                }
                break;
            default:
                LayoutCoordinates coordinates2 = (LayoutCoordinates) obj;
                Intrinsics.i(coordinates2, "coordinates");
                int iMo5941getSizeYbymL2g3 = (int) (coordinates2.mo5941getSizeYbymL2g() >> 32);
                int iMo5941getSizeYbymL2g4 = (int) (coordinates2.mo5941getSizeYbymL2g() & BodyPartID.bodyIdMax);
                MutableState mutableState2 = this.c;
                Integer num2 = (Integer) mutableState2.getValue();
                StringBuilder sbS2 = uf0.s(iMo5941getSizeYbymL2g3, iMo5941getSizeYbymL2g4, "width=", " height=", " stableWidthPx=");
                sbS2.append(num2);
                String string2 = sbS2.toString();
                NativeAd nativeAd2 = this.b;
                NativeInlineAdTelemetry.a("template_positioned", null, null, null, "card", nativeAd2, string2, 29);
                if (((Integer) mutableState2.getValue()) == null && ((int) (coordinates2.mo5941getSizeYbymL2g() >> 32)) > 0) {
                    NativeInlineAdTelemetry.a("template_stable_width_set", null, null, null, "card", nativeAd2, vo1.j((int) (coordinates2.mo5941getSizeYbymL2g() >> 32), "stableWidthPx="), 29);
                    mutableState2.setValue(Integer.valueOf((int) (coordinates2.mo5941getSizeYbymL2g() >> 32)));
                }
                break;
        }
        return Unit.f17538a;
    }
}

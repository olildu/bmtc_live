package defpackage;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jh0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17406a = 1;
    public final /* synthetic */ MarkerState b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ String e;
    public final /* synthetic */ BitmapDescriptor f;
    public final /* synthetic */ long g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ float i;
    public final /* synthetic */ Function1 j;
    public final /* synthetic */ Function1 k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ Function1 m;
    public final /* synthetic */ Function3 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ jh0(MarkerState markerState, float f, long j, String str, BitmapDescriptor bitmapDescriptor, long j2, boolean z, float f2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function3 function5, int i, int i2) {
        this.b = markerState;
        this.c = f;
        this.d = j;
        this.e = str;
        this.f = bitmapDescriptor;
        this.g = j2;
        this.h = z;
        this.i = f2;
        this.j = function1;
        this.k = function2;
        this.l = function3;
        this.m = function4;
        this.n = function5;
        this.o = i;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f17406a) {
            case 0:
                ((Integer) obj2).getClass();
                MarkerKt.a(this.c, this.i, RecomposeScopeImplKt.updateChangedFlags(this.o | 1), RecomposeScopeImplKt.updateChangedFlags(this.p), this.d, this.g, composer, this.f, this.b, this.e, this.j, this.k, this.l, this.m, this.n, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                MarkerKt.b(this.c, this.i, RecomposeScopeImplKt.updateChangedFlags(this.o | 1), RecomposeScopeImplKt.updateChangedFlags(this.p), this.d, this.g, composer, this.f, this.b, this.e, this.j, this.k, this.l, this.m, this.n, this.h);
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ jh0(MarkerState markerState, String str, float f, long j, BitmapDescriptor bitmapDescriptor, long j2, boolean z, float f2, Function1 function1, Function1 function2, Function1 function3, Function1 function4, Function3 function5, int i, int i2) {
        this.b = markerState;
        this.e = str;
        this.c = f;
        this.d = j;
        this.f = bitmapDescriptor;
        this.g = j2;
        this.h = z;
        this.i = f2;
        this.j = function1;
        this.k = function2;
        this.l = function3;
        this.m = function4;
        this.n = function5;
        this.o = i;
        this.p = i2;
    }
}

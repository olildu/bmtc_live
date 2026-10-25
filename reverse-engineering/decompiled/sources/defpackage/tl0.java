package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationItemKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tl0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19669a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Placeable h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ tl0(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6) {
        this.f19669a = 1;
        this.b = placeable;
        this.c = i;
        this.d = i2;
        this.e = placeable2;
        this.f = i3;
        this.g = i4;
        this.h = placeable3;
        this.i = i5;
        this.j = i6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f19669a) {
            case 0:
                Placeable placeable = this.b;
                int i = this.c;
                int i2 = this.d;
                Placeable placeable2 = this.e;
                int i3 = this.f;
                int i4 = this.g;
                return NavigationBarKt.placeIcon_X9ElhV4$lambda$25(placeable, placeable2, i, i2, this.h, i3, i4, this.i, this.j, (Placeable.PlacementScope) obj);
            case 1:
                return NavigationItemKt.placeIcon_X9ElhV4$lambda$36(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, (Placeable.PlacementScope) obj);
            default:
                Placeable placeable3 = this.b;
                int i5 = this.c;
                int i6 = this.d;
                Placeable placeable4 = this.e;
                int i7 = this.f;
                int i8 = this.g;
                return NavigationRailKt.placeIcon_X9ElhV4$lambda$20(placeable3, placeable4, i5, i6, this.h, i7, i8, this.i, this.j, (Placeable.PlacementScope) obj);
        }
    }

    public /* synthetic */ tl0(Placeable placeable, Placeable placeable2, int i, int i2, Placeable placeable3, int i3, int i4, int i5, int i6, int i7) {
        this.f19669a = i7;
        this.b = placeable;
        this.e = placeable2;
        this.c = i;
        this.d = i2;
        this.h = placeable3;
        this.f = i3;
        this.g = i4;
        this.i = i5;
        this.j = i6;
    }
}

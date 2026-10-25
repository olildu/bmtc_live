package defpackage;

import androidx.compose.material3.NavigationItemKt;
import androidx.compose.ui.layout.Placeable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class am0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f301a;
    public final /* synthetic */ Placeable b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Placeable e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Placeable h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Placeable k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ am0(Placeable placeable, int i, int i2, Placeable placeable2, int i3, int i4, Placeable placeable3, int i5, int i6, Placeable placeable4, int i7, int i8, int i9) {
        this.f301a = i9;
        this.b = placeable;
        this.c = i;
        this.d = i2;
        this.e = placeable2;
        this.f = i3;
        this.g = i4;
        this.h = placeable3;
        this.i = i5;
        this.j = i6;
        this.k = placeable4;
        this.l = i7;
        this.m = i8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f301a) {
            case 0:
                return NavigationItemKt.placeLabelAndTopIcon_qoqLrGI$lambda$37(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Placeable.PlacementScope) obj);
            default:
                return NavigationItemKt.placeLabelAndStartIcon_nru01g4$lambda$38(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Placeable.PlacementScope) obj);
        }
    }
}

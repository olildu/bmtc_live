package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uo implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19764a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Modifier d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ ChipColors h;
    public final /* synthetic */ ChipElevation i;
    public final /* synthetic */ BorderStroke j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ uo(Function0 function0, Function2 function2, Modifier modifier, boolean z, Function2 function3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.f19764a = i3;
        this.b = function0;
        this.c = function2;
        this.d = modifier;
        this.e = z;
        this.f = function3;
        this.g = shape;
        this.h = chipColors;
        this.i = chipElevation;
        this.j = borderStroke;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        switch (this.f19764a) {
            case 0:
                return ChipKt.SuggestionChip$lambda$9(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, ((Integer) obj2).intValue());
            default:
                return ChipKt.ElevatedSuggestionChip$lambda$12(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, composer, ((Integer) obj2).intValue());
        }
    }
}

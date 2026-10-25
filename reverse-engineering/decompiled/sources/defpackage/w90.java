package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w90 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19906a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Modifier c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Shape e;
    public final /* synthetic */ IconButtonColors f;
    public final /* synthetic */ MutableInteractionSource g;
    public final /* synthetic */ Function2 h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;

    public /* synthetic */ w90(Function0 function0, Modifier modifier, boolean z, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Shape shape, Function2 function2, int i, int i2) {
        this.f19906a = 0;
        this.b = function0;
        this.c = modifier;
        this.d = z;
        this.f = iconButtonColors;
        this.g = mutableInteractionSource;
        this.e = shape;
        this.h = function2;
        this.i = i;
        this.j = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19906a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return IconButtonKt.IconButton$lambda$1(this.b, this.c, this.d, this.f, this.g, this.e, this.h, this.i, this.j, (Composer) obj, iIntValue);
            case 1:
                int iIntValue2 = ((Integer) obj2).intValue();
                Function0 function0 = this.b;
                Modifier modifier = this.c;
                boolean z = this.d;
                IconButtonColors iconButtonColors = this.f;
                MutableInteractionSource mutableInteractionSource = this.g;
                return IconButtonKt.FilledIconButton$lambda$10(function0, modifier, z, this.e, iconButtonColors, mutableInteractionSource, this.h, this.i, this.j, (Composer) obj, iIntValue2);
            default:
                int iIntValue3 = ((Integer) obj2).intValue();
                Function0 function1 = this.b;
                Modifier modifier2 = this.c;
                boolean z2 = this.d;
                IconButtonColors iconButtonColors2 = this.f;
                MutableInteractionSource mutableInteractionSource2 = this.g;
                return IconButtonKt.FilledTonalIconButton$lambda$14(function1, modifier2, z2, this.e, iconButtonColors2, mutableInteractionSource2, this.h, this.i, this.j, (Composer) obj, iIntValue3);
        }
    }

    public /* synthetic */ w90(Function0 function0, Modifier modifier, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, Function2 function2, int i, int i2, int i3) {
        this.f19906a = i3;
        this.b = function0;
        this.c = modifier;
        this.d = z;
        this.e = shape;
        this.f = iconButtonColors;
        this.g = mutableInteractionSource;
        this.h = function2;
        this.i = i;
        this.j = i2;
    }
}

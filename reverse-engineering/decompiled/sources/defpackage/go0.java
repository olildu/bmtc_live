package defpackage;

import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material3.OutlinedTextFieldDefaults;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class go0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15752a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ InteractionSource d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ TextFieldColors f;
    public final /* synthetic */ Shape g;
    public final /* synthetic */ float h;
    public final /* synthetic */ float i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ Object l;

    public /* synthetic */ go0(Object obj, boolean z, boolean z2, InteractionSource interactionSource, Modifier modifier, TextFieldColors textFieldColors, Shape shape, float f, float f2, int i, int i2, int i3) {
        this.f15752a = i3;
        this.l = obj;
        this.b = z;
        this.c = z2;
        this.d = interactionSource;
        this.e = modifier;
        this.f = textFieldColors;
        this.g = shape;
        this.h = f;
        this.i = f2;
        this.j = i;
        this.k = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15752a) {
            case 0:
                return OutlinedTextFieldDefaults.Container_4EFweAY$lambda$0((OutlinedTextFieldDefaults) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return TextFieldDefaults.Container_4EFweAY$lambda$0((TextFieldDefaults) this.l, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}

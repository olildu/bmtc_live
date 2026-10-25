package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.OutputTransformation;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SearchBarState;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import app.chalo.home.ui.common.TabHeaderKt;
import app.chalo.home.ui.profile.ProfileDrawerCardData;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.homescreen.data.model.app.TabMetaDataAppModel;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t51 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19630a = 0;
    public final /* synthetic */ Modifier b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Function o;
    public final /* synthetic */ Function p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ t51(SearchBarDefaults searchBarDefaults, TextFieldState textFieldState, SearchBarState searchBarState, Function1 function1, Modifier modifier, boolean z, boolean z2, TextStyle textStyle, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function2 function6, InputTransformation inputTransformation, OutputTransformation outputTransformation, ScrollState scrollState, Shape shape, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.k = searchBarDefaults;
        this.l = textFieldState;
        this.m = searchBarState;
        this.c = function1;
        this.b = modifier;
        this.d = z;
        this.e = z2;
        this.n = textStyle;
        this.f = function2;
        this.g = function3;
        this.o = function4;
        this.p = function5;
        this.q = function6;
        this.r = inputTransformation;
        this.s = outputTransformation;
        this.t = scrollState;
        this.u = shape;
        this.v = textFieldColors;
        this.w = mutableInteractionSource;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19630a) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return SearchBarDefaults.InputField$lambda$20((SearchBarDefaults) this.k, (TextFieldState) this.l, (SearchBarState) this.m, this.c, this.b, this.d, this.e, (TextStyle) this.n, this.f, this.g, (Function2) this.o, (Function2) this.p, (Function2) this.q, (InputTransformation) this.r, (OutputTransformation) this.s, (ScrollState) this.t, (Shape) this.u, (TextFieldColors) this.v, (MutableInteractionSource) this.w, this.h, this.i, this.j, (Composer) obj, iIntValue);
            default:
                ((Integer) obj2).getClass();
                int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                int iUpdateChangedFlags2 = RecomposeScopeImplKt.updateChangedFlags(this.i);
                TabHeaderKt.f(this.b, (TabMetaDataAppModel) this.k, (Function0) this.l, (Function0) this.m, (Function0) this.n, this.c, (Function0) this.o, (Function0) this.p, (String) this.q, this.d, (ProfileDrawerCardData) this.r, this.e, this.f, (List) this.s, (RegularBusPageDisplayItemData) this.t, (Function0) this.u, (Function0) this.v, (List) this.w, this.g, (Composer) obj, iUpdateChangedFlags, iUpdateChangedFlags2, this.j);
                return Unit.f17538a;
        }
    }

    public /* synthetic */ t51(Modifier modifier, TabMetaDataAppModel tabMetaDataAppModel, Function0 function0, Function0 function1, Function0 function2, Function1 function3, Function0 function4, Function0 function5, String str, boolean z, ProfileDrawerCardData profileDrawerCardData, boolean z2, Function2 function6, List list, RegularBusPageDisplayItemData regularBusPageDisplayItemData, Function0 function7, Function0 function8, List list2, Function2 function9, int i, int i2, int i3) {
        this.b = modifier;
        this.k = tabMetaDataAppModel;
        this.l = function0;
        this.m = function1;
        this.n = function2;
        this.c = function3;
        this.o = function4;
        this.p = function5;
        this.q = str;
        this.d = z;
        this.r = profileDrawerCardData;
        this.e = z2;
        this.f = function6;
        this.s = list;
        this.t = regularBusPageDisplayItemData;
        this.u = function7;
        this.v = function8;
        this.w = list2;
        this.g = function9;
        this.h = i;
        this.i = i2;
        this.j = i3;
    }
}

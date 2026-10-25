package app.chalo.utils;

import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImplKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import defpackage.h81;
import defpackage.j81;
import defpackage.k81;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class SheetDefaultsHelperKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10439a = Dp.m7278constructorimpl(56);
    public static final float b = Dp.m7278constructorimpl(ComposerImplKt.nodeKey);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final SheetState a(boolean z, Function1 function1, SheetValue sheetValue, boolean z2, Composer composer, int i, int i2) {
        boolean z3 = (i2 & 1) != 0 ? false : z;
        if ((i2 & 2) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new h81(18);
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
        }
        Function1 function2 = function1;
        boolean z4 = (i2 & 8) != 0 ? false : z2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(730981538, i, -1, "app.chalo.utils.rememberStandardBottomSheetState (SheetDefaultsHelper.kt:27)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        boolean zChanged = composer.changed(density);
        float f = f10439a;
        boolean zChanged2 = zChanged | composer.changed(f);
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new j81(density, f, 0);
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function0 function0 = (Function0) objRememberedValue2;
        boolean zChanged3 = composer.changed(density);
        float f2 = b;
        boolean zChanged4 = zChanged3 | composer.changed(f2);
        Object objRememberedValue3 = composer.rememberedValue();
        boolean z5 = true;
        if (zChanged4 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new j81(density, f2, 1);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function0 function3 = (Function0) objRememberedValue3;
        Object[] objArr = {Boolean.valueOf(z3), function2, Boolean.valueOf(z4)};
        Saver<SheetState, SheetValue> Saver = SheetState.INSTANCE.Saver(z3, function0, function3, function2, z4);
        boolean zChanged5 = ((((i & 14) ^ 6) > 4 && composer.changed(z3)) || (i & 6) == 4) | composer.changed(function0) | composer.changed(function3) | ((((i & 896) ^ 384) > 256 && composer.changed(sheetValue.ordinal())) || (i & 384) == 256) | composer.changed(function2);
        if ((((i & 7168) ^ 3072) <= 2048 || !composer.changed(z4)) && (i & 3072) != 2048) {
            z5 = false;
        }
        boolean z6 = zChanged5 | z5;
        Object objRememberedValue4 = composer.rememberedValue();
        if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            Object k81Var = new k81(z3, function0, function3, sheetValue, function2, z4, 0);
            composer.updateRememberedValue(k81Var);
            objRememberedValue4 = k81Var;
        }
        SheetState sheetState = (SheetState) RememberSaveableKt.m4084rememberSaveable(objArr, (Saver) Saver, (Function0) objRememberedValue4, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetState;
    }
}

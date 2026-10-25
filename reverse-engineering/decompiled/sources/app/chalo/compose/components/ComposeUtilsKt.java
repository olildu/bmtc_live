package app.chalo.compose.components;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.IndicationNodeFactory;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import app.chalo.compose.resources.PainterResourceHelperKt;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.base.UiEventHandler;
import defpackage.c6;
import defpackage.ei;
import defpackage.ln;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.compose.resources.DrawableResource;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ComposeUtilsKt {
    public static final void a(AnnotatedString.Builder builder) {
        InlineTextContentKt.appendInlineContent$default(builder, String.valueOf(0), null, 2, null);
    }

    public static final Modifier b(Modifier modifier, UiEventHandler uiEventHandler, Composer composer, int i, int i2) {
        Intrinsics.i(modifier, "<this>");
        MutableInteractionSource mutableInteractionSourceB = RippleEffectKt.b(composer);
        IndicationNodeFactory indicationNodeFactoryA = (i2 & 4) != 0 ? RippleEffectKt.a(composer) : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-288038512, i, -1, "app.chalo.compose.components.clickable (ComposeUtils.kt:143)");
        }
        boolean z = true;
        boolean z2 = uiEventHandler != null;
        if ((((i & 112) ^ 48) <= 32 || !composer.changedInstance(uiEventHandler)) && (i & 48) != 32) {
            z = false;
        }
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new ei(uiEventHandler, 2);
            composer.updateRememberedValue(objRememberedValue);
        }
        Modifier modifierM295clickableO2vRcR0$default = ClickableKt.m295clickableO2vRcR0$default(modifier, mutableInteractionSourceB, indicationNodeFactoryA, z2, null, null, (Function0) objRememberedValue, 24, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return modifierM295clickableO2vRcR0$default;
    }

    public static Modifier c(Modifier modifier, Function0 condition, Function1 whenTrue) {
        Intrinsics.i(modifier, "<this>");
        Intrinsics.i(condition, "condition");
        Intrinsics.i(whenTrue, "whenTrue");
        if (((Boolean) condition.invoke()).booleanValue()) {
            return modifier.then((Modifier) whenTrue.invoke(Modifier.INSTANCE));
        }
        Modifier.Companion companion = Modifier.INSTANCE;
        Intrinsics.i(companion, "<this>");
        return modifier.then(companion);
    }

    public static Modifier d(Modifier.Companion dottedUnderline, long j) {
        float fM7278constructorimpl = Dp.m7278constructorimpl(1);
        float fM7278constructorimpl2 = Dp.m7278constructorimpl(3);
        Intrinsics.i(dottedUnderline, "$this$dottedUnderline");
        return DrawModifierKt.drawBehind(dottedUnderline, new ln(fM7278constructorimpl, fM7278constructorimpl2, j, 1));
    }

    public static final LinkedHashMap e(Modifier.Companion companion, List list) {
        Intrinsics.i(companion, "<this>");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            DrawableResource drawableResourceB = PainterResourceHelperKt.b((IconType) it.next());
            if (drawableResourceB != null) {
                arrayList.add(drawableResourceB);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                CollectionsKt.z0();
                throw null;
            }
            linkedHashMap.put(String.valueOf(i), new InlineTextContent(new Placeholder(TextUnitKt.getSp(30), TextUnitKt.getSp(30), PlaceholderVerticalAlign.INSTANCE.m6665getTextCenterJ6kI3mc(), null), ComposableLambdaKt.composableLambdaInstance(1633199017, true, new c6((DrawableResource) obj, 16))));
            i = i3;
        }
        return linkedHashMap;
    }
}

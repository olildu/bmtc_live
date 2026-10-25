package app.chalo.compose.components.textfields;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.compose.components.textfields.ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1", f = "ChaloExpandingText.kt", l = {}, m = "invokeSuspend", v = 1)
final class ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-graphics-Color$-expandCtaColor$0, reason: not valid java name */
    final /* synthetic */ long f126$$v$c$androidxcomposeuigraphicsColor$expandCtaColor$0;

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-graphics-Color$-textColor$0, reason: not valid java name */
    final /* synthetic */ long f127$$v$c$androidxcomposeuigraphicsColor$textColor$0;
    final /* synthetic */ TextStyle $expandCtaStyle;
    final /* synthetic */ String $expandCtaText;
    final /* synthetic */ MutableState<AnnotatedString> $finalText$delegate;
    final /* synthetic */ MutableState<Boolean> $isClickable$delegate;
    final /* synthetic */ MutableState<Boolean> $isExpanded$delegate;
    final /* synthetic */ int $minimizedMaxLines;
    final /* synthetic */ String $text;
    final /* synthetic */ TextLayoutResult $textLayoutResult;
    final /* synthetic */ TextStyle $textStyle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(TextLayoutResult textLayoutResult, int i, String str, String str2, MutableState mutableState, TextStyle textStyle, long j, TextStyle textStyle2, long j2, MutableState mutableState2, MutableState mutableState3, Continuation continuation) {
        super(2, continuation);
        this.$textLayoutResult = textLayoutResult;
        this.$minimizedMaxLines = i;
        this.$expandCtaText = str;
        this.$text = str2;
        this.$isExpanded$delegate = mutableState;
        this.$textStyle = textStyle;
        this.f127$$v$c$androidxcomposeuigraphicsColor$textColor$0 = j;
        this.$expandCtaStyle = textStyle2;
        this.f126$$v$c$androidxcomposeuigraphicsColor$expandCtaColor$0 = j2;
        this.$finalText$delegate = mutableState2;
        this.$isClickable$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1(this.$textLayoutResult, this.$minimizedMaxLines, this.$expandCtaText, this.$text, this.$isExpanded$delegate, this.$textStyle, this.f127$$v$c$androidxcomposeuigraphicsColor$textColor$0, this.$expandCtaStyle, this.f126$$v$c$androidxcomposeuigraphicsColor$expandCtaColor$0, this.$finalText$delegate, this.$isClickable$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1 = (ChaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1) create((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.f17538a;
        chaloExpandingTextKt$ChaloTextWithCustomShowMoreClick$1$1.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String strSubstring;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.b(obj);
        TextLayoutResult textLayoutResult = this.$textLayoutResult;
        Unit unit = Unit.f17538a;
        if (textLayoutResult == null || this.$isExpanded$delegate.getValue().booleanValue() || !this.$textLayoutResult.getHasVisualOverflow()) {
            return unit;
        }
        int lineEnd$default = TextLayoutResult.getLineEnd$default(this.$textLayoutResult, this.$minimizedMaxLines - 1, false, 2, null);
        String strM = vo1.m("... ", this.$expandCtaText);
        String strSubstring2 = this.$text.substring(0, lineEnd$default);
        Intrinsics.h(strSubstring2, "substring(...)");
        String strS = StringsKt.s(strM.length(), strSubstring2);
        int iZ = StringsKt.z(strS);
        while (true) {
            if (-1 >= iZ) {
                strSubstring = "";
                break;
            }
            char cCharAt = strS.charAt(iZ);
            if (cCharAt != ' ' && cCharAt != '.') {
                strSubstring = strS.substring(0, iZ + 1);
                Intrinsics.h(strSubstring, "substring(...)");
                break;
            }
            iZ--;
        }
        MutableState<AnnotatedString> mutableState = this.$finalText$delegate;
        TextStyle textStyle = this.$textStyle;
        long j = this.f127$$v$c$androidxcomposeuigraphicsColor$textColor$0;
        TextStyle textStyle2 = this.$expandCtaStyle;
        long j2 = this.f126$$v$c$androidxcomposeuigraphicsColor$expandCtaColor$0;
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        SpanStyle spanStyle = textStyle.toSpanStyle();
        FontWeight.Companion companion = FontWeight.INSTANCE;
        int iPushStyle = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(spanStyle, j, 0L, companion.getNormal(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
        try {
            builder.append(strSubstring);
            builder.pop(iPushStyle);
            int iPushStyle2 = builder.pushStyle(SpanStyle.m6672copyGSF8kmg$default(textStyle2.toSpanStyle(), j2, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, null, 65530, null));
            try {
                builder.append(strM);
                builder.pop(iPushStyle2);
                mutableState.setValue(builder.toAnnotatedString());
                this.$isClickable$delegate.setValue(Boolean.TRUE);
                return unit;
            } catch (Throwable th) {
                builder.pop(iPushStyle2);
                throw th;
            }
        } catch (Throwable th2) {
            builder.pop(iPushStyle);
            throw th2;
        }
    }
}

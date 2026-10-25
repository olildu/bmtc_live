package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.SaversKt;
import androidx.compose.ui.text.Savers_androidKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLinkStyles;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class w41 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19892a;

    public /* synthetic */ w41(int i) {
        this.f19892a = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SaverScope saverScope = (SaverScope) obj;
        switch (this.f19892a) {
            case 0:
                return SaversKt.AnnotationRangeListSaver$lambda$0(saverScope, (List) obj2);
            case 1:
                return SaversKt.TextRangeSaver$lambda$0(saverScope, (TextRange) obj2);
            case 2:
                return SaversKt.ShadowSaver$lambda$0(saverScope, (Shadow) obj2);
            case 3:
                return SaversKt.TextAlignSaver$lambda$0(saverScope, (TextAlign) obj2);
            case 4:
                return SaversKt.TextDirectionSaver$lambda$0(saverScope, (TextDirection) obj2);
            case 5:
                return SaversKt.HyphensSaver$lambda$0(saverScope, (Hyphens) obj2);
            case 6:
                return SaversKt.FontStyleSaver$lambda$0(saverScope, (FontStyle) obj2);
            case 7:
                return SaversKt.FontSynthesisSaver$lambda$0(saverScope, (FontSynthesis) obj2);
            case 8:
                return SaversKt.TextUnitSaver$lambda$0(saverScope, (TextUnit) obj2);
            case 9:
                return SaversKt.ClickableSaver$lambda$0(saverScope, (LinkAnnotation.Clickable) obj2);
            case 10:
                return SaversKt.TextUnitTypeSaver$lambda$0(saverScope, (TextUnitType) obj2);
            case 11:
                return SaversKt.OffsetSaver$lambda$0(saverScope, (Offset) obj2);
            case 12:
                return SaversKt.AnnotationRangeSaver$lambda$0(saverScope, (AnnotatedString.Range) obj2);
            case 13:
                return SaversKt.LocaleListSaver$lambda$0(saverScope, (LocaleList) obj2);
            case 14:
                return SaversKt.LocaleSaver$lambda$0(saverScope, (Locale) obj2);
            case 15:
                return SaversKt.LineHeightStyleSaver$lambda$0(saverScope, (LineHeightStyle) obj2);
            case 16:
                return SaversKt.LineHeightStyleAlignmentSaver$lambda$0(saverScope, (LineHeightStyle.Alignment) obj2);
            case 17:
                return SaversKt.LineHeightStyleTrimSaver$lambda$0(saverScope, (LineHeightStyle.Trim) obj2);
            case 18:
                return SaversKt.LineHeightStyleModeSaver$lambda$0(saverScope, (LineHeightStyle.Mode) obj2);
            case 19:
                return SaversKt.VerbatimTtsAnnotationSaver$lambda$0(saverScope, (VerbatimTtsAnnotation) obj2);
            case 20:
                return SaversKt.ParagraphStyleSaver$lambda$0(saverScope, (ParagraphStyle) obj2);
            case 21:
                return SaversKt.UrlAnnotationSaver$lambda$0(saverScope, (UrlAnnotation) obj2);
            case 22:
                return SaversKt.SpanStyleSaver$lambda$0(saverScope, (SpanStyle) obj2);
            case 23:
                return SaversKt.TextLinkStylesSaver$lambda$0(saverScope, (TextLinkStyles) obj2);
            case 24:
                return Savers_androidKt.PlatformParagraphStyleSaver$lambda$0(saverScope, (PlatformParagraphStyle) obj2);
            case 25:
                return Savers_androidKt.emojiSupportMatchSaver$lambda$0(saverScope, (EmojiSupportMatch) obj2);
            case 26:
                return Savers_androidKt.LineBreakSaver$lambda$0(saverScope, (LineBreak) obj2);
            case 27:
                return Savers_androidKt.TextMotionSaver$lambda$0(saverScope, (TextMotion) obj2);
            case 28:
                return Savers_androidKt.TextMotionLinearitySaver$lambda$0(saverScope, (TextMotion.Linearity) obj2);
            default:
                return ScrollState.Saver$lambda$0(saverScope, (ScrollState) obj2);
        }
    }
}

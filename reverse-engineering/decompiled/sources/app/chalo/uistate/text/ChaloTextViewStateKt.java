package app.chalo.uistate.text;

import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import app.chalo.utils.HtmlTextStyling;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloTextViewStateKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10079a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;
        public static final /* synthetic */ int[] f;

        static {
            int[] iArr = new int[UITextDecoration.values().length];
            try {
                iArr[UITextDecoration.None.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UITextDecoration.Underline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UITextDecoration.LineThrough.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10079a = iArr;
            int[] iArr2 = new int[UITextOverflow.values().length];
            try {
                iArr2[UITextOverflow.Clip.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UITextOverflow.Ellipsis.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            b = iArr2;
            int[] iArr3 = new int[UITextAlign.values().length];
            try {
                iArr3[UITextAlign.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[UITextAlign.Center.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[UITextAlign.Right.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[UITextAlign.Justify.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            c = iArr3;
            int[] iArr4 = new int[UIFontWeight.values().length];
            try {
                iArr4[UIFontWeight.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[UIFontWeight.SemiBold.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[UIFontWeight.Bold.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            d = iArr4;
            int[] iArr5 = new int[UIFontStyle.values().length];
            try {
                iArr5[UIFontStyle.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr5[UIFontStyle.Italic.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            e = iArr5;
            int[] iArr6 = new int[HtmlTextStyling.values().length];
            try {
                iArr6[HtmlTextStyling.Bold.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr6[HtmlTextStyling.Italics.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr6[HtmlTextStyling.Normal.ordinal()] = 3;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr6[HtmlTextStyling.StrikeThrough.ordinal()] = 4;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr6[HtmlTextStyling.Underline.ordinal()] = 5;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr6[HtmlTextStyling.Unknown.ordinal()] = 6;
            } catch (NoSuchFieldError unused20) {
            }
            f = iArr6;
        }
    }

    public static final TextDecoration a(UITextDecoration uITextDecoration) {
        Intrinsics.i(uITextDecoration, "<this>");
        int i = WhenMappings.f10079a[uITextDecoration.ordinal()];
        if (i == 1) {
            return TextDecoration.INSTANCE.getNone();
        }
        if (i == 2) {
            return TextDecoration.INSTANCE.getUnderline();
        }
        if (i == 3) {
            return TextDecoration.INSTANCE.getLineThrough();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int b(UITextOverflow uITextOverflow) {
        Intrinsics.i(uITextOverflow, "<this>");
        int i = WhenMappings.b[uITextOverflow.ordinal()];
        if (i == 1) {
            return TextOverflow.INSTANCE.m7225getClipgIe3tQ8();
        }
        if (i == 2) {
            return TextOverflow.INSTANCE.m7226getEllipsisgIe3tQ8();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final FontWeight c(UIFontWeight uIFontWeight) {
        Intrinsics.i(uIFontWeight, "<this>");
        int i = WhenMappings.d[uIFontWeight.ordinal()];
        if (i == 1) {
            return FontWeight.INSTANCE.getNormal();
        }
        if (i == 2) {
            return FontWeight.INSTANCE.getSemiBold();
        }
        if (i == 3) {
            return FontWeight.INSTANCE.getBold();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final int d(UITextAlign uITextAlign) {
        Intrinsics.i(uITextAlign, "<this>");
        int i = WhenMappings.c[uITextAlign.ordinal()];
        if (i == 1) {
            return TextAlign.INSTANCE.m7173getStarte0LSkKk();
        }
        if (i == 2) {
            return TextAlign.INSTANCE.m7168getCentere0LSkKk();
        }
        if (i == 3) {
            return TextAlign.INSTANCE.m7169getEnde0LSkKk();
        }
        if (i == 4) {
            return TextAlign.INSTANCE.m7170getJustifye0LSkKk();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final UIFontWeight e(HtmlTextStyling htmlTextStyling) {
        Intrinsics.i(htmlTextStyling, "<this>");
        switch (WhenMappings.f[htmlTextStyling.ordinal()]) {
            case 1:
                return UIFontWeight.Bold;
            case 2:
                return UIFontWeight.Normal;
            case 3:
                return UIFontWeight.Normal;
            case 4:
                return UIFontWeight.Normal;
            case 5:
                return UIFontWeight.Normal;
            case 6:
                return UIFontWeight.Normal;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final UITextDecoration f(HtmlTextStyling htmlTextStyling) {
        Intrinsics.i(htmlTextStyling, "<this>");
        switch (WhenMappings.f[htmlTextStyling.ordinal()]) {
            case 1:
                return UITextDecoration.None;
            case 2:
                return UITextDecoration.None;
            case 3:
                return UITextDecoration.None;
            case 4:
                return UITextDecoration.LineThrough;
            case 5:
                return UITextDecoration.Underline;
            case 6:
                return UITextDecoration.None;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}

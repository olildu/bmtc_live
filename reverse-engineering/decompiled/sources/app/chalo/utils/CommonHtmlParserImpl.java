package app.chalo.utils;

import app.chalo.utils.CommonHtmlParserImpl;
import app.chalo.utils.HtmlStyledData;
import app.chalo.utils.HtmlTag;
import app.chalo.utils.HtmlTextStyling;
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlHandler;
import com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser;
import defpackage.c6;
import defpackage.fi;
import defpackage.n4;
import defpackage.vo1;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/utils/CommonHtmlParserImpl;", "Lapp/chalo/utils/CommonHtmlParser;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CommonHtmlParserImpl implements CommonHtmlParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f10420a = new ArrayDeque();
    public final MutableStateFlow b = StateFlowKt.a(EmptyList.f17557a);
    public final KsoupHtmlHandler c;
    public final KsoupHtmlParser d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10421a;

        static {
            int[] iArr = new int[HtmlTag.values().length];
            try {
                iArr[HtmlTag.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HtmlTag.BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HtmlTag.ITALIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[HtmlTag.UNDERLINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[HtmlTag.STRIKE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f10421a = iArr;
        }
    }

    public CommonHtmlParserImpl() {
        final int i = 0;
        KsoupHtmlHandler.Builder builderOnCloseTag = new KsoupHtmlHandler.Builder().onOpenTag(new c6(this, 15)).onText(new Function1(this) { // from class: jq
            public final /* synthetic */ CommonHtmlParserImpl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                HtmlTextStyling htmlTextStyling;
                Object value;
                switch (i) {
                    case 0:
                        String text = (String) obj;
                        Intrinsics.i(text, "text");
                        String message = "TEXT_PARSED: ".concat(text);
                        Intrinsics.i(message, "message");
                        CommonHtmlParserImpl commonHtmlParserImpl = this.b;
                        MutableStateFlow mutableStateFlow = commonHtmlParserImpl.b;
                        HtmlTag htmlTag = (HtmlTag) commonHtmlParserImpl.f10420a.e();
                        int i2 = htmlTag == null ? -1 : CommonHtmlParserImpl.WhenMappings.f10421a[htmlTag.ordinal()];
                        if (i2 == 1) {
                            htmlTextStyling = HtmlTextStyling.Normal;
                        } else if (i2 == 2) {
                            htmlTextStyling = HtmlTextStyling.Bold;
                        } else if (i2 == 3) {
                            htmlTextStyling = HtmlTextStyling.Italics;
                        } else if (i2 != 4) {
                            htmlTextStyling = i2 != 5 ? HtmlTextStyling.Normal : HtmlTextStyling.StrikeThrough;
                        } else {
                            htmlTextStyling = HtmlTextStyling.Underline;
                        }
                        ArrayList arrayListD0 = CollectionsKt.d0(new HtmlStyledData(text, htmlTextStyling), (Collection) mutableStateFlow.getValue());
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.c(value, arrayListD0));
                        break;
                    default:
                        Exception it = (Exception) obj;
                        Intrinsics.i(it, "it");
                        this.b.b(it);
                        break;
                }
                return Unit.f17538a;
            }
        }).onCloseTag(new n4(this, 12));
        final int i2 = 1;
        KsoupHtmlHandler handler = builderOnCloseTag.onError(new Function1(this) { // from class: jq
            public final /* synthetic */ CommonHtmlParserImpl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                HtmlTextStyling htmlTextStyling;
                Object value;
                switch (i2) {
                    case 0:
                        String text = (String) obj;
                        Intrinsics.i(text, "text");
                        String message = "TEXT_PARSED: ".concat(text);
                        Intrinsics.i(message, "message");
                        CommonHtmlParserImpl commonHtmlParserImpl = this.b;
                        MutableStateFlow mutableStateFlow = commonHtmlParserImpl.b;
                        HtmlTag htmlTag = (HtmlTag) commonHtmlParserImpl.f10420a.e();
                        int i3 = htmlTag == null ? -1 : CommonHtmlParserImpl.WhenMappings.f10421a[htmlTag.ordinal()];
                        if (i3 == 1) {
                            htmlTextStyling = HtmlTextStyling.Normal;
                        } else if (i3 == 2) {
                            htmlTextStyling = HtmlTextStyling.Bold;
                        } else if (i3 == 3) {
                            htmlTextStyling = HtmlTextStyling.Italics;
                        } else if (i3 != 4) {
                            htmlTextStyling = i3 != 5 ? HtmlTextStyling.Normal : HtmlTextStyling.StrikeThrough;
                        } else {
                            htmlTextStyling = HtmlTextStyling.Underline;
                        }
                        ArrayList arrayListD0 = CollectionsKt.d0(new HtmlStyledData(text, htmlTextStyling), (Collection) mutableStateFlow.getValue());
                        do {
                            value = mutableStateFlow.getValue();
                        } while (!mutableStateFlow.c(value, arrayListD0));
                        break;
                    default:
                        Exception it = (Exception) obj;
                        Intrinsics.i(it, "it");
                        this.b.b(it);
                        break;
                }
                return Unit.f17538a;
            }
        }).onEnd(new fi(this, 18)).getHandler();
        this.c = handler;
        this.d = new KsoupHtmlParser(handler, null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r5 = "some exception: " + r9.getMessage();
        kotlin.jvm.internal.Intrinsics.i(r5, "message");
        b(r9);
        com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.end$default(r1, null, 1, null);
     */
    @Override // app.chalo.utils.CommonHtmlParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List a(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "message"
            java.lang.String r1 = "htmlString"
            kotlin.jvm.internal.Intrinsics.i(r9, r1)
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser r1 = r8.d
            r1.reset()
        Lc:
            kotlinx.coroutines.flow.MutableStateFlow r2 = r8.b
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            java.util.List r4 = (java.util.List) r4
            kotlin.collections.EmptyList r4 = kotlin.collections.EmptyList.f17557a
            boolean r3 = r2.c(r3, r4)
            if (r3 == 0) goto Lc
            r3 = 1
            r4 = 0
            r1.write(r9)     // Catch: java.lang.Exception -> L26
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.end$default(r1, r4, r3, r4)     // Catch: java.lang.Exception -> L26
            goto L43
        L26:
            r9 = move-exception
            java.lang.String r5 = r9.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "some exception: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            kotlin.jvm.internal.Intrinsics.i(r5, r0)
            r8.b(r9)
            com.mohamedrejeb.ksoup.html.parser.KsoupHtmlParser.end$default(r1, r4, r3, r4)
        L43:
            java.lang.Object r9 = r2.getValue()
            java.util.List r9 = (java.util.List) r9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Parsed value: "
            r1.<init>(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            kotlin.jvm.internal.Intrinsics.i(r1, r0)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.utils.CommonHtmlParserImpl.a(java.lang.String):java.util.List");
    }

    public final void b(Exception exc) {
        MutableStateFlow mutableStateFlow;
        Object value;
        vo1.x("Parsing exc : ", exc.getMessage(), "message");
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, EmptyList.f17557a));
    }
}

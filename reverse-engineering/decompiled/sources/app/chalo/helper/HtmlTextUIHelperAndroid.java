package app.chalo.helper;

import defpackage.e80;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/HtmlTextUIHelperAndroid;", "Lapp/chalo/helper/HtmlTextUIHelper;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class HtmlTextUIHelperAndroid implements HtmlTextUIHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f2837a = LazyKt.b(new e80(9));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[HtmlFormatterFontWeight.values().length];
            try {
                iArr[HtmlFormatterFontWeight.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HtmlFormatterFontWeight.SEMI_BOLD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HtmlFormatterFontWeight.BOLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}

package app.chalo.data;

import androidx.webkit.Profile;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/data/SpanType;", "", "Color", "TypeFace", "Underline", "Strikethrough", "HandleManually", "Lapp/chalo/data/SpanType$Color;", "Lapp/chalo/data/SpanType$HandleManually;", "Lapp/chalo/data/SpanType$Strikethrough;", "Lapp/chalo/data/SpanType$TypeFace;", "Lapp/chalo/data/SpanType$Underline;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class SpanType {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$Color;", "Lapp/chalo/data/SpanType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Color extends SpanType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Color);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Color(colorHex=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$HandleManually;", "Lapp/chalo/data/SpanType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HandleManually extends SpanType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof HandleManually);
        }

        public final int hashCode() {
            return -1231528771;
        }

        public final String toString() {
            return "HandleManually";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$Strikethrough;", "Lapp/chalo/data/SpanType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Strikethrough extends SpanType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Strikethrough);
        }

        public final int hashCode() {
            return 206703601;
        }

        public final String toString() {
            return "Strikethrough";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lapp/chalo/data/SpanType$TypeFace;", "Lapp/chalo/data/SpanType;", Profile.DEFAULT_PROFILE_NAME, "Bold", "Italic", "BoldItalic", "Lapp/chalo/data/SpanType$TypeFace$Bold;", "Lapp/chalo/data/SpanType$TypeFace$BoldItalic;", "Lapp/chalo/data/SpanType$TypeFace$Default;", "Lapp/chalo/data/SpanType$TypeFace$Italic;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TypeFace extends SpanType {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$TypeFace$Bold;", "Lapp/chalo/data/SpanType$TypeFace;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Bold extends TypeFace {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Bold f2398a = new Bold();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Bold);
            }

            public final int hashCode() {
                return -1933958502;
            }

            public final String toString() {
                return "Bold";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$TypeFace$BoldItalic;", "Lapp/chalo/data/SpanType$TypeFace;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BoldItalic extends TypeFace {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BoldItalic);
            }

            public final int hashCode() {
                return -2101711510;
            }

            public final String toString() {
                return "BoldItalic";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$TypeFace$Default;", "Lapp/chalo/data/SpanType$TypeFace;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Default extends TypeFace {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Default);
            }

            public final int hashCode() {
                return -383223284;
            }

            public final String toString() {
                return Profile.DEFAULT_PROFILE_NAME;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$TypeFace$Italic;", "Lapp/chalo/data/SpanType$TypeFace;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Italic extends TypeFace {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Italic);
            }

            public final int hashCode() {
                return 1391423749;
            }

            public final String toString() {
                return "Italic";
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/SpanType$Underline;", "Lapp/chalo/data/SpanType;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Underline extends SpanType {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Underline);
        }

        public final int hashCode() {
            return 11703018;
        }

        public final String toString() {
            return "Underline";
        }
    }
}

package app.chalo.data;

import defpackage.qh1;
import defpackage.vo1;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/data/TextFormatAppModel;", "", "Companion", "Simple", "HtmlFormatted", "Lapp/chalo/data/TextFormatAppModel$HtmlFormatted;", "Lapp/chalo/data/TextFormatAppModel$Simple;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class TextFormatAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2403a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(3));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/TextFormatAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/TextFormatAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<TextFormatAppModel> serializer() {
            return (KSerializer) TextFormatAppModel.f2403a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/TextFormatAppModel$HtmlFormatted;", "Lapp/chalo/data/TextFormatAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class HtmlFormatted extends TextFormatAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new qh1(4)), null};
        public final List b;
        public final String c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/TextFormatAppModel$HtmlFormatted$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/TextFormatAppModel$HtmlFormatted;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<HtmlFormatted> serializer() {
                return TextFormatAppModel$HtmlFormatted$$serializer.f2404a;
            }
        }

        public /* synthetic */ HtmlFormatted(int i, String str, List list) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.b(TextFormatAppModel$HtmlFormatted$$serializer.f2404a.getDescriptor(), i, 3);
                throw null;
            }
            this.b = list;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HtmlFormatted)) {
                return false;
            }
            HtmlFormatted htmlFormatted = (HtmlFormatted) obj;
            return Intrinsics.d(this.b, htmlFormatted.b) && Intrinsics.d(this.c, htmlFormatted.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "HtmlFormatted(formattedText=" + this.b + ", originalText=" + this.c + ")";
        }

        public HtmlFormatted(List formattedText, String originalText) {
            Intrinsics.i(formattedText, "formattedText");
            Intrinsics.i(originalText, "originalText");
            this.b = formattedText;
            this.c = originalText;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/data/TextFormatAppModel$Simple;", "Lapp/chalo/data/TextFormatAppModel;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class Simple extends TextFormatAppModel {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public final String b;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/TextFormatAppModel$Simple$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/TextFormatAppModel$Simple;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<Simple> serializer() {
                return TextFormatAppModel$Simple$$serializer.f2405a;
            }
        }

        public /* synthetic */ Simple(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                PluginExceptionsKt.b(TextFormatAppModel$Simple$$serializer.f2405a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Simple) && Intrinsics.d(this.b, ((Simple) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return vo1.B("Simple(text=", this.b, ")");
        }

        public Simple(String text) {
            Intrinsics.i(text, "text");
            this.b = text;
        }
    }
}

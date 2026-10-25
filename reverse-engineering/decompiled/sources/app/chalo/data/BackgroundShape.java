package app.chalo.data;

import defpackage.p7;
import defpackage.uf0;
import defpackage.xs;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/data/BackgroundShape;", "", "Companion", "Rectangle", "Circle", "Lapp/chalo/data/BackgroundShape$Circle;", "Lapp/chalo/data/BackgroundShape$Rectangle;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class BackgroundShape {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f2313a = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new p7(15));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/BackgroundShape$Circle;", "Lapp/chalo/data/BackgroundShape;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Circle extends BackgroundShape {
        public static final Circle b = new Circle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Circle);
        }

        public final int hashCode() {
            return -254265293;
        }

        public final String toString() {
            return "Circle";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/data/BackgroundShape$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/data/BackgroundShape;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<BackgroundShape> serializer() {
            return (KSerializer) BackgroundShape.f2313a.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/data/BackgroundShape$Rectangle;", "Lapp/chalo/data/BackgroundShape;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Rectangle extends BackgroundShape {
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        public Rectangle(int i) {
            this.b = i;
            this.c = i;
            this.d = i;
            this.e = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rectangle)) {
                return false;
            }
            Rectangle rectangle = (Rectangle) obj;
            return this.b == rectangle.b && this.c == rectangle.c && this.d == rectangle.d && this.e == rectangle.e;
        }

        public final int hashCode() {
            return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
        }

        public final String toString() {
            return xs.h(this.d, this.e, ", bottomRight=", ")", uf0.s(this.b, this.c, "Rectangle(topLeft=", ", topRight=", ", bottomLeft="));
        }
    }
}

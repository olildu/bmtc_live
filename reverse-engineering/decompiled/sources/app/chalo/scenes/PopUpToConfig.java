package app.chalo.scenes;

import app.chalo.scenes.args.ParentArgs;
import defpackage.cb0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/scenes/PopUpToConfig;", "", "None", "Prev", "Scene", "ClearAll", "Finish", "Lapp/chalo/scenes/PopUpToConfig$ClearAll;", "Lapp/chalo/scenes/PopUpToConfig$Finish;", "Lapp/chalo/scenes/PopUpToConfig$None;", "Lapp/chalo/scenes/PopUpToConfig$Prev;", "Lapp/chalo/scenes/PopUpToConfig$Scene;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PopUpToConfig {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/PopUpToConfig$ClearAll;", "Lapp/chalo/scenes/PopUpToConfig;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ClearAll extends PopUpToConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9218a = true;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ClearAll) && this.f9218a == ((ClearAll) obj).f9218a;
        }

        public final int hashCode() {
            return this.f9218a ? 1231 : 1237;
        }

        public final String toString() {
            return cb0.k("ClearAll(inclusive=", ")", this.f9218a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/PopUpToConfig$Finish;", "Lapp/chalo/scenes/PopUpToConfig;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Finish extends PopUpToConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ParentArgs f9219a;

        public Finish(ParentArgs parentArgs) {
            Intrinsics.i(parentArgs, "parentArgs");
            this.f9219a = parentArgs;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Finish) && Intrinsics.d(this.f9219a, ((Finish) obj).f9219a);
        }

        public final int hashCode() {
            return this.f9219a.hashCode();
        }

        public final String toString() {
            return "Finish(parentArgs=" + this.f9219a + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/PopUpToConfig$None;", "Lapp/chalo/scenes/PopUpToConfig;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None extends PopUpToConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final None f9220a = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return -1534262840;
        }

        public final String toString() {
            return "None";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/PopUpToConfig$Prev;", "Lapp/chalo/scenes/PopUpToConfig;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Prev extends PopUpToConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Prev f9221a = new Prev();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Prev);
        }

        public final int hashCode() {
            return -1534200637;
        }

        public final String toString() {
            return "Prev";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/scenes/PopUpToConfig$Scene;", "Lapp/chalo/scenes/PopUpToConfig;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Scene extends PopUpToConfig {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ChaloScenes f9222a;
        public final boolean b;

        public Scene(ChaloScenes scene, boolean z) {
            Intrinsics.i(scene, "scene");
            this.f9222a = scene;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Scene)) {
                return false;
            }
            Scene scene = (Scene) obj;
            return this.f9222a == scene.f9222a && this.b == scene.b;
        }

        public final int hashCode() {
            return (this.f9222a.hashCode() * 31) + (this.b ? 1231 : 1237);
        }

        public final String toString() {
            return "Scene(scene=" + this.f9222a + ", inclusive=" + this.b + ")";
        }
    }
}

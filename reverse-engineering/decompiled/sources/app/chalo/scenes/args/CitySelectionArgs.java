package app.chalo.scenes.args;

import app.chalo.constants.Source;
import app.chalo.models.BasicCityInfoAppModel;
import app.chalo.scenes.ChaloScenes;
import defpackage.gf;
import defpackage.go;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0003\u0004\u0005\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/scenes/args/CitySelectionArgs;", "Lapp/chalo/scenes/args/SceneArgs;", "Lapp/chalo/scenes/args/ParentArgs;", "Companion", "CityLocationSelectionArgs", "OldCitySelectionArgs", "Lapp/chalo/scenes/args/CitySelectionArgs$CityLocationSelectionArgs;", "Lapp/chalo/scenes/args/CitySelectionArgs$OldCitySelectionArgs;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class CitySelectionArgs extends SceneArgs implements ParentArgs {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(27));

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/CitySelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/CitySelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f9241a;

            static {
                int[] iArr = new int[Source.values().length];
                try {
                    iArr[Source.CITY_SELECTION_SCREEN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Source.CITY_SELECTION_FRAGMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f9241a = iArr;
            }
        }

        public static CitySelectionArgs a(Companion companion, Source source, BasicCityInfoAppModel basicCityInfoAppModel, int i) {
            boolean z = (i & 2) == 0;
            if ((i & 4) != 0) {
                basicCityInfoAppModel = null;
            }
            companion.getClass();
            Intrinsics.i(source, "source");
            int i2 = WhenMappings.f9241a[source.ordinal()];
            if (i2 == 1) {
                return new OldCitySelectionArgs(source);
            }
            if (i2 != 2) {
                return z ? new OldCitySelectionArgs(source) : new CityLocationSelectionArgs(source, basicCityInfoAppModel);
            }
            return new CityLocationSelectionArgs(source, basicCityInfoAppModel);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<CitySelectionArgs> serializer() {
            return (KSerializer) CitySelectionArgs.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/CitySelectionArgs$CityLocationSelectionArgs;", "Lapp/chalo/scenes/args/CitySelectionArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class CityLocationSelectionArgs extends CitySelectionArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] e = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(28)), null};
        public final Source c;
        public final BasicCityInfoAppModel d;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/CitySelectionArgs$CityLocationSelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/CitySelectionArgs$CityLocationSelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<CityLocationSelectionArgs> serializer() {
                return CitySelectionArgs$CityLocationSelectionArgs$$serializer.f9240a;
            }
        }

        public /* synthetic */ CityLocationSelectionArgs(int i, Source source, BasicCityInfoAppModel basicCityInfoAppModel) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.b(CitySelectionArgs$CityLocationSelectionArgs$$serializer.f9240a.getDescriptor(), i, 1);
                throw null;
            }
            this.c = source;
            if ((i & 2) == 0) {
                this.d = null;
            } else {
                this.d = basicCityInfoAppModel;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.CityLocationSelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CityLocationSelectionArgs)) {
                return false;
            }
            CityLocationSelectionArgs cityLocationSelectionArgs = (CityLocationSelectionArgs) obj;
            return this.c == cityLocationSelectionArgs.c && Intrinsics.d(this.d, cityLocationSelectionArgs.d);
        }

        public final int hashCode() {
            int iHashCode = this.c.hashCode() * 31;
            BasicCityInfoAppModel basicCityInfoAppModel = this.d;
            return iHashCode + (basicCityInfoAppModel == null ? 0 : basicCityInfoAppModel.hashCode());
        }

        public final String toString() {
            return "CityLocationSelectionArgs(source=" + this.c + ", basicCityInfoAppModel=" + this.d + ")";
        }

        public CityLocationSelectionArgs(Source source, BasicCityInfoAppModel basicCityInfoAppModel) {
            Intrinsics.i(source, "source");
            this.c = source;
            this.d = basicCityInfoAppModel;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/scenes/args/CitySelectionArgs$OldCitySelectionArgs;", "Lapp/chalo/scenes/args/CitySelectionArgs;", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class OldCitySelectionArgs extends CitySelectionArgs {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new go(29))};
        public final Source c;

        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/scenes/args/CitySelectionArgs$OldCitySelectionArgs$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/scenes/args/CitySelectionArgs$OldCitySelectionArgs;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer<OldCitySelectionArgs> serializer() {
                return CitySelectionArgs$OldCitySelectionArgs$$serializer.f9242a;
            }
        }

        public /* synthetic */ OldCitySelectionArgs(int i, Source source) {
            if (1 == (i & 1)) {
                this.c = source;
            } else {
                PluginExceptionsKt.b(CitySelectionArgs$OldCitySelectionArgs$$serializer.f9242a.getDescriptor(), i, 1);
                throw null;
            }
        }

        @Override // app.chalo.scenes.args.SceneArgs
        public final ChaloScenes c() {
            return ChaloScenes.CitySelection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OldCitySelectionArgs) && this.c == ((OldCitySelectionArgs) obj).c;
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return gf.f(this.c, "OldCitySelectionArgs(source=", ")");
        }

        public OldCitySelectionArgs(Source source) {
            Intrinsics.i(source, "source");
            this.c = source;
        }
    }
}

package app.chalo.compose.components.chalomap;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import app.chalo.R;
import app.chalo.compose.components.chalomap.ChaloMap_androidKt;
import app.chalo.compose.resources.IconAssetHelper_androidKt;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.providers.iconassetprovider.IconType;
import app.chalo.uistate.components.map.ChaloMapUIEventHandler;
import app.chalo.uistate.components.map.ChaloMapUIState;
import app.chalo.uistate.components.map.TrafficLayerConfig;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.GoogleMapKt;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapUiSettings;
import com.google.maps.android.compose.MarkerKt;
import com.google.maps.android.compose.MarkerState;
import defpackage.bj;
import defpackage.c6;
import defpackage.ch;
import defpackage.eh;
import defpackage.fj;
import defpackage.g0;
import defpackage.h5;
import defpackage.l6;
import defpackage.pk0;
import defpackage.v1;
import defpackage.wb;
import defpackage.zk;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003¨\u0006\t²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/google/android/gms/maps/model/CameraPosition;", "initialPosition", "", "isMapLoaded", "", "mapOverlayRadius", "Lcom/google/android/gms/maps/model/LatLng;", "animationStartPosition", "animationEndPosition", "chalo-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class ChaloMap_androidKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1875a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[IconType.values().length];
            try {
                iArr[IconType.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconType.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconType.STOP_MARKER_ROUTE_DETAILS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IconType.BUS_NEARBY_SELECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[IconType.STOP_MARKER_ROUTE_DETAILS_DISABLED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[IconType.BUS_NEARBY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[IconType.AUTO_NEARBY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[IconType.WALK_NEARBY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[IconType.METRO_NEARBY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[IconType.CAB_NEARBY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[IconType.FERRY_NEARBY_SELECTED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[IconType.MONORAIL_NEARBY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[IconType.TRAIN_NEARBY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[IconType.TRAFFIC_SIGNAL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[IconType.IC_BOARDING_MARKER.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[IconType.IC_DEBOARDING_MARKER.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f1875a = iArr;
            int[] iArr2 = new int[MapOverlayColor.values().length];
            try {
                iArr2[MapOverlayColor.OVERLAY_COLOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[MapOverlayColor.OVERLAY_BORDER_COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            b = iArr2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ChaloMapMarkerUIState chaloMapMarkerUIState, Composer composer, int i) {
        int i2;
        int i3;
        Animatable animatable;
        BitmapDescriptor bitmapDescriptorFromResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(1650555686);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(chaloMapMarkerUIState) : composerStartRestartGroup.changedInstance(chaloMapMarkerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1650555686, i2, -1, "app.chalo.compose.components.chalomap.AnimatedMarker (ChaloMap.android.kt:394)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                Saver saver = MarkerState.e;
                LatLng position = chaloMapMarkerUIState.getB().b();
                Intrinsics.i(position, "position");
                MarkerState markerState = new MarkerState(position);
                composerStartRestartGroup.updateRememberedValue(markerState);
                objRememberedValue = markerState;
            }
            MarkerState markerState2 = (MarkerState) objRememberedValue;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = AnimatableKt.Animatable$default(1.0f, 0.0f, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Animatable animatable2 = (Animatable) objRememberedValue2;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(chaloMapMarkerUIState.getB().b(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            MutableState mutableState = (MutableState) objRememberedValue3;
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(chaloMapMarkerUIState.getB().b(), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            MutableState mutableState2 = (MutableState) objRememberedValue4;
            LatLng latLngB = chaloMapMarkerUIState.getB().b();
            int i4 = i2 & 14;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(markerState2) | (i4 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(chaloMapMarkerUIState))) | composerStartRestartGroup.changedInstance(animatable2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                animatable = animatable2;
                ChaloMap_androidKt$AnimatedMarker$1$1 chaloMap_androidKt$AnimatedMarker$1$1 = new ChaloMap_androidKt$AnimatedMarker$1$1(markerState2, chaloMapMarkerUIState, animatable, mutableState, mutableState2, null);
                composerStartRestartGroup.updateRememberedValue(chaloMap_androidKt$AnimatedMarker$1$1);
                objRememberedValue5 = chaloMap_androidKt$AnimatedMarker$1$1;
            } else {
                animatable = animatable2;
            }
            EffectsKt.LaunchedEffect(latLngB, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, 0);
            int i5 = i2;
            double d = ((LatLng) mutableState.getValue()).latitude;
            double dFloatValue = ((((LatLng) mutableState2.getValue()).latitude - d) * ((double) ((Number) animatable.getValue()).floatValue())) + d;
            double d2 = ((LatLng) mutableState.getValue()).longitude;
            markerState2.d(new LatLng(dFloatValue, ((((LatLng) mutableState2.getValue()).longitude - d2) * ((double) ((Number) animatable.getValue()).floatValue())) + d2));
            boolean zChanged = composerStartRestartGroup.changed(chaloMapMarkerUIState.getC());
            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                ChaloMapMarkerIconType c = chaloMapMarkerUIState.getC();
                if (c instanceof ChaloMapMarkerIconType.BitmapRes) {
                    bitmapDescriptorFromResource = BitmapDescriptorFactory.fromBitmap(((ChaloMapMarkerIconType.BitmapRes) c).f1866a.f1884a);
                } else {
                    if (!(c instanceof ChaloMapMarkerIconType.DrawableRes)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(g(((ChaloMapMarkerIconType.DrawableRes) c).f1867a));
                }
                objRememberedValue6 = bitmapDescriptorFromResource;
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) objRememberedValue6;
            Intrinsics.f(bitmapDescriptor);
            long jM4357constructorimpl = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(chaloMapMarkerUIState.getD().f1883a)) << 32) | (((long) Float.floatToRawIntBits(chaloMapMarkerUIState.getD().b)) & BodyPartID.bodyIdMax));
            ChaloMapMarkerUIEventHandler f = chaloMapMarkerUIState.getF();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(f);
            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue7 == companion.getEmpty()) {
                objRememberedValue7 = new ChaloMap_androidKt$AnimatedMarker$2$1(0, f, ChaloMapMarkerUIEventHandler.class, "markerClicked", "markerClicked()Z", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
            }
            KFunction kFunction = (KFunction) objRememberedValue7;
            float f2 = chaloMapMarkerUIState.getG().f1883a;
            long jM4357constructorimpl2 = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(chaloMapMarkerUIState.getG().b)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f2)) << 32));
            ChaloMapMarkerUIEventHandler f3 = chaloMapMarkerUIState.getF();
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(f3);
            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue8 == companion.getEmpty()) {
                objRememberedValue8 = new ChaloMap_androidKt$AnimatedMarker$3$1(0, f3, ChaloMapMarkerUIEventHandler.class, "infoWindowClicked", "infoWindowClicked()V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue8;
            ChaloMapMarkerUIEventHandler f4 = chaloMapMarkerUIState.getF();
            boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(f4);
            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue9 == companion.getEmpty()) {
                objRememberedValue9 = new ChaloMap_androidKt$AnimatedMarker$4$1(0, f4, ChaloMapMarkerUIEventHandler.class, "infoWindowClosed", "infoWindowClosed()V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
            }
            Saver saver2 = MarkerState.e;
            i3 = 1;
            d(markerState2, bitmapDescriptor, jM4357constructorimpl, jM4357constructorimpl2, chaloMapMarkerUIState.getH(), chaloMapMarkerUIState.getF(), (Function0) kFunction, (Function0) kFunction2, (Function0) ((KFunction) objRememberedValue9), composerStartRestartGroup, 0);
            composerStartRestartGroup = composerStartRestartGroup;
            boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(markerState2) | (i4 == 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(chaloMapMarkerUIState)));
            Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance5 || objRememberedValue10 == companion.getEmpty()) {
                objRememberedValue10 = new ChaloMap_androidKt$AnimatedMarker$5$1(chaloMapMarkerUIState, markerState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
            }
            EffectsKt.LaunchedEffect(chaloMapMarkerUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue10, composerStartRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            i3 = 1;
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk(chaloMapMarkerUIState, i, i3));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0137  */
    /* JADX WARN: Code duplicated, block: B:102:0x0141  */
    /* JADX WARN: Code duplicated, block: B:103:0x0144  */
    /* JADX WARN: Code duplicated, block: B:105:0x0149  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:110:0x015a  */
    /* JADX WARN: Code duplicated, block: B:112:0x015e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0168  */
    /* JADX WARN: Code duplicated, block: B:115:0x016b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0170  */
    /* JADX WARN: Code duplicated, block: B:124:0x018d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0196 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:128:0x0198  */
    /* JADX WARN: Code duplicated, block: B:129:0x019b  */
    /* JADX WARN: Code duplicated, block: B:132:0x019f  */
    /* JADX WARN: Code duplicated, block: B:133:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:135:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:145:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:147:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:149:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:151:0x01de  */
    /* JADX WARN: Code duplicated, block: B:153:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:155:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:159:0x0204  */
    /* JADX WARN: Code duplicated, block: B:161:0x0208  */
    /* JADX WARN: Code duplicated, block: B:163:0x0216  */
    /* JADX WARN: Code duplicated, block: B:165:0x0229  */
    /* JADX WARN: Code duplicated, block: B:168:0x0234  */
    /* JADX WARN: Code duplicated, block: B:169:0x023f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0249  */
    /* JADX WARN: Code duplicated, block: B:174:0x024f  */
    /* JADX WARN: Code duplicated, block: B:177:0x0258  */
    /* JADX WARN: Code duplicated, block: B:179:0x0270  */
    /* JADX WARN: Code duplicated, block: B:183:0x028a  */
    /* JADX WARN: Code duplicated, block: B:186:0x029e  */
    /* JADX WARN: Code duplicated, block: B:187:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:190:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:191:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:194:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:197:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:200:0x0313  */
    /* JADX WARN: Code duplicated, block: B:201:0x0315  */
    /* JADX WARN: Code duplicated, block: B:206:0x0322  */
    /* JADX WARN: Code duplicated, block: B:209:0x0339  */
    /* JADX WARN: Code duplicated, block: B:211:0x033d  */
    /* JADX WARN: Code duplicated, block: B:213:0x0341  */
    /* JADX WARN: Code duplicated, block: B:214:0x0343  */
    /* JADX WARN: Code duplicated, block: B:221:0x035c  */
    /* JADX WARN: Code duplicated, block: B:228:0x0396  */
    /* JADX WARN: Code duplicated, block: B:231:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:233:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:236:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:237:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:240:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:241:0x03f4  */
    /* JADX WARN: Code duplicated, block: B:246:0x0402  */
    /* JADX WARN: Code duplicated, block: B:249:0x0418  */
    /* JADX WARN: Code duplicated, block: B:252:0x0426  */
    /* JADX WARN: Code duplicated, block: B:253:0x0428  */
    /* JADX WARN: Code duplicated, block: B:258:0x0435 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x0437  */
    /* JADX WARN: Code duplicated, block: B:261:0x0440  */
    /* JADX WARN: Code duplicated, block: B:265:0x0455  */
    /* JADX WARN: Code duplicated, block: B:266:0x0460  */
    /* JADX WARN: Code duplicated, block: B:268:0x0478  */
    /* JADX WARN: Code duplicated, block: B:269:0x0484  */
    /* JADX WARN: Code duplicated, block: B:272:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:275:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:276:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:281:0x04c6  */
    /* JADX WARN: Code duplicated, block: B:284:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:285:0x04dc  */
    /* JADX WARN: Code duplicated, block: B:290:0x04ea  */
    /* JADX WARN: Code duplicated, block: B:293:0x0535  */
    /* JADX WARN: Code duplicated, block: B:295:0x0549  */
    /* JADX WARN: Code duplicated, block: B:298:0x0561  */
    /* JADX WARN: Code duplicated, block: B:300:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    /* JADX WARN: Code duplicated, block: B:35:0x0076  */
    /* JADX WARN: Code duplicated, block: B:36:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00df  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:83:0x0102  */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0113  */
    /* JADX WARN: Code duplicated, block: B:90:0x0119  */
    /* JADX WARN: Code duplicated, block: B:92:0x011f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0122  */
    /* JADX WARN: Code duplicated, block: B:97:0x012a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(Modifier modifier, final List mapPolylinePoints, boolean z, final MapCameraViewState mapCameraViewState, final List markerList, TrafficLayerConfig trafficLayerConfig, ChaloMapOverlayConfig chaloMapOverlayConfig, boolean z2, Function1 function1, Function0 function0, Function1 function2, Function1 function3, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z3;
        int i5;
        TrafficLayerConfig trafficLayerConfig2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        boolean z4;
        Composer composer2;
        ChaloMapOverlayConfig chaloMapOverlayConfig2;
        final boolean z5;
        final Function1 function4;
        final Function1 function5;
        final Function1 function6;
        final TrafficLayerConfig trafficLayerConfig3;
        final boolean z6;
        final Function0 function7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Modifier modifier3;
        final boolean z7;
        final TrafficLayerConfig trafficLayerConfig4;
        final ChaloMapOverlayConfig chaloMapOverlayConfig3;
        boolean z8;
        final Function1 function8;
        boolean z9;
        final Function0 function9;
        final Function1 function10;
        Composer composer3;
        final Function1 function11;
        Modifier modifier4;
        boolean z10;
        boolean z11;
        boolean zChanged;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        MutableState mutableState;
        Object objRememberedValue3;
        MutableState mutableState2;
        Object objRememberedValue4;
        MutableFloatState mutableFloatState;
        Object objRememberedValue5;
        ProjectionUtilsAndroid projectionUtilsAndroid;
        CameraPositionState cameraPositionState;
        int i21;
        boolean z12;
        Object objRememberedValue6;
        boolean z13;
        boolean z14;
        boolean zChangedInstance;
        Object objRememberedValue7;
        ChaloMapOverlayConfig chaloMapOverlayConfig4;
        CameraPositionState cameraPositionState2;
        boolean zChanged2;
        Object objRememberedValue8;
        boolean z15;
        Object objRememberedValue9;
        MapUiSettings mapUiSettings;
        MapOverlayColor b;
        final Color colorM4595boximpl;
        Modifier modifierComposed$default;
        boolean z16;
        Object objRememberedValue10;
        boolean z17;
        Object objRememberedValue11;
        CameraPosition cameraPosition;
        boolean z18;
        boolean z19;
        boolean z20;
        Object objRememberedValue12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2;
        Object objRememberedValue13;
        Object objRememberedValue14;
        Object objRememberedValue15;
        int i22;
        int i23;
        Intrinsics.i(mapPolylinePoints, "mapPolylinePoints");
        Intrinsics.i(mapCameraViewState, "mapCameraViewState");
        Intrinsics.i(markerList, "markerList");
        Composer composerStartRestartGroup = composer.startRestartGroup(-266189038);
        int i24 = i3 & 1;
        if (i24 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(mapPolylinePoints) ? 32 : 16;
        }
        int i25 = i3 & 4;
        if (i25 == 0) {
            if ((i & 384) == 0) {
                z3 = z;
                i4 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                if (composerStartRestartGroup.changed(mapCameraViewState)) {
                    i23 = 2048;
                } else {
                    i23 = 1024;
                }
                i4 |= i23;
            }
            if ((i & 24576) == 0) {
                if (composerStartRestartGroup.changedInstance(markerList)) {
                    i22 = 16384;
                } else {
                    i22 = 8192;
                }
                i4 |= i22;
            }
            i5 = i3 & 32;
            if (i5 != 0) {
                i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                trafficLayerConfig2 = trafficLayerConfig;
            } else {
                trafficLayerConfig2 = trafficLayerConfig;
                if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    if (composerStartRestartGroup.changed(trafficLayerConfig2)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
            }
            i7 = i3 & 64;
            if (i7 != 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                if (composerStartRestartGroup.changed(chaloMapOverlayConfig)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i4 |= i8;
            }
            i9 = i3 & 128;
            if (i9 != 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                if (composerStartRestartGroup.changed(z2)) {
                    i10 = 8388608;
                } else {
                    i10 = 4194304;
                }
                i4 |= i10;
            }
            i11 = i3 & 256;
            if (i11 != 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i12 = 33554432;
                }
                i4 |= i12;
            }
            i13 = i3 & 512;
            if (i13 != 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i4 |= i14;
            }
            i15 = i3 & 1024;
            if (i15 != 0) {
                i16 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i17 = 4;
                } else {
                    i17 = 2;
                }
                i16 = i2 | i17;
            } else {
                i16 = i2;
            }
            i18 = i3 & 2048;
            if (i18 != 0) {
                i16 |= 48;
            } else if ((i2 & 48) != 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i19 = 32;
                } else {
                    i19 = 16;
                }
                i16 |= i19;
            }
            i20 = i16;
            if ((i4 & 306783379) == 306783378 || (i20 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (composerStartRestartGroup.shouldExecute(z4, i4 & 1)) {
                if (i24 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i25 != 0) {
                    z7 = false;
                } else {
                    z7 = z3;
                }
                if (i5 != 0) {
                    trafficLayerConfig4 = new TrafficLayerConfig();
                } else {
                    trafficLayerConfig4 = trafficLayerConfig2;
                }
                chaloMapOverlayConfig3 = i7 == 0 ? chaloMapOverlayConfig : null;
                if (i9 != 0) {
                    z8 = false;
                } else {
                    z8 = z2;
                }
                if (i11 != 0) {
                    objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue15 = new bj(22);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                    }
                    function8 = (Function1) objRememberedValue15;
                } else {
                    function8 = function1;
                }
                if (i13 != 0) {
                    objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue14 = new wb(8);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                    }
                    boolean z21 = z8;
                    function9 = (Function0) objRememberedValue14;
                    z9 = z21;
                } else {
                    z9 = z8;
                    function9 = function0;
                }
                if (i15 == 0) {
                    function10 = function2;
                }
                if (i18 != 0) {
                    objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue13 = new bj(23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                    }
                    function11 = (Function1) objRememberedValue13;
                    composer3 = composerStartRestartGroup;
                } else {
                    composer3 = composerStartRestartGroup;
                    function11 = function3;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-266189038, i4, i20, "app.chalo.compose.components.chalomap.ChaloMap (ChaloMap.android.kt:94)");
                }
                if (mapCameraViewState.equals(MapCameraViewState.InitialState.NoState.f1881a)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                        final int i26 = 0;
                        final boolean z22 = z9;
                        final Modifier modifier5 = modifier3;
                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: cl
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                Composer composer4 = (Composer) obj;
                                switch (i26) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        ChaloMap_androidKt.b(modifier5, mapPolylinePoints, z7, mapCameraViewState, markerList, trafficLayerConfig4, chaloMapOverlayConfig3, z22, function8, function9, function10, function11, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        ChaloMap_androidKt.b(modifier5, mapPolylinePoints, z7, mapCameraViewState, markerList, trafficLayerConfig4, chaloMapOverlayConfig3, z22, function8, function9, function10, function11, composer4, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                        break;
                                }
                                return Unit.f17538a;
                            }
                        });
                        return;
                    }
                    return;
                }
                modifier4 = modifier3;
                z10 = z9;
                z11 = z7;
                zChanged = composer3.changed(mapPolylinePoints);
                objRememberedValue = composer3.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    composer3.updateRememberedValue(mapPolylinePoints);
                    objRememberedValue = mapPolylinePoints;
                }
                List list = (List) objRememberedValue;
                objRememberedValue2 = composer3.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                mutableState = (MutableState) objRememberedValue2;
                objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                mutableState2 = (MutableState) objRememberedValue3;
                objRememberedValue4 = composer3.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composer3.updateRememberedValue(objRememberedValue4);
                }
                mutableFloatState = (MutableFloatState) objRememberedValue4;
                objRememberedValue5 = composer3.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new ProjectionUtilsAndroid();
                    composer3.updateRememberedValue(objRememberedValue5);
                }
                projectionUtilsAndroid = (ProjectionUtilsAndroid) objRememberedValue5;
                final a aVar = new a(mapCameraViewState, function8, mutableState);
                cameraPositionState = (CameraPositionState) RememberSaveableKt.m4084rememberSaveable(new Object[0], CameraPositionState.h, (Function0) new Function0<CameraPositionState>() { // from class: app.chalo.compose.components.chalomap.ChaloMap_androidKt$ChaloMap$$inlined$rememberCameraPositionState$1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Saver saver = CameraPositionState.h;
                        CameraPositionState cameraPositionStateA = CameraPositionState.Companion.a();
                        aVar.invoke(cameraPositionStateA);
                        return cameraPositionStateA;
                    }
                }, composer3, 0);
                i21 = 3670016 & i4;
                if (i21 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                objRememberedValue6 = composer3.rememberedValue();
                if (z12 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new ChaloMap_androidKt$ChaloMap$7$1(chaloMapOverlayConfig3, mutableFloatState, null);
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                EffectsKt.LaunchedEffect(chaloMapOverlayConfig3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer3, (i4 >> 18) & 14);
                if ((i20 & 14) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (i21 == 1048576) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zChangedInstance = z13 | z14 | composer3.changedInstance(cameraPositionState);
                objRememberedValue7 = composer3.rememberedValue();
                if (!zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                    ChaloMapOverlayConfig chaloMapOverlayConfig5 = chaloMapOverlayConfig3;
                    objRememberedValue7 = new ChaloMap_androidKt$ChaloMap$8$1(function10, chaloMapOverlayConfig5, cameraPositionState, projectionUtilsAndroid, mutableFloatState, null);
                    chaloMapOverlayConfig4 = chaloMapOverlayConfig5;
                    cameraPositionState2 = cameraPositionState;
                    composer3.updateRememberedValue(objRememberedValue7);
                } else {
                    cameraPositionState2 = cameraPositionState;
                    chaloMapOverlayConfig4 = chaloMapOverlayConfig3;
                }
                EffectsKt.LaunchedEffect(cameraPositionState2, chaloMapOverlayConfig4, (Function2) objRememberedValue7, composer3, (i4 >> 15) & 112);
                zChanged2 = composer3.changed(trafficLayerConfig4.f9964a);
                objRememberedValue8 = composer3.rememberedValue();
                if (zChanged2 || objRememberedValue8 == companion.getEmpty()) {
                    MapProperties mapProperties = new MapProperties(z11, trafficLayerConfig4.f9964a, new MapStyleOptions("[\n  {\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#d1d8dd\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#688695\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"weight\": 3\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#d1d8dd\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.man_made\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.man_made\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#bbbbbb\"\n      },\n      {\n        \"visibility\": \"on\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.natural.landcover\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.business\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#000000\"\n      },\n      {\n        \"visibility\": \"off\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#b3e08d\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.sports_complex\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#b3e08d\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f0f0f0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f8f8f8\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.line\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#a7a7a7\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.airport\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.bus\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.rail\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#9ec2e1\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  }\n]"), 467);
                    composer3.updateRememberedValue(mapProperties);
                    objRememberedValue8 = mapProperties;
                }
                MapProperties mapProperties2 = (MapProperties) objRememberedValue8;
                if (((Boolean) mutableState2.getValue()).booleanValue()) {
                    composer3.startReplaceGroup(-1523040687);
                    cameraPosition = (CameraPosition) mutableState.getValue();
                    if (cameraPosition != null) {
                        CameraUpdate cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPosition);
                        Intrinsics.h(cameraUpdateNewCameraPosition, "newCameraPosition(...)");
                        function8.invoke(new AndroidCameraUpdate(cameraUpdateNewCameraPosition));
                        mutableState.setValue(null);
                    }
                    boolean zChangedInstance2 = composer3.changedInstance(cameraPositionState2);
                    if ((i4 & 7168) == 2048) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    boolean z23 = zChangedInstance2 | z18;
                    if ((234881024 & i4) == 67108864) {
                        z19 = true;
                    } else {
                        z19 = false;
                    }
                    z20 = z23 | z19;
                    objRememberedValue12 = composer3.rememberedValue();
                    if (z20 || objRememberedValue12 == companion.getEmpty()) {
                        objRememberedValue12 = new ChaloMap_androidKt$ChaloMap$10$1(cameraPositionState2, mapCameraViewState, function8, null);
                        composer3.updateRememberedValue(objRememberedValue12);
                    }
                    EffectsKt.LaunchedEffect(mapCameraViewState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composer3, (i4 >> 9) & 14);
                } else {
                    composer3.startReplaceGroup(-1531448848);
                }
                composer3.endReplaceGroup();
                if ((29360128 & i4) == 8388608) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                objRememberedValue9 = composer3.rememberedValue();
                if (z15 || objRememberedValue9 == companion.getEmpty()) {
                    if (z10) {
                        mapUiSettings = new MapUiSettings(16);
                    } else {
                        mapUiSettings = new MapUiSettings(754);
                    }
                    objRememberedValue9 = mapUiSettings;
                    composer3.updateRememberedValue(objRememberedValue9);
                }
                MapUiSettings mapUiSettings2 = (MapUiSettings) objRememberedValue9;
                composer3.startReplaceGroup(1890575436);
                if (chaloMapOverlayConfig4 == 0) {
                    composer3.startReplaceGroup(346950847);
                    composer3.endReplaceGroup();
                    modifierComposed$default = null;
                } else {
                    composer3.startReplaceGroup(346950848);
                    final float floatValue = mutableFloatState.getFloatValue();
                    final long jI = i(chaloMapOverlayConfig4.getF1871a(), composer3);
                    b = chaloMapOverlayConfig4.getB();
                    if (b == null) {
                        composer3.startReplaceGroup(-244334127);
                        composer3.endReplaceGroup();
                        colorM4595boximpl = null;
                    } else {
                        composer3.startReplaceGroup(-2086091728);
                        long jI2 = i(b, composer3);
                        composer3.endReplaceGroup();
                        colorM4595boximpl = Color.m4595boximpl(jI2);
                    }
                    final IconType c = chaloMapOverlayConfig4.getC();
                    modifierComposed$default = ComposedModifierKt.composed$default(modifier4, null, new Function3() { // from class: yk
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            Painter painterA;
                            Modifier composed = (Modifier) obj;
                            Composer composer4 = (Composer) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            Intrinsics.i(composed, "$this$composed");
                            composer4.startReplaceGroup(-1636992536);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1636992536, iIntValue, -1, "app.chalo.compose.components.chalomap.circleOverlay.<anonymous> (ChaloMap.android.kt:494)");
                            }
                            final Density density = (Density) composer4.consume(CompositionLocalsKt.getLocalDensity());
                            final float f = ChaloTheme.b(composer4, 6).b;
                            IconType iconType = c;
                            if (iconType == null) {
                                composer4.startReplaceGroup(1709127191);
                                composer4.endReplaceGroup();
                                painterA = null;
                            } else {
                                composer4.startReplaceGroup(1709127192);
                                painterA = IconAssetHelper_androidKt.a(iconType, composer4, 0);
                                composer4.endReplaceGroup();
                            }
                            final Painter painter = painterA;
                            final long j = jI;
                            boolean zChanged3 = composer4.changed(j);
                            final float f2 = floatValue;
                            boolean zChanged4 = zChanged3 | composer4.changed(f2);
                            final Color color = colorM4595boximpl;
                            boolean zChanged5 = zChanged4 | composer4.changed(color) | composer4.changed(density) | composer4.changed(f) | composer4.changedInstance(painter);
                            Object objRememberedValue16 = composer4.rememberedValue();
                            if (zChanged5 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue16 = new Function1() { // from class: al
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        ContentDrawScope drawWithContent = (ContentDrawScope) obj4;
                                        Intrinsics.i(drawWithContent, "$this$drawWithContent");
                                        drawWithContent.drawContent();
                                        long j2 = j;
                                        float f3 = f2;
                                        DrawScope.CC.z(drawWithContent, j2, f3, 0L, 0.0f, null, null, 0, 124, null);
                                        Color color2 = color;
                                        if (color2 != null) {
                                            color2.m4615unboximpl();
                                            long jM4615unboximpl = color2.m4615unboximpl();
                                            Density toPixel = density;
                                            Intrinsics.i(toPixel, "$this$toPixel");
                                            DrawScope.CC.z(drawWithContent, jM4615unboximpl, f3, 0L, 0.0f, new Stroke(toPixel.mo404toPx0680j_4(f), 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                        }
                                        Painter painter2 = painter;
                                        if (painter2 != null) {
                                            float f4 = 2;
                                            float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.mo5072getCenterF1C5BW0() >> 32)) - (Float.intBitsToFloat((int) (painter2.getB() >> 32)) / f4);
                                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.mo5072getCenterF1C5BW0() & BodyPartID.bodyIdMax)) - (Float.intBitsToFloat((int) (painter2.getB() & BodyPartID.bodyIdMax)) / f4);
                                            drawWithContent.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                                            try {
                                                Painter.m5223drawx_KDEd0$default(painter2, drawWithContent, painter2.getB(), 0.0f, null, 6, null);
                                            } finally {
                                                drawWithContent.getDrawContext().getTransform().translate(-fIntBitsToFloat, -fIntBitsToFloat2);
                                            }
                                        }
                                        return Unit.f17538a;
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue16);
                            }
                            Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer4.endReplaceGroup();
                            return modifierDrawWithContent;
                        }
                    }, 1, null);
                    composer3.endReplaceGroup();
                }
                if (modifierComposed$default == null) {
                    modifierComposed$default = modifier4;
                }
                composer3.endReplaceGroup();
                if ((i20 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objRememberedValue10 = composer3.rememberedValue();
                if (z16 || objRememberedValue10 == companion.getEmpty()) {
                    objRememberedValue10 = new g0(function11, 26);
                    composer3.updateRememberedValue(objRememberedValue10);
                }
                Function1 function12 = (Function1) objRememberedValue10;
                if ((1879048192 & i4) == 536870912) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                objRememberedValue11 = composer3.rememberedValue();
                if (z17 || objRememberedValue11 == companion.getEmpty()) {
                    objRememberedValue11 = new v1(function9, mutableState2, 2);
                    composer3.updateRememberedValue(objRememberedValue11);
                }
                TrafficLayerConfig trafficLayerConfig5 = trafficLayerConfig4;
                Function1 function13 = function8;
                Function0 function14 = function9;
                Function1 function15 = function11;
                Composer composer4 = composer3;
                GoogleMapKt.a(modifierComposed$default, cameraPositionState2, null, mapProperties2, mapUiSettings2, null, function12, (Function0) objRememberedValue11, null, null, ComposableLambdaKt.rememberComposableLambda(1975234955, true, new h5(1, trafficLayerConfig4, list, markerList), composer3, 54), composer4, 0, 100663296);
                composer2 = composer4;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                trafficLayerConfig3 = trafficLayerConfig5;
                modifier2 = modifier4;
                function4 = function13;
                function7 = function14;
                function6 = function15;
                function5 = function10;
                z5 = z10;
                z6 = z11;
                chaloMapOverlayConfig2 = chaloMapOverlayConfig4;
            } else {
                composer2 = composerStartRestartGroup;
                composer2.skipToGroupEnd();
                chaloMapOverlayConfig2 = chaloMapOverlayConfig;
                z5 = z2;
                function4 = function1;
                function5 = function2;
                function6 = function3;
                trafficLayerConfig3 = trafficLayerConfig2;
                z6 = z3;
                function7 = function0;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final Modifier modifier6 = modifier2;
                final ChaloMapOverlayConfig chaloMapOverlayConfig6 = chaloMapOverlayConfig2;
                final int i27 = 1;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cl
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Composer composer5 = (Composer) obj;
                        switch (i27) {
                            case 0:
                                ((Integer) obj2).getClass();
                                ChaloMap_androidKt.b(modifier6, mapPolylinePoints, z6, mapCameraViewState, markerList, trafficLayerConfig3, chaloMapOverlayConfig6, z5, function4, function7, function5, function6, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                ChaloMap_androidKt.b(modifier6, mapPolylinePoints, z6, mapCameraViewState, markerList, trafficLayerConfig3, chaloMapOverlayConfig6, z5, function4, function7, function5, function6, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                break;
                        }
                        return Unit.f17538a;
                    }
                });
            }
        }
        i4 |= 384;
        z3 = z;
        if ((i & 3072) == 0) {
            if (composerStartRestartGroup.changed(mapCameraViewState)) {
                i23 = 2048;
            } else {
                i23 = 1024;
            }
            i4 |= i23;
        }
        if ((i & 24576) == 0) {
            if (composerStartRestartGroup.changedInstance(markerList)) {
                i22 = 16384;
            } else {
                i22 = 8192;
            }
            i4 |= i22;
        }
        i5 = i3 & 32;
        if (i5 != 0) {
            i4 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            trafficLayerConfig2 = trafficLayerConfig;
        } else {
            trafficLayerConfig2 = trafficLayerConfig;
            if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                if (composerStartRestartGroup.changed(trafficLayerConfig2)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
        }
        i7 = i3 & 64;
        if (i7 != 0) {
            i4 |= 1572864;
        } else if ((i & 1572864) == 0) {
            if (composerStartRestartGroup.changed(chaloMapOverlayConfig)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i4 |= i8;
        }
        i9 = i3 & 128;
        if (i9 != 0) {
            i4 |= 12582912;
        } else if ((i & 12582912) == 0) {
            if (composerStartRestartGroup.changed(z2)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i4 |= i10;
        }
        i11 = i3 & 256;
        if (i11 != 0) {
            i4 |= 100663296;
        } else if ((i & 100663296) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i12 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i12 = 33554432;
            }
            i4 |= i12;
        }
        i13 = i3 & 512;
        if (i13 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i4 |= i14;
        }
        i15 = i3 & 1024;
        if (i15 != 0) {
            i16 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i16 = i2 | i17;
        } else {
            i16 = i2;
        }
        i18 = i3 & 2048;
        if (i18 != 0) {
            i16 |= 48;
        } else if ((i2 & 48) != 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i16 |= i19;
        }
        i20 = i16;
        if ((i4 & 306783379) == 306783378) {
            z4 = true;
        } else {
            z4 = true;
        }
        if (composerStartRestartGroup.shouldExecute(z4, i4 & 1)) {
            if (i24 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i25 != 0) {
                z7 = false;
            } else {
                z7 = z3;
            }
            if (i5 != 0) {
                trafficLayerConfig4 = new TrafficLayerConfig();
            } else {
                trafficLayerConfig4 = trafficLayerConfig2;
            }
            if (i7 == 0) {
            }
            if (i9 != 0) {
                z8 = false;
            } else {
                z8 = z2;
            }
            if (i11 != 0) {
                objRememberedValue15 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue15 = new bj(22);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue15);
                }
                function8 = (Function1) objRememberedValue15;
            } else {
                function8 = function1;
            }
            if (i13 != 0) {
                objRememberedValue14 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue14 = new wb(8);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue14);
                }
                boolean z24 = z8;
                function9 = (Function0) objRememberedValue14;
                z9 = z24;
            } else {
                z9 = z8;
                function9 = function0;
            }
            if (i15 == 0) {
                function10 = function2;
            }
            if (i18 != 0) {
                objRememberedValue13 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue13 = new bj(23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue13);
                }
                function11 = (Function1) objRememberedValue13;
                composer3 = composerStartRestartGroup;
            } else {
                composer3 = composerStartRestartGroup;
                function11 = function3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-266189038, i4, i20, "app.chalo.compose.components.chalomap.ChaloMap (ChaloMap.android.kt:94)");
            }
            if (mapCameraViewState.equals(MapCameraViewState.InitialState.NoState.f1881a)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                scopeUpdateScopeEndRestartGroup2 = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    final int i28 = 0;
                    final boolean z25 = z9;
                    final Modifier modifier7 = modifier3;
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: cl
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Composer composer5 = (Composer) obj;
                            switch (i28) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    ChaloMap_androidKt.b(modifier7, mapPolylinePoints, z7, mapCameraViewState, markerList, trafficLayerConfig4, chaloMapOverlayConfig3, z25, function8, function9, function10, function11, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    ChaloMap_androidKt.b(modifier7, mapPolylinePoints, z7, mapCameraViewState, markerList, trafficLayerConfig4, chaloMapOverlayConfig3, z25, function8, function9, function10, function11, composer5, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    break;
                            }
                            return Unit.f17538a;
                        }
                    });
                    return;
                }
                return;
            }
            modifier4 = modifier3;
            z10 = z9;
            z11 = z7;
            zChanged = composer3.changed(mapPolylinePoints);
            objRememberedValue = composer3.rememberedValue();
            if (zChanged) {
                composer3.updateRememberedValue(mapPolylinePoints);
                objRememberedValue = mapPolylinePoints;
            } else {
                composer3.updateRememberedValue(mapPolylinePoints);
                objRememberedValue = mapPolylinePoints;
            }
            List list2 = (List) objRememberedValue;
            objRememberedValue2 = composer3.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue2);
            }
            mutableState = (MutableState) objRememberedValue2;
            objRememberedValue3 = composer3.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composer3.updateRememberedValue(objRememberedValue3);
            }
            mutableState2 = (MutableState) objRememberedValue3;
            objRememberedValue4 = composer3.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composer3.updateRememberedValue(objRememberedValue4);
            }
            mutableFloatState = (MutableFloatState) objRememberedValue4;
            objRememberedValue5 = composer3.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new ProjectionUtilsAndroid();
                composer3.updateRememberedValue(objRememberedValue5);
            }
            projectionUtilsAndroid = (ProjectionUtilsAndroid) objRememberedValue5;
            final a aVar2 = new a(mapCameraViewState, function8, mutableState);
            cameraPositionState = (CameraPositionState) RememberSaveableKt.m4084rememberSaveable(new Object[0], CameraPositionState.h, (Function0) new Function0<CameraPositionState>() { // from class: app.chalo.compose.components.chalomap.ChaloMap_androidKt$ChaloMap$$inlined$rememberCameraPositionState$1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Saver saver = CameraPositionState.h;
                    CameraPositionState cameraPositionStateA = CameraPositionState.Companion.a();
                    aVar2.invoke(cameraPositionStateA);
                    return cameraPositionStateA;
                }
            }, composer3, 0);
            i21 = 3670016 & i4;
            if (i21 == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            objRememberedValue6 = composer3.rememberedValue();
            if (z12) {
                objRememberedValue6 = new ChaloMap_androidKt$ChaloMap$7$1(chaloMapOverlayConfig3, mutableFloatState, null);
                composer3.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new ChaloMap_androidKt$ChaloMap$7$1(chaloMapOverlayConfig3, mutableFloatState, null);
                composer3.updateRememberedValue(objRememberedValue6);
            }
            EffectsKt.LaunchedEffect(chaloMapOverlayConfig3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer3, (i4 >> 18) & 14);
            if ((i20 & 14) == 4) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i21 == 1048576) {
                z14 = true;
            } else {
                z14 = false;
            }
            zChangedInstance = z13 | z14 | composer3.changedInstance(cameraPositionState);
            objRememberedValue7 = composer3.rememberedValue();
            if (zChangedInstance) {
                ChaloMapOverlayConfig chaloMapOverlayConfig7 = chaloMapOverlayConfig3;
                objRememberedValue7 = new ChaloMap_androidKt$ChaloMap$8$1(function10, chaloMapOverlayConfig7, cameraPositionState, projectionUtilsAndroid, mutableFloatState, null);
                chaloMapOverlayConfig4 = chaloMapOverlayConfig7;
                cameraPositionState2 = cameraPositionState;
                composer3.updateRememberedValue(objRememberedValue7);
            } else {
                ChaloMapOverlayConfig chaloMapOverlayConfig8 = chaloMapOverlayConfig3;
                objRememberedValue7 = new ChaloMap_androidKt$ChaloMap$8$1(function10, chaloMapOverlayConfig8, cameraPositionState, projectionUtilsAndroid, mutableFloatState, null);
                chaloMapOverlayConfig4 = chaloMapOverlayConfig8;
                cameraPositionState2 = cameraPositionState;
                composer3.updateRememberedValue(objRememberedValue7);
            }
            EffectsKt.LaunchedEffect(cameraPositionState2, chaloMapOverlayConfig4, (Function2) objRememberedValue7, composer3, (i4 >> 15) & 112);
            zChanged2 = composer3.changed(trafficLayerConfig4.f9964a);
            objRememberedValue8 = composer3.rememberedValue();
            if (zChanged2) {
                MapProperties mapProperties3 = new MapProperties(z11, trafficLayerConfig4.f9964a, new MapStyleOptions("[\n  {\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#d1d8dd\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#688695\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"weight\": 3\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#d1d8dd\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.man_made\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.man_made\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#bbbbbb\"\n      },\n      {\n        \"visibility\": \"on\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.natural.landcover\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.business\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#000000\"\n      },\n      {\n        \"visibility\": \"off\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#b3e08d\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.sports_complex\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#b3e08d\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f0f0f0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f8f8f8\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.line\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#a7a7a7\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.airport\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.bus\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.rail\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#9ec2e1\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  }\n]"), 467);
                composer3.updateRememberedValue(mapProperties3);
                objRememberedValue8 = mapProperties3;
            } else {
                MapProperties mapProperties4 = new MapProperties(z11, trafficLayerConfig4.f9964a, new MapStyleOptions("[\n  {\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#d1d8dd\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#688695\"\n      }\n    ]\n  },\n  {\n    \"elementType\": \"labels.text.stroke\",\n    \"stylers\": [\n      {\n        \"weight\": 3\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#d1d8dd\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.man_made\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.man_made\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#bbbbbb\"\n      },\n      {\n        \"visibility\": \"on\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"landscape.natural.landcover\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"visibility\": \"on\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.business\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#000000\"\n      },\n      {\n        \"visibility\": \"off\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.park\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#b3e08d\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"poi.sports_complex\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#b3e08d\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f0f0f0\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road\",\n    \"elementType\": \"geometry.stroke\",\n    \"stylers\": [\n      {\n        \"color\": \"#ffffff\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#f8f8f8\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"road.highway\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.line\",\n    \"elementType\": \"geometry\",\n    \"stylers\": [\n      {\n        \"color\": \"#a7a7a7\"\n      },\n      {\n        \"weight\": 0.5\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.airport\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.bus\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"transit.station.rail\",\n    \"elementType\": \"labels.icon\",\n    \"stylers\": [\n      {\n        \"visibility\": \"off\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"geometry.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#9ec2e1\"\n      }\n    ]\n  },\n  {\n    \"featureType\": \"water\",\n    \"elementType\": \"labels.text.fill\",\n    \"stylers\": [\n      {\n        \"color\": \"#757575\"\n      }\n    ]\n  }\n]"), 467);
                composer3.updateRememberedValue(mapProperties4);
                objRememberedValue8 = mapProperties4;
            }
            MapProperties mapProperties5 = (MapProperties) objRememberedValue8;
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                composer3.startReplaceGroup(-1523040687);
                cameraPosition = (CameraPosition) mutableState.getValue();
                if (cameraPosition != null) {
                    CameraUpdate cameraUpdateNewCameraPosition2 = CameraUpdateFactory.newCameraPosition(cameraPosition);
                    Intrinsics.h(cameraUpdateNewCameraPosition2, "newCameraPosition(...)");
                    function8.invoke(new AndroidCameraUpdate(cameraUpdateNewCameraPosition2));
                    mutableState.setValue(null);
                }
                boolean zChangedInstance3 = composer3.changedInstance(cameraPositionState2);
                if ((i4 & 7168) == 2048) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                boolean z26 = zChangedInstance3 | z18;
                if ((234881024 & i4) == 67108864) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                z20 = z26 | z19;
                objRememberedValue12 = composer3.rememberedValue();
                if (z20) {
                    objRememberedValue12 = new ChaloMap_androidKt$ChaloMap$10$1(cameraPositionState2, mapCameraViewState, function8, null);
                    composer3.updateRememberedValue(objRememberedValue12);
                } else {
                    objRememberedValue12 = new ChaloMap_androidKt$ChaloMap$10$1(cameraPositionState2, mapCameraViewState, function8, null);
                    composer3.updateRememberedValue(objRememberedValue12);
                }
                EffectsKt.LaunchedEffect(mapCameraViewState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue12, composer3, (i4 >> 9) & 14);
            } else {
                composer3.startReplaceGroup(-1531448848);
            }
            composer3.endReplaceGroup();
            if ((29360128 & i4) == 8388608) {
                z15 = true;
            } else {
                z15 = false;
            }
            objRememberedValue9 = composer3.rememberedValue();
            if (z15) {
                if (z10) {
                    mapUiSettings = new MapUiSettings(16);
                } else {
                    mapUiSettings = new MapUiSettings(754);
                }
                objRememberedValue9 = mapUiSettings;
                composer3.updateRememberedValue(objRememberedValue9);
            } else {
                if (z10) {
                    mapUiSettings = new MapUiSettings(16);
                } else {
                    mapUiSettings = new MapUiSettings(754);
                }
                objRememberedValue9 = mapUiSettings;
                composer3.updateRememberedValue(objRememberedValue9);
            }
            MapUiSettings mapUiSettings3 = (MapUiSettings) objRememberedValue9;
            composer3.startReplaceGroup(1890575436);
            if (chaloMapOverlayConfig4 == 0) {
                composer3.startReplaceGroup(346950847);
                composer3.endReplaceGroup();
                modifierComposed$default = null;
            } else {
                composer3.startReplaceGroup(346950848);
                final float floatValue2 = mutableFloatState.getFloatValue();
                final long jI3 = i(chaloMapOverlayConfig4.getF1871a(), composer3);
                b = chaloMapOverlayConfig4.getB();
                if (b == null) {
                    composer3.startReplaceGroup(-244334127);
                    composer3.endReplaceGroup();
                    colorM4595boximpl = null;
                } else {
                    composer3.startReplaceGroup(-2086091728);
                    long jI4 = i(b, composer3);
                    composer3.endReplaceGroup();
                    colorM4595boximpl = Color.m4595boximpl(jI4);
                }
                final IconType c2 = chaloMapOverlayConfig4.getC();
                modifierComposed$default = ComposedModifierKt.composed$default(modifier4, null, new Function3() { // from class: yk
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        Painter painterA;
                        Modifier composed = (Modifier) obj;
                        Composer composer5 = (Composer) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        Intrinsics.i(composed, "$this$composed");
                        composer5.startReplaceGroup(-1636992536);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1636992536, iIntValue, -1, "app.chalo.compose.components.chalomap.circleOverlay.<anonymous> (ChaloMap.android.kt:494)");
                        }
                        final Density density = (Density) composer5.consume(CompositionLocalsKt.getLocalDensity());
                        final float f = ChaloTheme.b(composer5, 6).b;
                        IconType iconType = c2;
                        if (iconType == null) {
                            composer5.startReplaceGroup(1709127191);
                            composer5.endReplaceGroup();
                            painterA = null;
                        } else {
                            composer5.startReplaceGroup(1709127192);
                            painterA = IconAssetHelper_androidKt.a(iconType, composer5, 0);
                            composer5.endReplaceGroup();
                        }
                        final Painter painter = painterA;
                        final long j = jI3;
                        boolean zChanged3 = composer5.changed(j);
                        final float f2 = floatValue2;
                        boolean zChanged4 = zChanged3 | composer5.changed(f2);
                        final Color color = colorM4595boximpl;
                        boolean zChanged5 = zChanged4 | composer5.changed(color) | composer5.changed(density) | composer5.changed(f) | composer5.changedInstance(painter);
                        Object objRememberedValue16 = composer5.rememberedValue();
                        if (zChanged5 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue16 = new Function1() { // from class: al
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    ContentDrawScope drawWithContent = (ContentDrawScope) obj4;
                                    Intrinsics.i(drawWithContent, "$this$drawWithContent");
                                    drawWithContent.drawContent();
                                    long j2 = j;
                                    float f3 = f2;
                                    DrawScope.CC.z(drawWithContent, j2, f3, 0L, 0.0f, null, null, 0, 124, null);
                                    Color color2 = color;
                                    if (color2 != null) {
                                        color2.m4615unboximpl();
                                        long jM4615unboximpl = color2.m4615unboximpl();
                                        Density toPixel = density;
                                        Intrinsics.i(toPixel, "$this$toPixel");
                                        DrawScope.CC.z(drawWithContent, jM4615unboximpl, f3, 0L, 0.0f, new Stroke(toPixel.mo404toPx0680j_4(f), 0.0f, 0, 0, null, 30, null), null, 0, 108, null);
                                    }
                                    Painter painter2 = painter;
                                    if (painter2 != null) {
                                        float f4 = 2;
                                        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawWithContent.mo5072getCenterF1C5BW0() >> 32)) - (Float.intBitsToFloat((int) (painter2.getB() >> 32)) / f4);
                                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (drawWithContent.mo5072getCenterF1C5BW0() & BodyPartID.bodyIdMax)) - (Float.intBitsToFloat((int) (painter2.getB() & BodyPartID.bodyIdMax)) / f4);
                                        drawWithContent.getDrawContext().getTransform().translate(fIntBitsToFloat, fIntBitsToFloat2);
                                        try {
                                            Painter.m5223drawx_KDEd0$default(painter2, drawWithContent, painter2.getB(), 0.0f, null, 6, null);
                                        } finally {
                                            drawWithContent.getDrawContext().getTransform().translate(-fIntBitsToFloat, -fIntBitsToFloat2);
                                        }
                                    }
                                    return Unit.f17538a;
                                }
                            };
                            composer5.updateRememberedValue(objRememberedValue16);
                        }
                        Modifier modifierDrawWithContent = DrawModifierKt.drawWithContent(composed, (Function1) objRememberedValue16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer5.endReplaceGroup();
                        return modifierDrawWithContent;
                    }
                }, 1, null);
                composer3.endReplaceGroup();
            }
            if (modifierComposed$default == null) {
                modifierComposed$default = modifier4;
            }
            composer3.endReplaceGroup();
            if ((i20 & 112) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            objRememberedValue10 = composer3.rememberedValue();
            if (z16) {
                objRememberedValue10 = new g0(function11, 26);
                composer3.updateRememberedValue(objRememberedValue10);
            } else {
                objRememberedValue10 = new g0(function11, 26);
                composer3.updateRememberedValue(objRememberedValue10);
            }
            Function1 function16 = (Function1) objRememberedValue10;
            if ((1879048192 & i4) == 536870912) {
                z17 = true;
            } else {
                z17 = false;
            }
            objRememberedValue11 = composer3.rememberedValue();
            if (z17) {
                objRememberedValue11 = new v1(function9, mutableState2, 2);
                composer3.updateRememberedValue(objRememberedValue11);
            } else {
                objRememberedValue11 = new v1(function9, mutableState2, 2);
                composer3.updateRememberedValue(objRememberedValue11);
            }
            TrafficLayerConfig trafficLayerConfig6 = trafficLayerConfig4;
            Function1 function17 = function8;
            Function0 function18 = function9;
            Function1 function19 = function11;
            Composer composer5 = composer3;
            GoogleMapKt.a(modifierComposed$default, cameraPositionState2, null, mapProperties5, mapUiSettings3, null, function16, (Function0) objRememberedValue11, null, null, ComposableLambdaKt.rememberComposableLambda(1975234955, true, new h5(1, trafficLayerConfig4, list2, markerList), composer3, 54), composer5, 0, 100663296);
            composer2 = composer5;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            trafficLayerConfig3 = trafficLayerConfig6;
            modifier2 = modifier4;
            function4 = function17;
            function7 = function18;
            function6 = function19;
            function5 = function10;
            z5 = z10;
            z6 = z11;
            chaloMapOverlayConfig2 = chaloMapOverlayConfig4;
        } else {
            composer2 = composerStartRestartGroup;
            composer2.skipToGroupEnd();
            chaloMapOverlayConfig2 = chaloMapOverlayConfig;
            z5 = z2;
            function4 = function1;
            function5 = function2;
            function6 = function3;
            trafficLayerConfig3 = trafficLayerConfig2;
            z6 = z3;
            function7 = function0;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier8 = modifier2;
            final ChaloMapOverlayConfig chaloMapOverlayConfig9 = chaloMapOverlayConfig2;
            final int i29 = 1;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: cl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer6 = (Composer) obj;
                    switch (i29) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ChaloMap_androidKt.b(modifier8, mapPolylinePoints, z6, mapCameraViewState, markerList, trafficLayerConfig3, chaloMapOverlayConfig9, z5, function4, function7, function5, function6, composer6, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            ChaloMap_androidKt.b(modifier8, mapPolylinePoints, z6, mapCameraViewState, markerList, trafficLayerConfig3, chaloMapOverlayConfig9, z5, function4, function7, function5, function6, composer6, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            break;
                    }
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void c(ChaloMapUIState state, Modifier modifier, Composer composer, int i) {
        int i2;
        Intrinsics.i(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(2102271741);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2102271741, i2, -1, "app.chalo.compose.components.chalomap.ChaloMap (ChaloMap.android.kt:60)");
            }
            List list = state.f9962a;
            MapCameraViewState mapCameraViewState = state.c;
            List list2 = state.d;
            boolean z = state.b;
            ChaloMapOverlayConfig chaloMapOverlayConfig = state.e;
            TrafficLayerConfig trafficLayerConfig = state.f;
            ChaloMapUIEventHandler chaloMapUIEventHandler = state.g;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(chaloMapUIEventHandler);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                ChaloMap_androidKt$ChaloMap$1$1$1 chaloMap_androidKt$ChaloMap$1$1$1 = new ChaloMap_androidKt$ChaloMap$1$1$1(1, chaloMapUIEventHandler, ChaloMapUIEventHandler.class, "mapCameraUpdateLoaded", "mapCameraUpdateLoaded(Lapp/chalo/compose/components/chalomap/MapCameraUpdate;)V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloMap_androidKt$ChaloMap$1$1$1);
                objRememberedValue = chaloMap_androidKt$ChaloMap$1$1$1;
            }
            KFunction kFunction = (KFunction) objRememberedValue;
            ChaloMapUIEventHandler chaloMapUIEventHandler2 = state.g;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(chaloMapUIEventHandler2);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                ChaloMap_androidKt$ChaloMap$1$2$1 chaloMap_androidKt$ChaloMap$1$2$1 = new ChaloMap_androidKt$ChaloMap$1$2$1(0, chaloMapUIEventHandler2, ChaloMapUIEventHandler.class, "mapLoaded", "mapLoaded()V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloMap_androidKt$ChaloMap$1$2$1);
                objRememberedValue2 = chaloMap_androidKt$ChaloMap$1$2$1;
            }
            KFunction kFunction2 = (KFunction) objRememberedValue2;
            ChaloMapUIEventHandler chaloMapUIEventHandler3 = state.g;
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(chaloMapUIEventHandler3);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                ChaloMap_androidKt$ChaloMap$1$3$1 chaloMap_androidKt$ChaloMap$1$3$1 = new ChaloMap_androidKt$ChaloMap$1$3$1(1, chaloMapUIEventHandler3, ChaloMapUIEventHandler.class, "cameraPositionStateChange", "cameraPositionStateChange(Lapp/chalo/compose/components/chalomap/ChaloMapCameraPositionStateData;)V", 0);
                composerStartRestartGroup.updateRememberedValue(chaloMap_androidKt$ChaloMap$1$3$1);
                objRememberedValue3 = chaloMap_androidKt$ChaloMap$1$3$1;
            }
            Function1 function1 = (Function1) kFunction;
            Function0 function0 = (Function0) kFunction2;
            Function1 function2 = (Function1) ((KFunction) objRememberedValue3);
            boolean zChanged = composerStartRestartGroup.changed(state);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new ch(state, 13);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            b(modifier, list, z, mapCameraViewState, list2, trafficLayerConfig, chaloMapOverlayConfig, false, function1, function0, function2, (Function1) objRememberedValue4, composerStartRestartGroup, (i2 >> 3) & 14, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new fj(state, modifier, false, i, 7));
        }
    }

    public static final void d(final MarkerState markerState, final BitmapDescriptor bitmapDescriptor, final long j, final long j2, final float f, final ChaloMapMarkerInfoWindow chaloMapMarkerInfoWindow, final Function0 function0, final Function0 function1, final Function0 function2, Composer composer, final int i) {
        int i2;
        BitmapDescriptor bitmapDescriptor2;
        long j3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1032923229);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(markerState) : composerStartRestartGroup.changedInstance(markerState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            bitmapDescriptor2 = bitmapDescriptor;
            i2 |= composerStartRestartGroup.changedInstance(bitmapDescriptor2) ? 32 : 16;
        } else {
            bitmapDescriptor2 = bitmapDescriptor;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            j3 = j2;
            i2 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
        } else {
            j3 = j2;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(f) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i2 |= composerStartRestartGroup.changed(chaloMapMarkerInfoWindow) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 38347923) != 38347922, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1032923229, i2, -1, "app.chalo.compose.components.chalomap.MapMarkerInfoWindow (ChaloMap.android.kt:465)");
            }
            boolean z = (i2 & 3670016) == 1048576;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l6(function0, 3);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function3 = (Function1) objRememberedValue;
            boolean z2 = (i2 & 29360128) == 8388608;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new l6(function1, 4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function1 function4 = (Function1) objRememberedValue2;
            boolean z3 = (234881024 & i2) == 67108864;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new l6(function2, 5);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function1 function5 = (Function1) objRememberedValue3;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(1583076539, true, new c6(chaloMapMarkerInfoWindow, 10), composerStartRestartGroup, 54);
            Saver saver = MarkerState.e;
            MarkerKt.b(0.0f, f, ((i2 << 12) & 29360128) | (i2 & 910) | ((i2 << 15) & 3670016), ((i2 >> 3) & 7168) | 100663296, j, j3, composerStartRestartGroup, bitmapDescriptor2, markerState, null, function3, function4, function5, null, composableLambdaRememberComposableLambda, false);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: bl
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ChaloMap_androidKt.d(markerState, bitmapDescriptor, j, j2, f, chaloMapMarkerInfoWindow, function0, function1, function2, (Composer) obj, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                    return Unit.f17538a;
                }
            });
        }
    }

    public static final void e(List markerList, Composer composer, int i) {
        int i2;
        Intrinsics.i(markerList, "markerList");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1928679752);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(markerList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1928679752, i2, -1, "app.chalo.compose.components.chalomap.MapMarkers (ChaloMap.android.kt:342)");
            }
            Iterator it = markerList.iterator();
            while (it.hasNext()) {
                ChaloMapMarkerUIState chaloMapMarkerUIState = (ChaloMapMarkerUIState) it.next();
                composerStartRestartGroup.startMovableGroup(-287990825, chaloMapMarkerUIState.getF4901a());
                if (chaloMapMarkerUIState.getG()) {
                    composerStartRestartGroup.startReplaceGroup(-337705899);
                    a(chaloMapMarkerUIState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(-337630414);
                    f(chaloMapMarkerUIState, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endMovableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new eh(markerList, i, 3));
        }
    }

    public static final void f(ChaloMapMarkerUIState chaloMapMarkerUIState, Composer composer, int i) {
        int i2;
        BitmapDescriptor bitmapDescriptorFromResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-616029498);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(chaloMapMarkerUIState) : composerStartRestartGroup.changedInstance(chaloMapMarkerUIState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = true;
        if (composerStartRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-616029498, i2, -1, "app.chalo.compose.components.chalomap.StandardMapMarker (ChaloMap.android.kt:357)");
            }
            LatLng position = chaloMapMarkerUIState.getB().b();
            if (false & true) {
                position = new LatLng(0.0d, 0.0d);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1974742690, 0, -1, "com.google.maps.android.compose.rememberUpdatedMarkerState (Marker.kt:219)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                Saver saver = MarkerState.e;
                Intrinsics.i(position, "position");
                objRememberedValue = new MarkerState(position);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MarkerState markerState = (MarkerState) objRememberedValue;
            markerState.d(position);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ChaloMapMarkerIconType c = chaloMapMarkerUIState.getC();
            if (c instanceof ChaloMapMarkerIconType.BitmapRes) {
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromBitmap(((ChaloMapMarkerIconType.BitmapRes) c).f1866a.f1884a);
            } else {
                if (!(c instanceof ChaloMapMarkerIconType.DrawableRes)) {
                    throw new NoWhenBranchMatchedException();
                }
                bitmapDescriptorFromResource = BitmapDescriptorFactory.fromResource(g(((ChaloMapMarkerIconType.DrawableRes) c).f1867a));
            }
            Intrinsics.f(bitmapDescriptorFromResource);
            long jM4357constructorimpl = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(chaloMapMarkerUIState.getD().f1883a)) << 32) | (((long) Float.floatToRawIntBits(chaloMapMarkerUIState.getD().b)) & BodyPartID.bodyIdMax));
            ChaloMapMarkerUIEventHandler f = chaloMapMarkerUIState.getF();
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(f);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ChaloMap_androidKt$StandardMapMarker$1$1(0, f, ChaloMapMarkerUIEventHandler.class, "markerClicked", "markerClicked()Z", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            KFunction kFunction = (KFunction) objRememberedValue2;
            long jM4357constructorimpl2 = Offset.m4357constructorimpl((((long) Float.floatToRawIntBits(chaloMapMarkerUIState.getG().f1883a)) << 32) | (((long) Float.floatToRawIntBits(chaloMapMarkerUIState.getG().b)) & BodyPartID.bodyIdMax));
            ChaloMapMarkerUIEventHandler f2 = chaloMapMarkerUIState.getF();
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(f2);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new ChaloMap_androidKt$StandardMapMarker$2$1(0, f2, ChaloMapMarkerUIEventHandler.class, "infoWindowClicked", "infoWindowClicked()V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            KFunction kFunction2 = (KFunction) objRememberedValue3;
            ChaloMapMarkerUIEventHandler f3 = chaloMapMarkerUIState.getF();
            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(f3);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new ChaloMap_androidKt$StandardMapMarker$3$1(0, f3, ChaloMapMarkerUIEventHandler.class, "infoWindowClosed", "infoWindowClosed()V", 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            Saver saver2 = MarkerState.e;
            int i3 = i2;
            d(markerState, bitmapDescriptorFromResource, jM4357constructorimpl, jM4357constructorimpl2, chaloMapMarkerUIState.getH(), chaloMapMarkerUIState.getF(), (Function0) kFunction, (Function0) kFunction2, (Function0) ((KFunction) objRememberedValue4), composerStartRestartGroup, 0);
            int i4 = i3 & 14;
            if (i4 != 4 && ((i3 & 8) == 0 || !composerStartRestartGroup.changedInstance(chaloMapMarkerUIState))) {
                z = false;
            }
            boolean zChangedInstance4 = z | composerStartRestartGroup.changedInstance(markerState);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue5 = new ChaloMap_androidKt$StandardMapMarker$4$1(chaloMapMarkerUIState, markerState, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.LaunchedEffect(chaloMapMarkerUIState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composerStartRestartGroup, i4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new zk(chaloMapMarkerUIState, i, 0));
        }
    }

    public static final int g(IconType iconType) {
        switch (WhenMappings.f1875a[iconType.ordinal()]) {
            case 1:
                return R.drawable.start;
            case 2:
                return R.drawable.end;
            case 3:
                return R.drawable.stop_marker_route_details;
            case 4:
                return R.drawable.bus_nearby_selected;
            case 5:
                return R.drawable.stop_marker_route_details_disabled;
            case 6:
                return R.drawable.bus_nearby;
            case 7:
                return R.drawable.auto_nearby;
            case 8:
                return R.drawable.walk_nearby;
            case 9:
                return R.drawable.metro_nearby;
            case 10:
                return R.drawable.cab_nearby;
            case 11:
                return R.drawable.ferry_nearby_selected;
            case 12:
                return R.drawable.monorail_nearby;
            case 13:
                return R.drawable.train_nearby;
            case 14:
                return R.drawable.traffic_signal;
            case 15:
                return R.drawable.boarding_marker;
            case 16:
                return R.drawable.deboarding_marker;
            default:
                return -1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(CameraPositionState cameraPositionState, MapCameraViewState mapCameraViewState, Function1 function1, ContinuationImpl continuationImpl) {
        ChaloMap_androidKt$handleMapCameraViewState$1 chaloMap_androidKt$handleMapCameraViewState$1;
        CameraUpdate cameraUpdateNewCameraPosition;
        CameraUpdate cameraUpdate;
        if (continuationImpl instanceof ChaloMap_androidKt$handleMapCameraViewState$1) {
            chaloMap_androidKt$handleMapCameraViewState$1 = (ChaloMap_androidKt$handleMapCameraViewState$1) continuationImpl;
            int i = chaloMap_androidKt$handleMapCameraViewState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                chaloMap_androidKt$handleMapCameraViewState$1.label = i - Integer.MIN_VALUE;
            } else {
                chaloMap_androidKt$handleMapCameraViewState$1 = new ChaloMap_androidKt$handleMapCameraViewState$1(continuationImpl);
            }
        } else {
            chaloMap_androidKt$handleMapCameraViewState$1 = new ChaloMap_androidKt$handleMapCameraViewState$1(continuationImpl);
        }
        Object obj = chaloMap_androidKt$handleMapCameraViewState$1.result;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = chaloMap_androidKt$handleMapCameraViewState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            if (mapCameraViewState instanceof MapCameraViewState.UpdatedState) {
                MapCameraViewState.UpdatedState updatedState = (MapCameraViewState.UpdatedState) mapCameraViewState;
                if (updatedState instanceof MapCameraViewState.UpdatedState.CustomPosition) {
                    MapCameraViewState.UpdatedState.CustomPosition customPosition = (MapCameraViewState.UpdatedState.CustomPosition) mapCameraViewState;
                    cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(new CameraPosition(customPosition.b.b(), customPosition.c, 0.0f, 0.0f));
                } else if (updatedState instanceof MapCameraViewState.UpdatedState.BoundToCustomLatLngs) {
                    ChaloMapLatLngBoundsDetails chaloMapLatLngBoundsDetails = ((MapCameraViewState.UpdatedState.BoundToCustomLatLngs) mapCameraViewState).b;
                    cameraUpdateNewCameraPosition = CameraUpdateFactory.newLatLngBounds((LatLngBounds) chaloMapLatLngBoundsDetails.f1863a.c.getValue(), chaloMapLatLngBoundsDetails.b);
                } else if (updatedState instanceof MapCameraViewState.UpdatedState.ZoomToLatLng) {
                    MapCameraViewState.UpdatedState.ZoomToLatLng zoomToLatLng = (MapCameraViewState.UpdatedState.ZoomToLatLng) mapCameraViewState;
                    cameraUpdateNewCameraPosition = CameraUpdateFactory.newLatLngZoom(zoomToLatLng.b.b(), zoomToLatLng.c);
                } else if (updatedState.equals(MapCameraViewState.UpdatedState.NoChange.b)) {
                    cameraUpdateNewCameraPosition = null;
                } else if (updatedState instanceof MapCameraViewState.UpdatedState.CustomCameraUpdate) {
                    MapCameraUpdate mapCameraUpdate = ((MapCameraViewState.UpdatedState.CustomCameraUpdate) mapCameraViewState).b;
                    AndroidCameraUpdate androidCameraUpdate = mapCameraUpdate instanceof AndroidCameraUpdate ? (AndroidCameraUpdate) mapCameraUpdate : null;
                    if (androidCameraUpdate != null) {
                        cameraUpdateNewCameraPosition = androidCameraUpdate.f1859a;
                    } else {
                        cameraUpdateNewCameraPosition = null;
                    }
                } else {
                    if (!(updatedState instanceof MapCameraViewState.UpdatedState.CameraPosition)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CameraPosition cameraPosition = ((MapCameraViewState.UpdatedState.CameraPosition) mapCameraViewState).b.f1860a;
                    if (cameraPosition != null) {
                        cameraUpdateNewCameraPosition = CameraUpdateFactory.newCameraPosition(cameraPosition);
                    } else {
                        cameraUpdateNewCameraPosition = null;
                    }
                }
                if (cameraUpdateNewCameraPosition != null) {
                    if (updatedState.getF1882a()) {
                        chaloMap_androidKt$handleMapCameraViewState$1.L$0 = function1;
                        chaloMap_androidKt$handleMapCameraViewState$1.L$1 = cameraUpdateNewCameraPosition;
                        chaloMap_androidKt$handleMapCameraViewState$1.label = 1;
                        if (cameraPositionState.a(cameraUpdateNewCameraPosition, 1000, chaloMap_androidKt$handleMapCameraViewState$1) == obj2) {
                            return obj2;
                        }
                        cameraUpdate = cameraUpdateNewCameraPosition;
                    } else {
                        cameraPositionState.c(cameraUpdateNewCameraPosition);
                    }
                    function1.invoke(new AndroidCameraUpdate(cameraUpdateNewCameraPosition));
                }
            }
            return Unit.f17538a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cameraUpdate = (CameraUpdate) chaloMap_androidKt$handleMapCameraViewState$1.L$1;
        function1 = (Function1) chaloMap_androidKt$handleMapCameraViewState$1.L$0;
        ResultKt.b(obj);
        cameraUpdateNewCameraPosition = cameraUpdate;
        function1.invoke(new AndroidCameraUpdate(cameraUpdateNewCameraPosition));
        return Unit.f17538a;
    }

    public static final long i(MapOverlayColor mapOverlayColor, Composer composer) {
        long j;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(48512739, 0, -1, "app.chalo.compose.components.chalomap.toColor (ChaloMap.android.kt:549)");
        }
        int i = WhenMappings.b[mapOverlayColor.ordinal()];
        if (i == 1) {
            composer.startReplaceGroup(-623894190);
            j = ChaloTheme.a(composer, 6).j0;
            composer.endReplaceGroup();
        } else {
            if (i != 2) {
                throw pk0.p(composer, -623896298);
            }
            composer.startReplaceGroup(-623891592);
            j = ChaloTheme.a(composer, 6).k0;
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j;
    }
}

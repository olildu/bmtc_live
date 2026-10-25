package defpackage;

import android.media.AudioDeviceInfo;
import androidx.media3.common.Format;
import androidx.media3.common.util.Clock;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioOffloadSupport;
import androidx.media3.exoplayer.audio.AudioSink;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class c8 {
    public static AudioOffloadSupport a(AudioSink audioSink, Format format) {
        return AudioOffloadSupport.DEFAULT_UNSUPPORTED;
    }

    public static void b(AudioSink audioSink) {
    }

    public static void c(AudioSink audioSink, Clock clock) {
    }

    public static void e(AudioSink audioSink, int i) {
    }

    public static void f(AudioSink audioSink, long j) {
    }

    public static void g(AudioSink audioSink, PlayerId playerId) {
    }

    public static void h(AudioSink audioSink, AudioDeviceInfo audioDeviceInfo) {
    }

    public static void d(AudioSink audioSink, int i, int i2) {
    }
}
